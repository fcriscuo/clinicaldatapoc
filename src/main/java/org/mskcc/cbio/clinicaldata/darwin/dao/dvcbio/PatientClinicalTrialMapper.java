package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientClinicalTrial;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientClinicalTrialExample;


import java.util.List;

public interface PatientClinicalTrialMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientClinicalTrialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientClinicalTrialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientClinicalTrial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientClinicalTrial record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientClinicalTrial> selectByExample(PatientClinicalTrialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientClinicalTrial record, @Param("example") PatientClinicalTrialExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.CLIN_TRIAL_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientClinicalTrial record, @Param("example") PatientClinicalTrialExample example);
}