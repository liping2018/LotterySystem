package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TSong;
import pers.liangshuyi.lotterysystem.po.TSongExample;

public interface TSongMapper {
    int countByExample(TSongExample example);

    int deleteByExample(TSongExample example);

    int deleteByPrimaryKey(String songid);

    int insert(TSong record);

    int insertSelective(TSong record);

    List<TSong> selectByExample(TSongExample example);

    TSong selectByPrimaryKey(String songid);

    int updateByExampleSelective(@Param("record") TSong record, @Param("example") TSongExample example);

    int updateByExample(@Param("record") TSong record, @Param("example") TSongExample example);

    int updateByPrimaryKeySelective(TSong record);

    int updateByPrimaryKey(TSong record);
}