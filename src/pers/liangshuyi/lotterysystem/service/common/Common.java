package pers.liangshuyi.lotterysystem.service.common;

import java.util.List;

public interface Common <T>{
	public T getById(String id);
	public T getByName(String name);
	public T getUserPwd(T t);
	public List<T> findAll();
}
