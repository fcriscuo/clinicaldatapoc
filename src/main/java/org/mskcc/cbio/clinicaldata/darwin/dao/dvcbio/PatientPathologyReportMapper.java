package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientPathologyReport;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientPathologyReportExample;


import java.util.List;

public interface PatientPathologyReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientPathologyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientPathologyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientPathologyReport> selectByExample(PatientPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientPathologyReport record, @Param("example") PatientPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientPathologyReport record, @Param("example") PatientPathologyReportExample example);
}