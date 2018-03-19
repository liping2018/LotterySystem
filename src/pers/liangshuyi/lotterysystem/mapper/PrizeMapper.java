package pers.liangshuyi.lotterysystem.mapper;

import pers.liangshuyi.lotterysystem.po.Prize;

public interface PrizeMapper {


    int deleteByPrimaryKey(Integer prizeid);

    int insert(Prize record);

    int insertSelective(Prize record);


    Prize selectByPrimaryKey(Integer prizeid);

    int updateByPrimaryKeySelective(Prize record);

    int updateByPrimaryKey(Prize record);
}