package pers.liangshuyi.lotterysystem.po;

import java.util.Date;

public class TSong {
    private String songid;

    private String userid;

    private String songname;

    private String songtype;

    private Integer integralval;

    private String clickid;

    private String melodyid;

    private String lyricid;

    private Integer status;

    private Date time;

    private Integer clicknum;

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid == null ? null : songid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname == null ? null : songname.trim();
    }

    public String getSongtype() {
        return songtype;
    }

    public void setSongtype(String songtype) {
        this.songtype = songtype == null ? null : songtype.trim();
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

    public String getLyricid() {
        return lyricid;
    }

    public void setLyricid(String lyricid) {
        this.lyricid = lyricid == null ? null : lyricid.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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