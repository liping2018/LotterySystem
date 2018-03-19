package pers.liangshuyi.lotterysystem.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pers.liangshuyi.lotterysystem.po.User;
import pers.liangshuyi.lotterysystem.service.IUserSrevice;
import pers.liangshuyi.lotterysystem.web.common.Common;

@Controller
@RequestMapping("/user")
public class UserController implements Common<User>{
	@Autowired
	public IUserSrevice service;

	@RequestMapping("/login")
	public String login(){
		return "index1";
	}
	
	@RequestMapping(value="/userlogin",method=RequestMethod.GET)
	public String userlogin(User user){
		System.out.println(user.getUsername()+"  "+user.getPassword());
		List<User> selectByNameAndPassword = service.selectByNameAndPassword(user);
		System.out.println("select" + selectByNameAndPassword.get(0).getName());
		return "login";
	}
	@RequestMapping("/getAllperson")
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
}
