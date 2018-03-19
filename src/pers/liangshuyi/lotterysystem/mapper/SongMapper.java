package pers.liangshuyi.lotterysystem.mapper;

import pers.liangshuyi.lotterysystem.po.Song;

public interface SongMapper {

    int deleteByPrimaryKey(String songid);

    int insert(Song record);

    int insertSelective(Song record);


    Song selectByPrimaryKey(String songid);

    int updateByPrimaryKeySelective(Song record);

    int updateByPrimaryKey(Song record);
}