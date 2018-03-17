package pers.liangshuyi.lotterysystem.dao.IUserDao;

import javax.xml.registry.infomodel.User;

/**
 * userMapper
 * @author liangshuyi
 *
 */
public interface IUserMapper {

	public User findByNameAndPassword();

}
