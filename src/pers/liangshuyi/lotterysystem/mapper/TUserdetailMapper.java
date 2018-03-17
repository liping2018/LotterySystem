package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pers.liangshuyi.lotterysystem.po.TUserdetail;
import pers.liangshuyi.lotterysystem.po.TUserdetailExample;

public interface TUserdetailMapper {
    int countByExample(TUserdetailExample example);

    int deleteByExample(TUserdetailExample example);

    int deleteByPrimaryKey(String userid);

    int insert(TUserdetail record);

    int insertSelective(TUserdetail record);

    List<TUserdetail> selectByExample(TUserdetailExample example);

    TUserdetail selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") TUserdetail record, @Param("example") TUserdetailExample example);

    int updateByExample(@Param("record") TUserdetail record, @Param("example") TUserdetailExample example);

    int updateByPrimaryKeySelective(TUserdetail record);

    int updateByPrimaryKey(TUserdetail record);
}