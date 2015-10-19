package org.mskcc.cbio.clinicaldata.darwin.dao.dvcbio;

import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.DmtTimelineBrainSpine;
import org.mskcc.cbio.clinicaldata.darwin.model.dvcbio.DmtTimelineBrainSpineExample;


import java.util.List;

public interface DmtTimelineBrainSpineMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int countByExample(DmtTimelineBrainSpineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int deleteByExample(DmtTimelineBrainSpineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insert(DmtTimelineBrainSpine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int insertSelective(DmtTimelineBrainSpine record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    List<DmtTimelineBrainSpine> selectByExample(DmtTimelineBrainSpineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExampleSelective(@Param("record") DmtTimelineBrainSpine record, @Param("example") DmtTimelineBrainSpineExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DVCBIO.DMT_TIMELINE_BRAINSPINE_V
     *
     * @mbggenerated Fri Sep 04 16:58:24 EDT 2015
     */
    int updateByExample(@Param("record") DmtTimelineBrainSpine record, @Param("example") DmtTimelineBrainSpineExample example);
}