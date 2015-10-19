package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientLatestActivity;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientLatestActivityExample;


import java.util.List;

public interface PatientLatestActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientLatestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientLatestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientLatestActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientLatestActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientLatestActivity> selectByExample(PatientLatestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientLatestActivity record, @Param("example") PatientLatestActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.LATEST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientLatestActivity record, @Param("example") PatientLatestActivityExample example);
}