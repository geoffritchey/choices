package com.ritchey.choices.mapper.powercampus;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ritchey.choices.domain.powercampus.People;
import com.ritchey.choices.domain.powercampus.PeopleExample;

public interface PeopleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    int countByExample(PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    int deleteByExample(PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    int insert(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    int insertSelective(People record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    List<People> selectByExample(PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    int updateByExampleSelective(@Param("record") People record, @Param("example") PeopleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    int updateByExample(@Param("record") People record, @Param("example") PeopleExample example);
}
