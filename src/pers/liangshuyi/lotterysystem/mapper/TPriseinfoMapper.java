package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TPriseinfo;
import pers.liangshuyi.lotterysystem.po.TPriseinfoExample;

public interface TPriseinfoMapper {
    int countByExample(TPriseinfoExample example);

    int deleteByExample(TPriseinfoExample example);

    int insert(TPriseinfo record);

    int insertSelective(TPriseinfo record);

    List<TPriseinfo> selectByExample(TPriseinfoExample example);

    int updateByExampleSelective(@Param("record") TPriseinfo record, @Param("example") TPriseinfoExample example);

    int updateByExample(@Param("record") TPriseinfo record, @Param("example") TPriseinfoExample example);
}