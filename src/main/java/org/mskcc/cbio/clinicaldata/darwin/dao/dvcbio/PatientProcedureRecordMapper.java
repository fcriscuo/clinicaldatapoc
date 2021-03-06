package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientProcedureRecord;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientProcedureRecordExample;


import java.util.List;

public interface PatientProcedureRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientProcedureRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientProcedureRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientProcedureRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientProcedureRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientProcedureRecord> selectByExample(PatientProcedureRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientProcedureRecord record, @Param("example") PatientProcedureRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PROCEDURE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientProcedureRecord record, @Param("example") PatientProcedureRecordExample example);
}