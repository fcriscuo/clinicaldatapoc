package org.mskcc.cbio.clinicaldata.cbiodata.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioClinicalSample;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioClinicalSampleExample;
import org.mskcc.cbio.clinicaldata.cbiodata.model.CbioClinicalSampleKey;

public interface CbioClinicalSampleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int countByExample(CbioClinicalSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int deleteByExample(CbioClinicalSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int deleteByPrimaryKey(CbioClinicalSampleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int insert(CbioClinicalSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int insertSelective(CbioClinicalSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    List<CbioClinicalSample> selectByExample(CbioClinicalSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    CbioClinicalSample selectByPrimaryKey(CbioClinicalSampleKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int updateByExampleSelective(@Param("record") CbioClinicalSample record, @Param("example") CbioClinicalSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int updateByExample(@Param("record") CbioClinicalSample record, @Param("example") CbioClinicalSampleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int updateByPrimaryKeySelective(CbioClinicalSample record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table clinical_sample
     *
     * @mbggenerated Mon Apr 20 14:27:25 EDT 2015
     */
    int updateByPrimaryKey(CbioClinicalSample record);
}