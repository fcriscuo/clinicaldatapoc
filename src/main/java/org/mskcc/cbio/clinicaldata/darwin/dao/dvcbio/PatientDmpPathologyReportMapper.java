package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientDmpPathologyReport;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientDmpPathologyReportExample;


import java.util.List;

public interface PatientDmpPathologyReportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientDmpPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientDmpPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientDmpPathologyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientDmpPathologyReport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientDmpPathologyReport> selectByExample(PatientDmpPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientDmpPathologyReport record, @Param("example") PatientDmpPathologyReportExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.PATHOLOGY_DMP_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientDmpPathologyReport record, @Param("example") PatientDmpPathologyReportExample example);
}