package pers.liangshuyi.lotterysystem.po;

public class TPriseinfo {
    private Integer priseid;

    private String userid;

    public Integer getPriseid() {
        return priseid;
    }

    public void setPriseid(Integer priseid) {
        this.priseid = priseid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}