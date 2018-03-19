package pers.liangshuyi.lotterysystem.mapper;

import pers.liangshuyi.lotterysystem.po.Lyric;

public interface LyricMapper {

    int deleteByPrimaryKey(String lyricid);

    int insert(Lyric record);

    int insertSelective(Lyric record);


    Lyric selectByPrimaryKey(String lyricid);

    int updateByPrimaryKeySelective(Lyric record);

    int updateByPrimaryKey(Lyric record);
}