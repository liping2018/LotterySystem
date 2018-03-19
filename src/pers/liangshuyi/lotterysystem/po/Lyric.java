package pers.liangshuyi.lotterysystem.po;

public class Lyric {
    private String lyricid;

    private String lyricname;

    private String userid;

    public String getLyricid() {
        return lyricid;
    }

    public void setLyricid(String lyricid) {
        this.lyricid = lyricid == null ? null : lyricid.trim();
    }

    public String getLyricname() {
        return lyricname;
    }

    public void setLyricname(String lyricname) {
        this.lyricname = lyricname == null ? null : lyricname.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }
}