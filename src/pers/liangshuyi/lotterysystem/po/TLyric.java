package pers.liangshuyi.lotterysystem.po;

import java.util.Date;

public class TLyric {
    private String lyricid;

    private String userid;

    private String lyricname;

    private String lyrictype;

    private Integer integralval;

    private String clickid;

    private String melodyid;

    private String songid;

    private Integer stauts;

    private Integer clicknum;

    private Date time;

    public String getLyricid() {
        return lyricid;
    }

    public void setLyricid(String lyricid) {
        this.lyricid = lyricid == null ? null : lyricid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLyricname() {
        return lyricname;
    }

    public void setLyricname(String lyricname) {
        this.lyricname = lyricname == null ? null : lyricname.trim();
    }

    public String getLyrictype() {
        return lyrictype;
    }

    public void setLyrictype(String lyrictype) {
        this.lyrictype = lyrictype == null ? null : lyrictype.trim();
    }

    public Integer getIntegralval() {
        return integralval;
    }

    public void setIntegralval(Integer integralval) {
        this.integralval = integralval;
    }

    public String getClickid() {
        return clickid;
    }

    public void setClickid(String clickid) {
        this.clickid = clickid == null ? null : clickid.trim();
    }

    public String getMelodyid() {
        return melodyid;
    }

    public void setMelodyid(String melodyid) {
        this.melodyid = melodyid == null ? null : melodyid.trim();
    }

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid == null ? null : songid.trim();
    }

    public Integer getStauts() {
        return stauts;
    }

    public void setStauts(Integer stauts) {
        this.stauts = stauts;
    }

    public Integer getClicknum() {
        return clicknum;
    }

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}