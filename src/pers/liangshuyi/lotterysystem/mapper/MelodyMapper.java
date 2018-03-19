package pers.liangshuyi.lotterysystem.mapper;

import pers.liangshuyi.lotterysystem.po.Melody;

public interface MelodyMapper {

    int deleteByPrimaryKey(String melodyid);

    int insert(Melody record);

    int insertSelective(Melody record);


    Melody selectByPrimaryKey(String melodyid);

    int updateByPrimaryKeySelective(Melody record);

    int updateByPrimaryKey(Melody record);
}