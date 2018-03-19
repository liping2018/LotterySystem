package pers.liangshuyi.lotterysystem.service;

import java.util.List;

import pers.liangshuyi.lotterysystem.po.User;
import pers.liangshuyi.lotterysystem.web.common.Common;
/**
 * IUserservice
 * @author laingshuyi
 *
 */
public interface IUserSrevice extends Common<User>{

	List<User> selectByNameAndPassword(User user);
	
}
