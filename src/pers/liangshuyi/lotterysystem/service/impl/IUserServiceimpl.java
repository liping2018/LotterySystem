package pers.liangshuyi.lotterysystem.service.impl;

import java.util.List;

import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pers.liangshuyi.lotterysystem.dao.IUserDao.IUserMapper;
import pers.liangshuyi.lotterysystem.service.IUserSrevice;
/**
 * IuserServiceImpl
 * @author laingshuyi
 *
 */
@Service
public class IUserServiceimpl implements IUserSrevice {
	@Autowired
	public IUserMapper userMapper;
	
	public List<User> findAll() {
		return null;
	}

	public User getById(String id) {
		return null;
	}

	public User getByName(String name) {
		return null;
	}

	public User getUserPwd(User t) {
		return userMapper.findByNameAndPassword();
	}

}
