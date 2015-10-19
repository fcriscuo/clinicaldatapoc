package org.mskcc.cbio.clinicaldata.crdb.cache;

import com.google.common.base.Optional;
import com.google.common.base.Strings;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.apache.log4j.Logger;
import org.mskcc.cbio.clinicaldata.common.CacheCommon;
import org.mskcc.cbio.clinicaldata.crdb.rdbms.dao.cbioint.CrdbDatasetMapper;
import org.mskcc.cbio.clinicaldata.crdb.rdbms.model.cbioint.CrdbDataset;
import org.mskcc.cbio.clinicaldata.crdb.rdbms.model.cbioint.CrdbDatasetExample;
import org.mskcc.cbio.clinicaldata.crdb.rdbms.util.CrdbSessionManager;

import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * Copyright (c) 2015 Memorial Sloan-Kettering Cancer Center.
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
 * Created by Fred Criscuolo on 4/24/15.
 * criscuof@mskcc.org
 */
public enum CrdbDataService {
    INSTANCE;
    private static final Logger logger = Logger.getLogger(CrdbDataService.class);
    // cache for CRDB Dataset data
    private CrdbDatasetExample crdbDatasetExample = new CrdbDatasetExample();
    private CrdbDatasetMapper crdbDatasetMapper = CrdbSessionManager.INSTANCE.getCrdbSession()
            .getMapper(CrdbDatasetMapper.class);



    public Optional<CrdbDataset> resolveCrdbDatasetRecord(String cvrPatientId) {
        if (!Strings.isNullOrEmpty(cvrPatientId)) {
            try {
                Optional<CrdbDataset> dsOpt = crdbDatasetCache.get(cvrPatientId);
                if (dsOpt.isPresent()) {
                    return dsOpt;
                }
            } catch (ExecutionException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }
        }
        return Optional.absent();
    }

    private LoadingCache<String, Optional<CrdbDataset>> crdbDatasetCache = CacheBuilder.newBuilder()
            .maximumSize(CacheCommon.MAX_CACHE_SIZE)
            .build(new CacheLoader<String, Optional<CrdbDataset>>() {
                @Override
                public Optional<CrdbDataset> load(String key) throws Exception {
                    if (!Strings.isNullOrEmpty(key)) {
                        crdbDatasetExample.clear();
                        crdbDatasetExample.createCriteria().andDMP_IDEqualTo(key);
                        List<CrdbDataset> resultList = crdbDatasetMapper.selectByExample(crdbDatasetExample);
                        if (null != resultList && resultList.size() > 0) {
                            return Optional.of(resultList.get(0));
                        }
                    }
                    return Optional.absent();
                }
            });



    public static void main(String...args) {
        String testPatientId = "P-0002603";
        //CRDB Dataset
        Optional<CrdbDataset> crdbDsOpt = CrdbDataService.INSTANCE.resolveCrdbDatasetRecord(testPatientId);
        if (crdbDsOpt.isPresent()) {
            logger.info(">>> CRDB Dataset for CVR Patient id: " + testPatientId);
            logger.info(" primary disease: " + crdbDsOpt.get().getPRIM_DISEASE_12245()
                    + " survival status " + crdbDsOpt.get().getSURVIVAL_STATUS());
        } else {
            logger.info("No CRDB dataset for patient " + testPatientId);
        }
    }
}


