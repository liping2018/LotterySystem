package pers.liangshuyi.lotterysystem.po;

public class Melody {
    private String melodyid;

    private String melodyname;

    private Integer melodytype;

    private String userid;

    public String getMelodyid() {
        return melodyid;
    }

    public void setMelodyid(String melodyid) {
        this.melodyid = melodyid == null ? null : melodyid.trim();
    }

    public String getMelodyname() {
        return melodyname;
    }

    public void setMelodyname(String melodyname) {
        this.melodyname = melodyname == null ? null : melodyname.trim();
    }

    public Integer getMelodytype() {
        return melodytype;
    }

    public void setMelodytype(Integer melodytype) {
        this.melodytype = melodytype;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}