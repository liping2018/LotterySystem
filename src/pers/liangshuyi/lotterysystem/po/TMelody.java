package pers.liangshuyi.lotterysystem.po;

import java.util.Date;

public class TMelody {
    private String melodyid;

    private String userid;

    private String melodyname;

    private String melodytype;

    private Integer intergralval;

    private String clickid;

    private String lyricid;

    private String songid;

    private Date time;

    private Integer clicknum;

    public String getMelodyid() {
        return melodyid;
    }

    public void setMelodyid(String melodyid) {
        this.melodyid = melodyid == null ? null : melodyid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getMelodyname() {
        return melodyname;
    }

    public void setMelodyname(String melodyname) {
        this.melodyname = melodyname == null ? null : melodyname.trim();
    }

    public String getMelodytype() {
        return melodytype;
    }

    public void setMelodytype(String melodytype) {
        this.melodytype = melodytype == null ? null : melodytype.trim();
    }

    public Integer getIntergralval() {
        return intergralval;
    }

    public void setIntergralval(Integer intergralval) {
        this.intergralval = intergralval;
    }

    public String getClickid() {
        return clickid;
    }

    public void setClickid(String clickid) {
        this.clickid = clickid == null ? null : clickid.trim();
    }

    public String getLyricid() {
        return lyricid;
    }

    public void setLyricid(String lyricid) {
        this.lyricid = lyricid == null ? null : lyricid.trim();
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid == null ? null : songid.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }
}