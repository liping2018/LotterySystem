package pers.liangshuyi.lotterysystem.po;

public class TIntegral {
    private String integralid;

    private Integer integral;

    private Integer status;

    private String userid;

    public String getIntegralid() {
        return integralid;
    }

    public void setIntegralid(String integralid) {
        this.integralid = integralid == null ? null : integralid.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}