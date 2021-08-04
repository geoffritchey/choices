package com.ritchey.choices.mapper.chapel;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.ritchey.choices.Service.GreetingService;

/*
 --  Script to completely clear every table in the test database (chapelTEST3).  
 
 --  NEVER RUN ON LIVE DATABASE
 
 
EXEC sp_MSForEachTable "ALTER TABLE ? NOCHECK CONSTRAINT all";
EXEC sp_MSForEachTable "DELETE FROM ?";
exec sp_MSForEachTable "ALTER TABLE ? WITH CHECK CHECK CONSTRAINT all";
 */

class SimpleMapperTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(SimpleMapperTests.class);
	private static final String conf = "mybatis.conf.xml";
	
	@Autowired
	private GreetingService service;
	
	static private SqlSessionFactoryBuilder builder;
	static private SqlSessionFactory sessionFactory;
	static Reader reader;
	static private SqlSession session;
	
	static Connection con = null;
	
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	@BeforeAll
	static public void runBeforeAllTests() {
		builder = new SqlSessionFactoryBuilder();
		
		try {
			reader = Resources.getResourceAsReader(conf);
		} catch (IOException e) {
			e.printStackTrace();
		}
        
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("build.properties"));
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        
		sessionFactory = builder.build(reader, properties);
   
        session = sessionFactory.openSession(false);
        con = session.getConnection();
        
	}
	
	@BeforeEach
	public void runBeforeTestMethod() {
		try {
			con.setSavepoint();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	@AfterEach
	public void runAfterEach() {
		try {
			con.rollback();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@AfterAll
	static public void afterAllTests() {

        session.close();
	}
	/**
	 *  mvn test -Dtest=SimpleMapperTests#selectPresent
	 * @throws Exception
	 */
	@Test
	public void selectPresent() throws Exception {
		
		/* Test split session that a person gets allcredit credits even if he's never punched in to chapel.
		 *   split sessions count as 1.  Even though Jan 11 and Jan 12 are marked all-credit, there should be only one all credit award;
		 * preferably on the day the student is scheduled to attend (M or T).  Jan 18 mark should make sure either 18 or 19 is awarded.
		 */

		conRun(con, ""
				+ "SET IDENTITY_INSERT event on;\n"
				+ "insert into event (id, version, description, tardyValue, attendanceValue, active) values (123, 0,  'Daily Chapel', 0.75, 1,1);"
				+ "SET IDENTITY_INSERT event off;\n"
				+ "insert into scheduledEvent(event, starttime, endtime, template, recordTardy, recordLate, allcredit, split, splitByInstructor)\n"
				+ "values (123, '2021-01-11 09:30:00.000', '2021-01-11 11:00:00.000', '577381d0-7957-46c5-9081-54f2096aa738:W1:MT', 0,0, 1,1,0);\n"
				+ "\n"
				+ "insert into scheduledEvent(event, starttime, endtime, template, recordTardy, recordLate, allcredit, split, splitByInstructor)\n"
				+ "values (123, '2021-01-12 09:30:00.000', '2021-01-12 11:00:00.000', '577381d0-7957-46c5-9081-54f2096aa738:W1:MT', 0,0, 1,1,0);\n"
				+ "\n"
				+ "insert into scheduledEvent(event, starttime, endtime, template, recordTardy, recordLate, allcredit, split, splitByInstructor)\n"
				+ "values (123, '2021-01-18 09:30:00.000', '2021-01-18 11:00:00.000', '577381d0-7957-46c5-9081-54f2096aa738:W1:MT', 0,0, 1,1,0);\n"
				+ "\n"
				+ "insert into scheduledEvent(event, starttime, endtime, template, recordTardy, recordLate, allcredit, split, splitByInstructor)\n"
				+ "values (123, '2021-02-15 09:30:00.000', '2021-02-15 11:00:00.000', '577381d0-7957-46c5-9081-54f2096aa738:W1:MT', 0,0, 1,1,0);\n"
				+ "\n"
				+ "insert into scheduledEvent(event, starttime, endtime, template, recordTardy, recordLate, allcredit, split, splitByInstructor)\n"
				+ "values (123, '2021-02-16 09:30:00.000', '2021-02-16 11:00:00.000', '577381d0-7957-46c5-9081-54f2096aa738:W1:MT', 0,0, 1,1,0);\n"
				+ "\n"

				+ "");
		


        PunchMapper mapper = session.getMapper(PunchMapper.class);
        
        List<Map> x = mapper.selectPresent("000244931", df.parse("2021-01-09"));
        assertTrue(x.size() == 3);
        assertTrue(x.get(0).get("day").equals(df.parse("2021-02-15")));
        assertTrue(x.get(1).get("day").equals(df.parse("2021-01-18")));
        assertTrue(x.get(2).get("day").equals(df.parse("2021-01-11")));
        
	}
	
	/**
	 * mvn test -Dtest=SimpleMapperTests#selectIsSplitByMentor
	 * @throws Exception
	 */
	@Test
	public void selectIsSplitByMentor() throws Exception {
		conRun(con, ""
				+ "SET IDENTITY_INSERT event on;\n"
				+ "insert into event (id, version, description, tardyValue, attendanceValue, active) values (123, 0,  'Daily Chapel', 0.75, 1,1);"
				+ "SET IDENTITY_INSERT event off;\n"
				+ "insert into scheduledEvent(event, starttime, endtime, template, recordTardy, recordLate, allcredit, split, splitByInstructor) \r\n"
				+ "	values (123, '2021-01-11 09:30:00.000', '2021-01-11 11:00:00.000', '577381d0-7957-46c5-9081-54f2096aa738:W1:MT', 0,0, 1,1,1);");
		LeadersMapper mapper = session.getMapper(LeadersMapper.class);
		assertTrue(1==mapper.selectIsSplitByMentor());
	}


	/**
	 * mvn test -Dtest=SimpleMapperTests#selectActiveLeaders
	 * @throws Exception
	 */
	@Test
	public void selectActiveLeaders() throws Exception {
		conRun(con, "INSERT INTO leaders (label ,endTerm ,active)\r\n"
				+ "    VALUES ('ben hur', '2021-01-01', 1);");

		LeadersMapper mapper = session.getMapper(LeadersMapper.class);
		Integer maximunNumberOfPeoplePerSession = 10;  
		List<Map> leaders = mapper.selectActiveLeaders(maximunNumberOfPeoplePerSession);
		// ensure that an active leader has a label of 'ben hur'
		assertTrue(leaders.stream().map(x -> (String) x.get("label")).anyMatch(item -> item.equals("ben hur")));
	}
	
	/**
	 * mvn test -Dtest=SimpleMapperTests#updateLeaderChoice
	 * @throws ParseException 
	 */
	@Test
	public void updateLeaderChoice() {
		SplitByLeaderMapper mapper = session.getMapper(SplitByLeaderMapper.class);
		int x = mapper.updateByPeopleIdAndLabel("000000000", "leader label");
		assertTrue(x==0);
	}
	
	/**
	 * mvn test -Dtest=SimpleMapperTests#insertLeaderChoice
	 * @throws ParseException
	 * @throws SQLException 
	 */
	@Test
	public void insertLeaderChoice() throws ParseException {
		try {
			conRun(con, "insert into person (people_id) values ('000000000');"
					+ "  insert into leaders(label, endTerm, active) values ('leader label', '1979-01-01', 1);");
		} catch (SQLException e1) {
			assertTrue(false);
			e1.printStackTrace();
		}
		SplitByLeaderMapper mapper = session.getMapper(SplitByLeaderMapper.class);
		int x = mapper.insertByPeopleIdAndLabel("000000000", "leader label", df.parse("2020-01-01"));
		assertTrue(x==1);
		boolean exception = false;
		try {
			x = mapper.insertByPeopleIdAndLabel("000000000", "leader label", df.parse("2020-01-01"));
		} catch (PersistenceException e) {
			LOGGER.debug("EXCEPTION e = " + e);
			exception = true;
		}
		assertTrue(exception, "should get a duplicate key violation");
	}

	
	/**
	 * Convenience function to execute a statement on a connection.
	 * @param con
	 * @param populate
	 * @throws SQLException
	 */
	public void conRun(Connection con, String populate) throws SQLException {
		Statement stmt = con.createStatement();
		stmt.execute(populate);
		stmt.close();
	}
	
}
