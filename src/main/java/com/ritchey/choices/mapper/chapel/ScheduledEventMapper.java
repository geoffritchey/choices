package com.ritchey.choices.mapper.chapel;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ritchey.choices.domain.chapel.ScheduledEvent;
import com.ritchey.choices.domain.chapel.ScheduledEventExample;

public interface ScheduledEventMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int countByExample(ScheduledEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int deleteByExample(ScheduledEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int insert(ScheduledEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int insertSelective(ScheduledEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    List<ScheduledEvent> selectByExample(ScheduledEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    ScheduledEvent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int updateByExampleSelective(@Param("record") ScheduledEvent record, @Param("example") ScheduledEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int updateByExample(@Param("record") ScheduledEvent record, @Param("example") ScheduledEventExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int updateByPrimaryKeySelective(ScheduledEvent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table scheduledEvent
     *
     * @mbggenerated Thu Aug 27 10:31:10 CDT 2020
     */
    int updateByPrimaryKey(ScheduledEvent record);
    

    int createFutureEvents(@Param("eventId") Integer eventId, @Param("today") Date today, 
    		@Param("endTerm") Date endTerm, @Param("starthour") Integer starthour, @Param("startminute") Integer startminute, 
    		@Param("endhour") Integer endhour, @Param("endminute") Integer endminute, @Param("list") List<String> daysOfWeek,
    		@Param("template") String template);
    
    /**
     * Check time conflicts that may occur when scheduling a recurring event.
     * @param starttime is the time regardless of date component when event starts
     * @param endtime is the time regardless of date component when event ends
     * @param event is the event's id number
     * @param startdate is the date on or after which the event is to be scheduled
     * @param enddate is the last date the event is to be scheduled (always end of term so far)
     * @param daysOfWeek is a list of strings representing the days of week to schedule the recurrence on 
     * 	as recognized by mssql as a datename(weekday, ...) (Monday, Tuesday, etc...)
     * @param ignoreId is the self being saved to ignore.  On create there is no id and this should be null.  Should be used on save (update).
     * @param ignoreTemplate is the same idea of ignore id.  Ignore yourself when checking overlaps of time.
     * @return
     */
    List<ScheduledEvent> futureConflicts(@Param("starttime") Date starttime, @Param("endtime") Date endtime, 
    		@Param("event")Integer event,@Param("startdate") Date startdate, @Param("enddate") Date enddate, 
    		@Param("daysOfWeek") List<String> daysOfWeek,
    		@Param("ignoreId") Integer ignoreId, @Param("ignoreTemplate") String ignoreTemplate);
    
    /**
     * Check for time conflicts restricted to start date/time and end date/time
     * @param starttime is the start date and time
     * @param endtime is the end date and time
     * @param ignoreId ignore yourself when checking for overlap on an update.
     * @return
     */
    List<ScheduledEvent> timeConflicts(@Param("starttime") Date starttime, @Param("endtime") Date endtime, 
    		@Param("event") Integer event, @Param("ignoreId") Integer ignoreId);
    
    
    int updateByExampleExtra(@Param("record") ScheduledEvent record, @Param("example") ScheduledEventExample example);
    
    int detach(@Param("id") int id);
    
    List<Map> selectSplitDays();
    
    Integer selectSplitInstructorCount();
    
    List<Map> progressQuery(@Param("startterm") Date startterm);
    List<Map> progressQueryHistory(@Param("startterm") Date startterm, @Param("endterm") Date endTerm);
    
    /**
     * given the id of a split chapel to be marked all-credit, mark all other split chapels for the week with the same template as all-credit too
     * @param id
     * @param value
     * @return
     */
    int updateSplitAllCredit(@Param("id") Integer id, @Param("value") Boolean value);
    
}