package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TIntegral;
import pers.liangshuyi.lotterysystem.po.TIntegralExample;

public interface TIntegralMapper {
    int countByExample(TIntegralExample example);

    int deleteByExample(TIntegralExample example);

    int deleteByPrimaryKey(String integralid);

    int insert(TIntegral record);

    int insertSelective(TIntegral record);

    List<TIntegral> selectByExample(TIntegralExample example);

    TIntegral selectByPrimaryKey(String integralid);

    int updateByExampleSelective(@Param("record") TIntegral record, @Param("example") TIntegralExample example);

    int updateByExample(@Param("record") TIntegral record, @Param("example") TIntegralExample example);

    int updateByPrimaryKeySelective(TIntegral record);

    int updateByPrimaryKey(TIntegral record);
}