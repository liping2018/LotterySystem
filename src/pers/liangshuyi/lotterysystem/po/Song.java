package pers.liangshuyi.lotterysystem.po;

public class Song {
    private String songid;

    private Integer songtype;

    private String userid;

    private String lyricid;

    public String getSongid() {
        return songid;
    }

    public void setSongid(String songid) {
        this.songid = songid == null ? null : songid.trim();
    }

    public Integer getSongtype() {
        return songtype;
    }

    public void setSongtype(Integer songtype) {
        this.songtype = songtype;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getLyricid() {
        return lyricid;
    }

    public void setLyricid(String lyricid) {
        this.lyricid = lyricid == null ? null : lyricid.trim();
    }
}