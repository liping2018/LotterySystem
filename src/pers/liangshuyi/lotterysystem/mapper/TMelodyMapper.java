package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TMelody;
import pers.liangshuyi.lotterysystem.po.TMelodyExample;

public interface TMelodyMapper {
    int countByExample(TMelodyExample example);

    int deleteByExample(TMelodyExample example);

    int deleteByPrimaryKey(String melodyid);

    int insert(TMelody record);

    int insertSelective(TMelody record);

    List<TMelody> selectByExample(TMelodyExample example);

    TMelody selectByPrimaryKey(String melodyid);

    int updateByExampleSelective(@Param("record") TMelody record, @Param("example") TMelodyExample example);

    int updateByExample(@Param("record") TMelody record, @Param("example") TMelodyExample example);

    int updateByPrimaryKeySelective(TMelody record);

    int updateByPrimaryKey(TMelody record);
}