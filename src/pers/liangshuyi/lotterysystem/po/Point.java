package pers.liangshuyi.lotterysystem.po;

public class Point {
    private String pointid;

    private Integer pointvalue;

    private Integer status;

    private String userid;

    public String getPointid() {
        return pointid;
    }

    public void setPointid(String pointid) {
        this.pointid = pointid == null ? null : pointid.trim();
    }

    public Integer getPointvalue() {
        return pointvalue;
    }

    public void setPointvalue(Integer pointvalue) {
        this.pointvalue = pointvalue;
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