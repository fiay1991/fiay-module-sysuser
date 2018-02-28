package com.fiay.microserv.sysuser.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SysuserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIsNull() {
            addCriterion("su_username is null");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIsNotNull() {
            addCriterion("su_username is not null");
            return (Criteria) this;
        }

        public Criteria andSuUsernameEqualTo(String value) {
            addCriterion("su_username =", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotEqualTo(String value) {
            addCriterion("su_username <>", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameGreaterThan(String value) {
            addCriterion("su_username >", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("su_username >=", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLessThan(String value) {
            addCriterion("su_username <", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLessThanOrEqualTo(String value) {
            addCriterion("su_username <=", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLike(String value) {
            addCriterion("su_username like", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotLike(String value) {
            addCriterion("su_username not like", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIn(List<String> values) {
            addCriterion("su_username in", values, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotIn(List<String> values) {
            addCriterion("su_username not in", values, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameBetween(String value1, String value2) {
            addCriterion("su_username between", value1, value2, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotBetween(String value1, String value2) {
            addCriterion("su_username not between", value1, value2, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNull() {
            addCriterion("su_password is null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNotNull() {
            addCriterion("su_password is not null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordEqualTo(String value) {
            addCriterion("su_password =", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotEqualTo(String value) {
            addCriterion("su_password <>", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThan(String value) {
            addCriterion("su_password >", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("su_password >=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThan(String value) {
            addCriterion("su_password <", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThanOrEqualTo(String value) {
            addCriterion("su_password <=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLike(String value) {
            addCriterion("su_password like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotLike(String value) {
            addCriterion("su_password not like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIn(List<String> values) {
            addCriterion("su_password in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotIn(List<String> values) {
            addCriterion("su_password not in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordBetween(String value1, String value2) {
            addCriterion("su_password between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotBetween(String value1, String value2) {
            addCriterion("su_password not between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltIsNull() {
            addCriterion("su_password_salt is null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltIsNotNull() {
            addCriterion("su_password_salt is not null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltEqualTo(String value) {
            addCriterion("su_password_salt =", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltNotEqualTo(String value) {
            addCriterion("su_password_salt <>", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltGreaterThan(String value) {
            addCriterion("su_password_salt >", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltGreaterThanOrEqualTo(String value) {
            addCriterion("su_password_salt >=", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltLessThan(String value) {
            addCriterion("su_password_salt <", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltLessThanOrEqualTo(String value) {
            addCriterion("su_password_salt <=", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltLike(String value) {
            addCriterion("su_password_salt like", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltNotLike(String value) {
            addCriterion("su_password_salt not like", value, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltIn(List<String> values) {
            addCriterion("su_password_salt in", values, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltNotIn(List<String> values) {
            addCriterion("su_password_salt not in", values, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltBetween(String value1, String value2) {
            addCriterion("su_password_salt between", value1, value2, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuPasswordSaltNotBetween(String value1, String value2) {
            addCriterion("su_password_salt not between", value1, value2, "suPasswordSalt");
            return (Criteria) this;
        }

        public Criteria andSuNicknameIsNull() {
            addCriterion("su_nickname is null");
            return (Criteria) this;
        }

        public Criteria andSuNicknameIsNotNull() {
            addCriterion("su_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andSuNicknameEqualTo(String value) {
            addCriterion("su_nickname =", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameNotEqualTo(String value) {
            addCriterion("su_nickname <>", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameGreaterThan(String value) {
            addCriterion("su_nickname >", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("su_nickname >=", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameLessThan(String value) {
            addCriterion("su_nickname <", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameLessThanOrEqualTo(String value) {
            addCriterion("su_nickname <=", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameLike(String value) {
            addCriterion("su_nickname like", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameNotLike(String value) {
            addCriterion("su_nickname not like", value, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameIn(List<String> values) {
            addCriterion("su_nickname in", values, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameNotIn(List<String> values) {
            addCriterion("su_nickname not in", values, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameBetween(String value1, String value2) {
            addCriterion("su_nickname between", value1, value2, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuNicknameNotBetween(String value1, String value2) {
            addCriterion("su_nickname not between", value1, value2, "suNickname");
            return (Criteria) this;
        }

        public Criteria andSuFromIsNull() {
            addCriterion("su_from is null");
            return (Criteria) this;
        }

        public Criteria andSuFromIsNotNull() {
            addCriterion("su_from is not null");
            return (Criteria) this;
        }

        public Criteria andSuFromEqualTo(Integer value) {
            addCriterion("su_from =", value, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromNotEqualTo(Integer value) {
            addCriterion("su_from <>", value, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromGreaterThan(Integer value) {
            addCriterion("su_from >", value, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_from >=", value, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromLessThan(Integer value) {
            addCriterion("su_from <", value, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromLessThanOrEqualTo(Integer value) {
            addCriterion("su_from <=", value, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromIn(List<Integer> values) {
            addCriterion("su_from in", values, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromNotIn(List<Integer> values) {
            addCriterion("su_from not in", values, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromBetween(Integer value1, Integer value2) {
            addCriterion("su_from between", value1, value2, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuFromNotBetween(Integer value1, Integer value2) {
            addCriterion("su_from not between", value1, value2, "suFrom");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpIsNull() {
            addCriterion("su_last_login_ip is null");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpIsNotNull() {
            addCriterion("su_last_login_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpEqualTo(String value) {
            addCriterion("su_last_login_ip =", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpNotEqualTo(String value) {
            addCriterion("su_last_login_ip <>", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpGreaterThan(String value) {
            addCriterion("su_last_login_ip >", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpGreaterThanOrEqualTo(String value) {
            addCriterion("su_last_login_ip >=", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpLessThan(String value) {
            addCriterion("su_last_login_ip <", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpLessThanOrEqualTo(String value) {
            addCriterion("su_last_login_ip <=", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpLike(String value) {
            addCriterion("su_last_login_ip like", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpNotLike(String value) {
            addCriterion("su_last_login_ip not like", value, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpIn(List<String> values) {
            addCriterion("su_last_login_ip in", values, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpNotIn(List<String> values) {
            addCriterion("su_last_login_ip not in", values, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpBetween(String value1, String value2) {
            addCriterion("su_last_login_ip between", value1, value2, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginIpNotBetween(String value1, String value2) {
            addCriterion("su_last_login_ip not between", value1, value2, "suLastLoginIp");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeIsNull() {
            addCriterion("su_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeIsNotNull() {
            addCriterion("su_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeEqualTo(Date value) {
            addCriterion("su_last_login_time =", value, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeNotEqualTo(Date value) {
            addCriterion("su_last_login_time <>", value, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeGreaterThan(Date value) {
            addCriterion("su_last_login_time >", value, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("su_last_login_time >=", value, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeLessThan(Date value) {
            addCriterion("su_last_login_time <", value, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("su_last_login_time <=", value, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeIn(List<Date> values) {
            addCriterion("su_last_login_time in", values, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeNotIn(List<Date> values) {
            addCriterion("su_last_login_time not in", values, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("su_last_login_time between", value1, value2, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("su_last_login_time not between", value1, value2, "suLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNull() {
            addCriterion("su_status is null");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNotNull() {
            addCriterion("su_status is not null");
            return (Criteria) this;
        }

        public Criteria andSuStatusEqualTo(Integer value) {
            addCriterion("su_status =", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotEqualTo(Integer value) {
            addCriterion("su_status <>", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThan(Integer value) {
            addCriterion("su_status >", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_status >=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThan(Integer value) {
            addCriterion("su_status <", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("su_status <=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusIn(List<Integer> values) {
            addCriterion("su_status in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotIn(List<Integer> values) {
            addCriterion("su_status not in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusBetween(Integer value1, Integer value2) {
            addCriterion("su_status between", value1, value2, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("su_status not between", value1, value2, "suStatus");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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