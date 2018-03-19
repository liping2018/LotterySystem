package pers.liangshuyi.lotterysystem.mapper;

import pers.liangshuyi.lotterysystem.po.Point;

public interface PointMapper {


    int deleteByPrimaryKey(String pointid);

    int insert(Point record);

    int insertSelective(Point record);

    Point selectByPrimaryKey(String pointid);
    int updateByPrimaryKeySelective(Point record);

    int updateByPrimaryKey(Point record);
}