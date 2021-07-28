package com.ritchey.choices.domain.chapel;

import java.util.ArrayList;
import java.util.List;

public class ChapelPersonExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public ChapelPersonExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[");
        sb.append("Hash = ").append(hashCode());
        sb.append(",orderByClause=").append(orderByClause);
        sb.append(",distinct=").append(distinct);
        sb.append(",oredCriteria=").append(oredCriteria);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIsNull() {
            addCriterion("people_id is null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIsNotNull() {
            addCriterion("people_id is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleIdEqualTo(String value) {
            addCriterion("people_id =", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotEqualTo(String value) {
            addCriterion("people_id <>", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdGreaterThan(String value) {
            addCriterion("people_id >", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdGreaterThanOrEqualTo(String value) {
            addCriterion("people_id >=", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLessThan(String value) {
            addCriterion("people_id <", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLessThanOrEqualTo(String value) {
            addCriterion("people_id <=", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdLike(String value) {
            addCriterion("people_id like", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotLike(String value) {
            addCriterion("people_id not like", value, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdIn(List<String> values) {
            addCriterion("people_id in", values, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotIn(List<String> values) {
            addCriterion("people_id not in", values, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdBetween(String value1, String value2) {
            addCriterion("people_id between", value1, value2, "peopleId");
            return (Criteria) this;
        }

        public Criteria andPeopleIdNotBetween(String value1, String value2) {
            addCriterion("people_id not between", value1, value2, "peopleId");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("lastName is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("lastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("lastName =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("lastName <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("lastName >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("lastName >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("lastName <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("lastName <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("lastName like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("lastName not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("lastName in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("lastName not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("lastName between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("lastName not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("firstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("firstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("firstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("firstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("firstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("firstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("firstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("firstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("firstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("firstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("firstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("firstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("firstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("firstName not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andMiddlenameIsNull() {
            addCriterion("middleName is null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameIsNotNull() {
            addCriterion("middleName is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlenameEqualTo(String value) {
            addCriterion("middleName =", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNotEqualTo(String value) {
            addCriterion("middleName <>", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameGreaterThan(String value) {
            addCriterion("middleName >", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameGreaterThanOrEqualTo(String value) {
            addCriterion("middleName >=", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameLessThan(String value) {
            addCriterion("middleName <", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameLessThanOrEqualTo(String value) {
            addCriterion("middleName <=", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameLike(String value) {
            addCriterion("middleName like", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNotLike(String value) {
            addCriterion("middleName not like", value, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameIn(List<String> values) {
            addCriterion("middleName in", values, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNotIn(List<String> values) {
            addCriterion("middleName not in", values, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameBetween(String value1, String value2) {
            addCriterion("middleName between", value1, value2, "middlename");
            return (Criteria) this;
        }

        public Criteria andMiddlenameNotBetween(String value1, String value2) {
            addCriterion("middleName not between", value1, value2, "middlename");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentIsNull() {
            addCriterion("currentStudent is null");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentIsNotNull() {
            addCriterion("currentStudent is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentEqualTo(Boolean value) {
            addCriterion("currentStudent =", value, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentNotEqualTo(Boolean value) {
            addCriterion("currentStudent <>", value, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentGreaterThan(Boolean value) {
            addCriterion("currentStudent >", value, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentGreaterThanOrEqualTo(Boolean value) {
            addCriterion("currentStudent >=", value, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentLessThan(Boolean value) {
            addCriterion("currentStudent <", value, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentLessThanOrEqualTo(Boolean value) {
            addCriterion("currentStudent <=", value, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentIn(List<Boolean> values) {
            addCriterion("currentStudent in", values, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentNotIn(List<Boolean> values) {
            addCriterion("currentStudent not in", values, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentBetween(Boolean value1, Boolean value2) {
            addCriterion("currentStudent between", value1, value2, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andCurrentstudentNotBetween(Boolean value1, Boolean value2) {
            addCriterion("currentStudent not between", value1, value2, "currentstudent");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table person
     *
     * @mbggenerated do_not_delete_during_merge Thu Aug 28 15:38:49 CDT 2014
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table person
     *
     * @mbggenerated Thu Aug 28 15:38:49 CDT 2014
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
