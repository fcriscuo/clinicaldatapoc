package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientIcd9Record;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientIcd9RecordExample;

import java.util.List;

public interface PatientIcd9RecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientIcd9RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientIcd9RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientIcd9Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientIcd9Record record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientIcd9Record> selectByExample(PatientIcd9RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientIcd9Record record, @Param("example") PatientIcd9RecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.ICD9_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientIcd9Record record, @Param("example") PatientIcd9RecordExample example);
}