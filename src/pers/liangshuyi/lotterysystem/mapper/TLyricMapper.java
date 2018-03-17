package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TLyric;
import pers.liangshuyi.lotterysystem.po.TLyricExample;

public interface TLyricMapper {
    int countByExample(TLyricExample example);

    int deleteByExample(TLyricExample example);

    int deleteByPrimaryKey(String lyricid);

    int insert(TLyric record);

    int insertSelective(TLyric record);

    List<TLyric> selectByExample(TLyricExample example);

    TLyric selectByPrimaryKey(String lyricid);

    int updateByExampleSelective(@Param("record") TLyric record, @Param("example") TLyricExample example);

    int updateByExample(@Param("record") TLyric record, @Param("example") TLyricExample example);

    int updateByPrimaryKeySelective(TLyric record);

    int updateByPrimaryKey(TLyric record);
}