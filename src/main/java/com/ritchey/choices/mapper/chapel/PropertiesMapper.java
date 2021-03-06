package com.ritchey.choices.mapper.chapel;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.ritchey.choices.domain.chapel.Properties;
import com.ritchey.choices.domain.chapel.PropertiesExample;

public interface PropertiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int countByExample(PropertiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int deleteByExample(PropertiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int insert(Properties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int insertSelective(Properties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    List<Properties> selectByExample(PropertiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    Properties selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int updateByExampleSelective(@Param("record") Properties record, @Param("example") PropertiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int updateByExample(@Param("record") Properties record, @Param("example") PropertiesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int updateByPrimaryKeySelective(Properties record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table properties
     *
     * @mbggenerated Thu Sep 05 11:35:45 CDT 2013
     */
    int updateByPrimaryKey(Properties record);
}
