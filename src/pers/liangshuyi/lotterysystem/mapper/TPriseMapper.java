package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TPrise;
import pers.liangshuyi.lotterysystem.po.TPriseExample;

public interface TPriseMapper {
    int countByExample(TPriseExample example);

    int deleteByExample(TPriseExample example);

    int deleteByPrimaryKey(Integer priseid);

    int insert(TPrise record);

    int insertSelective(TPrise record);

    List<TPrise> selectByExample(TPriseExample example);

    TPrise selectByPrimaryKey(Integer priseid);

    int updateByExampleSelective(@Param("record") TPrise record, @Param("example") TPriseExample example);

    int updateByExample(@Param("record") TPrise record, @Param("example") TPriseExample example);

    int updateByPrimaryKeySelective(TPrise record);

    int updateByPrimaryKey(TPrise record);
}