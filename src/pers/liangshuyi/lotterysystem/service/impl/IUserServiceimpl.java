package pers.liangshuyi.lotterysystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.liangshuyi.lotterysystem.mapper.UserMapper;
import pers.liangshuyi.lotterysystem.po.User;
import pers.liangshuyi.lotterysystem.service.IUserSrevice;
/**
 * IuserServiceImpl
 * @author laingshuyi
 *
 */
@Service
public class IUserServiceimpl implements IUserSrevice {
	@Autowired
	public UserMapper userMapper;

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserPwd(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> selectByNameAndPassword(User user) {
		// TODO Auto-generated method stub
		return userMapper.selectByNameAndPassword(user);
	}
	


}
