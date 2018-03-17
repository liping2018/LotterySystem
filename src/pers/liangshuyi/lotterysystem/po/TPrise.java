package pers.liangshuyi.lotterysystem.po;

public class TPrise {
    private Integer priseid;

    private String prisename;

    private Integer prisenum;

    public Integer getPriseid() {
        return priseid;
    }

    public void setPriseid(Integer priseid) {
        this.priseid = priseid;
    }

    public String getPrisename() {
        return prisename;
    }

    public void setPrisename(String prisename) {
        this.prisename = prisename == null ? null : prisename.trim();
    }

    public Integer getPrisenum() {
        return prisenum;
    }

    public void setPrisenum(Integer prisenum) {
        this.prisenum = prisenum;
    }
}