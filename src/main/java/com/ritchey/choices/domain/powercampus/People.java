package com.ritchey.choices.domain.powercampus;

import java.io.Serializable;

import com.ritchey.choices.domain.chapel.Reflect;

public class People implements Reflect, Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.PEOPLE_ID
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String peopleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.FIRST_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.MIDDLE_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String middleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.LAST_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.SUFFIX
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String suffix;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.NICKNAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.PersonId
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private Integer personid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.PrimaryPhoneId
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private Integer primaryphoneid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PEOPLE.LegalName
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private String legalname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    private static final long serialVersionUID = 20130904110845L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.PEOPLE_ID
     *
     * @return the value of PEOPLE.PEOPLE_ID
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getPeopleId() {
        return peopleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.PEOPLE_ID
     *
     * @param peopleId the value for PEOPLE.PEOPLE_ID
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setPeopleId(String peopleId) {
        this.peopleId = peopleId == null ? null : peopleId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.FIRST_NAME
     *
     * @return the value of PEOPLE.FIRST_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.FIRST_NAME
     *
     * @param firstName the value for PEOPLE.FIRST_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.MIDDLE_NAME
     *
     * @return the value of PEOPLE.MIDDLE_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.MIDDLE_NAME
     *
     * @param middleName the value for PEOPLE.MIDDLE_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setMiddleName(String middleName) {
        this.middleName = middleName == null ? null : middleName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.LAST_NAME
     *
     * @return the value of PEOPLE.LAST_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.LAST_NAME
     *
     * @param lastName the value for PEOPLE.LAST_NAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.SUFFIX
     *
     * @return the value of PEOPLE.SUFFIX
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.SUFFIX
     *
     * @param suffix the value for PEOPLE.SUFFIX
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.NICKNAME
     *
     * @return the value of PEOPLE.NICKNAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.NICKNAME
     *
     * @param nickname the value for PEOPLE.NICKNAME
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.PersonId
     *
     * @return the value of PEOPLE.PersonId
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public Integer getPersonid() {
        return personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.PersonId
     *
     * @param personid the value for PEOPLE.PersonId
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.PrimaryPhoneId
     *
     * @return the value of PEOPLE.PrimaryPhoneId
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public Integer getPrimaryphoneid() {
        return primaryphoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.PrimaryPhoneId
     *
     * @param primaryphoneid the value for PEOPLE.PrimaryPhoneId
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setPrimaryphoneid(Integer primaryphoneid) {
        this.primaryphoneid = primaryphoneid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PEOPLE.LegalName
     *
     * @return the value of PEOPLE.LegalName
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public String getLegalname() {
        return legalname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PEOPLE.LegalName
     *
     * @param legalname the value for PEOPLE.LegalName
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    public void setLegalname(String legalname) {
        this.legalname = legalname == null ? null : legalname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        sb.append("Hash = ").append(hashCode());
        sb.append(",peopleId=").append(peopleId);
        sb.append(",firstName=").append(firstName);
        sb.append(",middleName=").append(middleName);
        sb.append(",lastName=").append(lastName);
        sb.append(",suffix=").append(suffix);
        sb.append(",nickname=").append(nickname);
        sb.append(",personid=").append(personid);
        sb.append(",primaryphoneid=").append(primaryphoneid);
        sb.append(",legalname=").append(legalname);
        sb.append(",serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    @Override
    public Object get(String name) {
        if (name.equals("peopleId")) return peopleId;
        if (name.equals("firstName")) return firstName;
        if (name.equals("middleName")) return middleName;
        if (name.equals("lastName")) return lastName;
        if (name.equals("suffix")) return suffix;
        if (name.equals("nickname")) return nickname;
        if (name.equals("personid")) return personid;
        if (name.equals("primaryphoneid")) return primaryphoneid;
        if (name.equals("legalname")) return legalname;
        return null;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    @Override
    public void set(String name, Object value) {
        if (name.equals("peopleId")) peopleId = value==null?null:(java.lang.String) value;
        if (name.equals("firstName")) firstName = value==null?null:(java.lang.String) value;
        if (name.equals("middleName")) middleName = value==null?null:(java.lang.String) value;
        if (name.equals("lastName")) lastName = value==null?null:(java.lang.String) value;
        if (name.equals("suffix")) suffix = value==null?null:(java.lang.String) value;
        if (name.equals("nickname")) nickname = value==null?null:(java.lang.String) value;
        if (name.equals("personid")) personid = value==null?null:(java.lang.Integer) value;
        if (name.equals("primaryphoneid")) primaryphoneid = value==null?null:(java.lang.Integer) value;
        if (name.equals("legalname")) legalname = value==null?null:(java.lang.String) value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PEOPLE
     *
     * @mbggenerated Wed Sep 04 11:08:45 CDT 2013
     */
    @Override
    public void copy(Object a) {
        People castObject = (People) a;
        this.peopleId = castObject.peopleId;
        this.firstName = castObject.firstName;
        this.middleName = castObject.middleName;
        this.lastName = castObject.lastName;
        this.suffix = castObject.suffix;
        this.nickname = castObject.nickname;
        this.personid = castObject.personid;
        this.primaryphoneid = castObject.primaryphoneid;
        this.legalname = castObject.legalname;
    }

    public String simpleName() {
        return "People";
    }
}
