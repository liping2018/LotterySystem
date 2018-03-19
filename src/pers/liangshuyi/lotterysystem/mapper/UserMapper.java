package pers.liangshuyi.lotterysystem.mapper;

import java.util.List;

import pers.liangshuyi.lotterysystem.po.User;

public interface UserMapper {

    int deleteByPrimaryKey(String userid);

    int insert(User record);

    int insertSelective(User record);


    User selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    List<User> selectByNameAndPassword(User user);
}