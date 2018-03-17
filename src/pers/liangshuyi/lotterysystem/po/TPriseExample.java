package pers.liangshuyi.lotterysystem.po;

import java.util.ArrayList;
import java.util.List;

public class TPriseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TPriseExample() {
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

        public Criteria andPriseidIsNull() {
            addCriterion("priseid is null");
            return (Criteria) this;
        }

        public Criteria andPriseidIsNotNull() {
            addCriterion("priseid is not null");
            return (Criteria) this;
        }

        public Criteria andPriseidEqualTo(Integer value) {
            addCriterion("priseid =", value, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidNotEqualTo(Integer value) {
            addCriterion("priseid <>", value, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidGreaterThan(Integer value) {
            addCriterion("priseid >", value, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("priseid >=", value, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidLessThan(Integer value) {
            addCriterion("priseid <", value, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidLessThanOrEqualTo(Integer value) {
            addCriterion("priseid <=", value, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidIn(List<Integer> values) {
            addCriterion("priseid in", values, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidNotIn(List<Integer> values) {
            addCriterion("priseid not in", values, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidBetween(Integer value1, Integer value2) {
            addCriterion("priseid between", value1, value2, "priseid");
            return (Criteria) this;
        }

        public Criteria andPriseidNotBetween(Integer value1, Integer value2) {
            addCriterion("priseid not between", value1, value2, "priseid");
            return (Criteria) this;
        }

        public Criteria andPrisenameIsNull() {
            addCriterion("prisename is null");
            return (Criteria) this;
        }

        public Criteria andPrisenameIsNotNull() {
            addCriterion("prisename is not null");
            return (Criteria) this;
        }

        public Criteria andPrisenameEqualTo(String value) {
            addCriterion("prisename =", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameNotEqualTo(String value) {
            addCriterion("prisename <>", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameGreaterThan(String value) {
            addCriterion("prisename >", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameGreaterThanOrEqualTo(String value) {
            addCriterion("prisename >=", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameLessThan(String value) {
            addCriterion("prisename <", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameLessThanOrEqualTo(String value) {
            addCriterion("prisename <=", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameLike(String value) {
            addCriterion("prisename like", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameNotLike(String value) {
            addCriterion("prisename not like", value, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameIn(List<String> values) {
            addCriterion("prisename in", values, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameNotIn(List<String> values) {
            addCriterion("prisename not in", values, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameBetween(String value1, String value2) {
            addCriterion("prisename between", value1, value2, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenameNotBetween(String value1, String value2) {
            addCriterion("prisename not between", value1, value2, "prisename");
            return (Criteria) this;
        }

        public Criteria andPrisenumIsNull() {
            addCriterion("prisenum is null");
            return (Criteria) this;
        }

        public Criteria andPrisenumIsNotNull() {
            addCriterion("prisenum is not null");
            return (Criteria) this;
        }

        public Criteria andPrisenumEqualTo(Integer value) {
            addCriterion("prisenum =", value, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumNotEqualTo(Integer value) {
            addCriterion("prisenum <>", value, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumGreaterThan(Integer value) {
            addCriterion("prisenum >", value, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("prisenum >=", value, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumLessThan(Integer value) {
            addCriterion("prisenum <", value, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumLessThanOrEqualTo(Integer value) {
            addCriterion("prisenum <=", value, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumIn(List<Integer> values) {
            addCriterion("prisenum in", values, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumNotIn(List<Integer> values) {
            addCriterion("prisenum not in", values, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumBetween(Integer value1, Integer value2) {
            addCriterion("prisenum between", value1, value2, "prisenum");
            return (Criteria) this;
        }

        public Criteria andPrisenumNotBetween(Integer value1, Integer value2) {
            addCriterion("prisenum not between", value1, value2, "prisenum");
            return (Criteria) this;
        }
    }

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