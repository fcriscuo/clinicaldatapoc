package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientFirstActivity;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.PatientFirstActivityExample;


import java.util.List;

public interface PatientFirstActivityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(PatientFirstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(PatientFirstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(PatientFirstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(PatientFirstActivity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<PatientFirstActivity> selectByExample(PatientFirstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") PatientFirstActivity record, @Param("example") PatientFirstActivityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.FIRST_ACTIVITY_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") PatientFirstActivity record, @Param("example") PatientFirstActivityExample example);
}