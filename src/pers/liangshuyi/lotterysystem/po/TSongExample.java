package pers.liangshuyi.lotterysystem.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TSongExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TSongExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andSongidIsNull() {
            addCriterion("songid is null");
            return (Criteria) this;
        }

        public Criteria andSongidIsNotNull() {
            addCriterion("songid is not null");
            return (Criteria) this;
        }

        public Criteria andSongidEqualTo(String value) {
            addCriterion("songid =", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotEqualTo(String value) {
            addCriterion("songid <>", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidGreaterThan(String value) {
            addCriterion("songid >", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidGreaterThanOrEqualTo(String value) {
            addCriterion("songid >=", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLessThan(String value) {
            addCriterion("songid <", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLessThanOrEqualTo(String value) {
            addCriterion("songid <=", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidLike(String value) {
            addCriterion("songid like", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotLike(String value) {
            addCriterion("songid not like", value, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidIn(List<String> values) {
            addCriterion("songid in", values, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotIn(List<String> values) {
            addCriterion("songid not in", values, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidBetween(String value1, String value2) {
            addCriterion("songid between", value1, value2, "songid");
            return (Criteria) this;
        }

        public Criteria andSongidNotBetween(String value1, String value2) {
            addCriterion("songid not between", value1, value2, "songid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andSongnameIsNull() {
            addCriterion("songname is null");
            return (Criteria) this;
        }

        public Criteria andSongnameIsNotNull() {
            addCriterion("songname is not null");
            return (Criteria) this;
        }

        public Criteria andSongnameEqualTo(String value) {
            addCriterion("songname =", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotEqualTo(String value) {
            addCriterion("songname <>", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameGreaterThan(String value) {
            addCriterion("songname >", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameGreaterThanOrEqualTo(String value) {
            addCriterion("songname >=", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameLessThan(String value) {
            addCriterion("songname <", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameLessThanOrEqualTo(String value) {
            addCriterion("songname <=", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameLike(String value) {
            addCriterion("songname like", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotLike(String value) {
            addCriterion("songname not like", value, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameIn(List<String> values) {
            addCriterion("songname in", values, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotIn(List<String> values) {
            addCriterion("songname not in", values, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameBetween(String value1, String value2) {
            addCriterion("songname between", value1, value2, "songname");
            return (Criteria) this;
        }

        public Criteria andSongnameNotBetween(String value1, String value2) {
            addCriterion("songname not between", value1, value2, "songname");
            return (Criteria) this;
        }

        public Criteria andSongtypeIsNull() {
            addCriterion("songtype is null");
            return (Criteria) this;
        }

        public Criteria andSongtypeIsNotNull() {
            addCriterion("songtype is not null");
            return (Criteria) this;
        }

        public Criteria andSongtypeEqualTo(String value) {
            addCriterion("songtype =", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeNotEqualTo(String value) {
            addCriterion("songtype <>", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeGreaterThan(String value) {
            addCriterion("songtype >", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeGreaterThanOrEqualTo(String value) {
            addCriterion("songtype >=", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeLessThan(String value) {
            addCriterion("songtype <", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeLessThanOrEqualTo(String value) {
            addCriterion("songtype <=", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeLike(String value) {
            addCriterion("songtype like", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeNotLike(String value) {
            addCriterion("songtype not like", value, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeIn(List<String> values) {
            addCriterion("songtype in", values, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeNotIn(List<String> values) {
            addCriterion("songtype not in", values, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeBetween(String value1, String value2) {
            addCriterion("songtype between", value1, value2, "songtype");
            return (Criteria) this;
        }

        public Criteria andSongtypeNotBetween(String value1, String value2) {
            addCriterion("songtype not between", value1, value2, "songtype");
            return (Criteria) this;
        }

        public Criteria andIntegralvalIsNull() {
            addCriterion("integralval is null");
            return (Criteria) this;
        }

        public Criteria andIntegralvalIsNotNull() {
            addCriterion("integralval is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralvalEqualTo(Integer value) {
            addCriterion("integralval =", value, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalNotEqualTo(Integer value) {
            addCriterion("integralval <>", value, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalGreaterThan(Integer value) {
            addCriterion("integralval >", value, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalGreaterThanOrEqualTo(Integer value) {
            addCriterion("integralval >=", value, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalLessThan(Integer value) {
            addCriterion("integralval <", value, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalLessThanOrEqualTo(Integer value) {
            addCriterion("integralval <=", value, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalIn(List<Integer> values) {
            addCriterion("integralval in", values, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalNotIn(List<Integer> values) {
            addCriterion("integralval not in", values, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalBetween(Integer value1, Integer value2) {
            addCriterion("integralval between", value1, value2, "integralval");
            return (Criteria) this;
        }

        public Criteria andIntegralvalNotBetween(Integer value1, Integer value2) {
            addCriterion("integralval not between", value1, value2, "integralval");
            return (Criteria) this;
        }

        public Criteria andClickidIsNull() {
            addCriterion("clickid is null");
            return (Criteria) this;
        }

        public Criteria andClickidIsNotNull() {
            addCriterion("clickid is not null");
            return (Criteria) this;
        }

        public Criteria andClickidEqualTo(String value) {
            addCriterion("clickid =", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidNotEqualTo(String value) {
            addCriterion("clickid <>", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidGreaterThan(String value) {
            addCriterion("clickid >", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidGreaterThanOrEqualTo(String value) {
            addCriterion("clickid >=", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidLessThan(String value) {
            addCriterion("clickid <", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidLessThanOrEqualTo(String value) {
            addCriterion("clickid <=", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidLike(String value) {
            addCriterion("clickid like", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidNotLike(String value) {
            addCriterion("clickid not like", value, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidIn(List<String> values) {
            addCriterion("clickid in", values, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidNotIn(List<String> values) {
            addCriterion("clickid not in", values, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidBetween(String value1, String value2) {
            addCriterion("clickid between", value1, value2, "clickid");
            return (Criteria) this;
        }

        public Criteria andClickidNotBetween(String value1, String value2) {
            addCriterion("clickid not between", value1, value2, "clickid");
            return (Criteria) this;
        }

        public Criteria andMelodyidIsNull() {
            addCriterion("melodyid is null");
            return (Criteria) this;
        }

        public Criteria andMelodyidIsNotNull() {
            addCriterion("melodyid is not null");
            return (Criteria) this;
        }

        public Criteria andMelodyidEqualTo(String value) {
            addCriterion("melodyid =", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidNotEqualTo(String value) {
            addCriterion("melodyid <>", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidGreaterThan(String value) {
            addCriterion("melodyid >", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidGreaterThanOrEqualTo(String value) {
            addCriterion("melodyid >=", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidLessThan(String value) {
            addCriterion("melodyid <", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidLessThanOrEqualTo(String value) {
            addCriterion("melodyid <=", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidLike(String value) {
            addCriterion("melodyid like", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidNotLike(String value) {
            addCriterion("melodyid not like", value, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidIn(List<String> values) {
            addCriterion("melodyid in", values, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidNotIn(List<String> values) {
            addCriterion("melodyid not in", values, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidBetween(String value1, String value2) {
            addCriterion("melodyid between", value1, value2, "melodyid");
            return (Criteria) this;
        }

        public Criteria andMelodyidNotBetween(String value1, String value2) {
            addCriterion("melodyid not between", value1, value2, "melodyid");
            return (Criteria) this;
        }

        public Criteria andLyricidIsNull() {
            addCriterion("lyricid is null");
            return (Criteria) this;
        }

        public Criteria andLyricidIsNotNull() {
            addCriterion("lyricid is not null");
            return (Criteria) this;
        }

        public Criteria andLyricidEqualTo(String value) {
            addCriterion("lyricid =", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidNotEqualTo(String value) {
            addCriterion("lyricid <>", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidGreaterThan(String value) {
            addCriterion("lyricid >", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidGreaterThanOrEqualTo(String value) {
            addCriterion("lyricid >=", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidLessThan(String value) {
            addCriterion("lyricid <", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidLessThanOrEqualTo(String value) {
            addCriterion("lyricid <=", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidLike(String value) {
            addCriterion("lyricid like", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidNotLike(String value) {
            addCriterion("lyricid not like", value, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidIn(List<String> values) {
            addCriterion("lyricid in", values, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidNotIn(List<String> values) {
            addCriterion("lyricid not in", values, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidBetween(String value1, String value2) {
            addCriterion("lyricid between", value1, value2, "lyricid");
            return (Criteria) this;
        }

        public Criteria andLyricidNotBetween(String value1, String value2) {
            addCriterion("lyricid not between", value1, value2, "lyricid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("TIME is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterionForJDBCTime("TIME =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("TIME <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("TIME >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("TIME >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterionForJDBCTime("TIME <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("TIME <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterionForJDBCTime("TIME in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("TIME not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("TIME between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("TIME not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNull() {
            addCriterion("clicknum is null");
            return (Criteria) this;
        }

        public Criteria andClicknumIsNotNull() {
            addCriterion("clicknum is not null");
            return (Criteria) this;
        }

        public Criteria andClicknumEqualTo(Integer value) {
            addCriterion("clicknum =", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotEqualTo(Integer value) {
            addCriterion("clicknum <>", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThan(Integer value) {
            addCriterion("clicknum >", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicknum >=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThan(Integer value) {
            addCriterion("clicknum <", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumLessThanOrEqualTo(Integer value) {
            addCriterion("clicknum <=", value, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumIn(List<Integer> values) {
            addCriterion("clicknum in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotIn(List<Integer> values) {
            addCriterion("clicknum not in", values, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumBetween(Integer value1, Integer value2) {
            addCriterion("clicknum between", value1, value2, "clicknum");
            return (Criteria) this;
        }

        public Criteria andClicknumNotBetween(Integer value1, Integer value2) {
            addCriterion("clicknum not between", value1, value2, "clicknum");
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