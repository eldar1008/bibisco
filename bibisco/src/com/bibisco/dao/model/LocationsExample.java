package com.bibisco.dao.model;

import java.util.ArrayList;
import java.util.List;

public class LocationsExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public LocationsExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
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

		public Criteria andIdLocationIsNull() {
			addCriterion("ID_LOCATION is null");
			return (Criteria) this;
		}

		public Criteria andIdLocationIsNotNull() {
			addCriterion("ID_LOCATION is not null");
			return (Criteria) this;
		}

		public Criteria andIdLocationEqualTo(Long value) {
			addCriterion("ID_LOCATION =", value, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationNotEqualTo(Long value) {
			addCriterion("ID_LOCATION <>", value, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationGreaterThan(Long value) {
			addCriterion("ID_LOCATION >", value, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationGreaterThanOrEqualTo(Long value) {
			addCriterion("ID_LOCATION >=", value, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationLessThan(Long value) {
			addCriterion("ID_LOCATION <", value, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationLessThanOrEqualTo(Long value) {
			addCriterion("ID_LOCATION <=", value, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationIn(List<Long> values) {
			addCriterion("ID_LOCATION in", values, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationNotIn(List<Long> values) {
			addCriterion("ID_LOCATION not in", values, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationBetween(Long value1, Long value2) {
			addCriterion("ID_LOCATION between", value1, value2, "idLocation");
			return (Criteria) this;
		}

		public Criteria andIdLocationNotBetween(Long value1, Long value2) {
			addCriterion("ID_LOCATION not between", value1, value2, "idLocation");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("NAME is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("NAME is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("NAME =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("NAME <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("NAME >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("NAME >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("NAME <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("NAME <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("NAME like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("NAME not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("NAME in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("NAME not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("NAME between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("NAME not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andPositionIsNull() {
			addCriterion("POSITION is null");
			return (Criteria) this;
		}

		public Criteria andPositionIsNotNull() {
			addCriterion("POSITION is not null");
			return (Criteria) this;
		}

		public Criteria andPositionEqualTo(Integer value) {
			addCriterion("POSITION =", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionNotEqualTo(Integer value) {
			addCriterion("POSITION <>", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionGreaterThan(Integer value) {
			addCriterion("POSITION >", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionGreaterThanOrEqualTo(Integer value) {
			addCriterion("POSITION >=", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionLessThan(Integer value) {
			addCriterion("POSITION <", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionLessThanOrEqualTo(Integer value) {
			addCriterion("POSITION <=", value, "position");
			return (Criteria) this;
		}

		public Criteria andPositionIn(List<Integer> values) {
			addCriterion("POSITION in", values, "position");
			return (Criteria) this;
		}

		public Criteria andPositionNotIn(List<Integer> values) {
			addCriterion("POSITION not in", values, "position");
			return (Criteria) this;
		}

		public Criteria andPositionBetween(Integer value1, Integer value2) {
			addCriterion("POSITION between", value1, value2, "position");
			return (Criteria) this;
		}

		public Criteria andPositionNotBetween(Integer value1, Integer value2) {
			addCriterion("POSITION not between", value1, value2, "position");
			return (Criteria) this;
		}

		public Criteria andNationIsNull() {
			addCriterion("NATION is null");
			return (Criteria) this;
		}

		public Criteria andNationIsNotNull() {
			addCriterion("NATION is not null");
			return (Criteria) this;
		}

		public Criteria andNationEqualTo(String value) {
			addCriterion("NATION =", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationNotEqualTo(String value) {
			addCriterion("NATION <>", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationGreaterThan(String value) {
			addCriterion("NATION >", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationGreaterThanOrEqualTo(String value) {
			addCriterion("NATION >=", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationLessThan(String value) {
			addCriterion("NATION <", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationLessThanOrEqualTo(String value) {
			addCriterion("NATION <=", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationLike(String value) {
			addCriterion("NATION like", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationNotLike(String value) {
			addCriterion("NATION not like", value, "nation");
			return (Criteria) this;
		}

		public Criteria andNationIn(List<String> values) {
			addCriterion("NATION in", values, "nation");
			return (Criteria) this;
		}

		public Criteria andNationNotIn(List<String> values) {
			addCriterion("NATION not in", values, "nation");
			return (Criteria) this;
		}

		public Criteria andNationBetween(String value1, String value2) {
			addCriterion("NATION between", value1, value2, "nation");
			return (Criteria) this;
		}

		public Criteria andNationNotBetween(String value1, String value2) {
			addCriterion("NATION not between", value1, value2, "nation");
			return (Criteria) this;
		}

		public Criteria andStateIsNull() {
			addCriterion("STATE is null");
			return (Criteria) this;
		}

		public Criteria andStateIsNotNull() {
			addCriterion("STATE is not null");
			return (Criteria) this;
		}

		public Criteria andStateEqualTo(String value) {
			addCriterion("STATE =", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotEqualTo(String value) {
			addCriterion("STATE <>", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThan(String value) {
			addCriterion("STATE >", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateGreaterThanOrEqualTo(String value) {
			addCriterion("STATE >=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThan(String value) {
			addCriterion("STATE <", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLessThanOrEqualTo(String value) {
			addCriterion("STATE <=", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateLike(String value) {
			addCriterion("STATE like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotLike(String value) {
			addCriterion("STATE not like", value, "state");
			return (Criteria) this;
		}

		public Criteria andStateIn(List<String> values) {
			addCriterion("STATE in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotIn(List<String> values) {
			addCriterion("STATE not in", values, "state");
			return (Criteria) this;
		}

		public Criteria andStateBetween(String value1, String value2) {
			addCriterion("STATE between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andStateNotBetween(String value1, String value2) {
			addCriterion("STATE not between", value1, value2, "state");
			return (Criteria) this;
		}

		public Criteria andCityIsNull() {
			addCriterion("CITY is null");
			return (Criteria) this;
		}

		public Criteria andCityIsNotNull() {
			addCriterion("CITY is not null");
			return (Criteria) this;
		}

		public Criteria andCityEqualTo(String value) {
			addCriterion("CITY =", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotEqualTo(String value) {
			addCriterion("CITY <>", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThan(String value) {
			addCriterion("CITY >", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityGreaterThanOrEqualTo(String value) {
			addCriterion("CITY >=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThan(String value) {
			addCriterion("CITY <", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLessThanOrEqualTo(String value) {
			addCriterion("CITY <=", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityLike(String value) {
			addCriterion("CITY like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotLike(String value) {
			addCriterion("CITY not like", value, "city");
			return (Criteria) this;
		}

		public Criteria andCityIn(List<String> values) {
			addCriterion("CITY in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotIn(List<String> values) {
			addCriterion("CITY not in", values, "city");
			return (Criteria) this;
		}

		public Criteria andCityBetween(String value1, String value2) {
			addCriterion("CITY between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andCityNotBetween(String value1, String value2) {
			addCriterion("CITY not between", value1, value2, "city");
			return (Criteria) this;
		}

		public Criteria andTaskStatusIsNull() {
			addCriterion("TASK_STATUS is null");
			return (Criteria) this;
		}

		public Criteria andTaskStatusIsNotNull() {
			addCriterion("TASK_STATUS is not null");
			return (Criteria) this;
		}

		public Criteria andTaskStatusEqualTo(Integer value) {
			addCriterion("TASK_STATUS =", value, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusNotEqualTo(Integer value) {
			addCriterion("TASK_STATUS <>", value, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusGreaterThan(Integer value) {
			addCriterion("TASK_STATUS >", value, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("TASK_STATUS >=", value, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusLessThan(Integer value) {
			addCriterion("TASK_STATUS <", value, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusLessThanOrEqualTo(Integer value) {
			addCriterion("TASK_STATUS <=", value, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusIn(List<Integer> values) {
			addCriterion("TASK_STATUS in", values, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusNotIn(List<Integer> values) {
			addCriterion("TASK_STATUS not in", values, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusBetween(Integer value1, Integer value2) {
			addCriterion("TASK_STATUS between", value1, value2, "taskStatus");
			return (Criteria) this;
		}

		public Criteria andTaskStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("TASK_STATUS not between", value1, value2, "taskStatus");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PUBLIC.LOCATIONS
	 * @mbggenerated  Thu Jul 04 20:13:11 CEST 2013
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PUBLIC.LOCATIONS
     *
     * @mbggenerated do_not_delete_during_merge Thu Jul 04 19:35:57 CEST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}