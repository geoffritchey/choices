create schema if not exists dbo;

drop table if exists SCHEDULEDEVENT;
create table SCHEDULEDEVENT (
	id  bigint auto_increment
	,version int not null default(0)
	,event int not null default(0)
	,starttime datetime
	,endtime datetime
	,template varchar(256)
	,recordTardy tinyint
	,recordLate tinyint
	,allcredit tinyint
	,split tinyint
	,splitByInstructor tinyint
);
drop table if exists event;
CREATE TABLE event(
	id bigint auto_increment,
	version int NOT NULL,
	description varchar(30) NOT NULL,
	tardyValue double NOT NULL,
	attendanceValue double NOT NULL,
	active tinyint NOT NULL,
	starttime datetime NULL,
	endtime datetime NULL
);
drop table if exists punch;
CREATE TABLE punch(
	id bigint IDENTITY(1,1) NOT NULL,
	version int NOT NULL,
	punchTime datetime NOT NULL,
	campusId varchar(9) NOT NULL,
	value double NOT NULL,
	event int NOT NULL,
	login varchar(9) NOT NULL,
	tardy tinyint NOT NULL,
	comment text NULL,
	eventschedule int NOT NULL
);

drop table if exists split_chapel;
CREATE TABLE split_chapel(
	id bigint IDENTITY(1,1) NOT NULL,
	campus_id varchar(9) NULL,
	day_of_week char(1) NOT NULL,
	template varchar(256) NULL,
	starttime varchar(4) NULL
);

drop table if exists split_by_leader;
CREATE TABLE split_by_leader(
	id bigint IDENTITY(1,1) NOT NULL,
	personId int NOT NULL,
	endTerm date NOT NULL,
	leaderId int NULL
);

drop table if exists leaders;
CREATE TABLE leaders(
	id bigint IDENTITY(1,1) NOT NULL,
	label varchar(100) NULL,
	endTerm date NULL,
	active tinyint NOT NULL
);

drop table if exists person;
create table person (
	id bigint IDENTITY(1,1) primary key,
	version int NOT NULL,
	people_id varchar(9) NOT NULL,
	lastName varchar(60) NULL,
	firstName varchar(60) NULL,
	middleName varchar(60) NULL,
	currentStudent tinyint NOT NULL,
	exempt int NOT NULL,
	comment varchar(500) NULL,
	email varchar(320) NULL
);


drop alias if exists dbo.getCurrentDate;
create alias if not exists dbo.getCurrentDate as '
    java.util.Date getDate() {
        return new java.util.Date();
    }
    ';
    
drop alias if exists dbo.day_of_week_ud;
create alias dbo.day_of_week_ud as '
	Integer day_of_week(java.util.Date date) {
		if (date == null)
			return null;

		Calendar cal = Calendar.getInstance();
    		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	';


drop alias if exists dbo.week_of_year;
create alias dbo.week_of_year as '
	Integer weekOfYear(java.util.Date date) {
		if (date == null)
			return null;

		Calendar cal = Calendar.getInstance();
    		cal.setTime(date);
		return cal.get(Calendar.WEEK_OF_YEAR);
	}
	';

