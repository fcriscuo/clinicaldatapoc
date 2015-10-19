package org.mskcc.cbio.clinicaldata.crdb.rdbms.util;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.sql.SQLException;

/**
 * Copyright (c) 2014 Memorial Sloan-Kettering Cancer Center.
 * <p/>
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY, WITHOUT EVEN THE IMPLIED WARRANTY OF
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE.  The software and
 * documentation provided hereunder is on an "as is" basis, and
 * Memorial Sloan-Kettering Cancer Center
 * has no obligations to provide maintenance, support,
 * updates, enhancements or modifications.  In no event shall
 * Memorial Sloan-Kettering Cancer Center
 * be liable to any party for direct, indirect, special,
 * incidental or consequential damages, including lost profits, arising
 * out of the use of this software and its documentation, even if
 * Memorial Sloan-Kettering Cancer Center
 * has been advised of the possibility of such damage.
 * <p/>
 * Created by criscuof on 02/22/15.
 */
public enum CrdbSessionManager {
    /*
    A Singleton implemented as an enum to provide access to a CRDB SQL
    session object
     */
            INSTANCE;
    private static final Logger logger = Logger.getLogger(CrdbSessionManager.class);
    private SqlSession session = Suppliers.memoize(new CrdbSessionSupplier()).get();

    public SqlSession getCrdbSession() {
        return this.session;
    }

    public void closeSession() {
        this.session.close();
        logger.info("The CRDB SQL session has been closed.");
    }

    /*
    Inner class responsible for supplying an open Session to the CRDB database via an iBatis
    configuration file

     */
    private class CrdbSessionSupplier implements Supplier<SqlSession> {
        //TODO: make this a property
        private final String crdbConfigFile = "/crdb-conn/crdb-mybatis-config.xml";
        public SqlSession get() {
            InputStream inputStream = CrdbSessionSupplier.class.getResourceAsStream(crdbConfigFile);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory.openSession();
        }
    }

    // main method for testing
    public static void main(String... args) {
        SqlSession session = CrdbSessionManager.INSTANCE.getCrdbSession();
        try {
            logger.info("The session is open? " + !session.getConnection().isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        CrdbSessionManager.INSTANCE.closeSession();
    }
}
