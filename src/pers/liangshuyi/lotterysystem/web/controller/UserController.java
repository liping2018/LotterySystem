package pers.liangshuyi.lotterysystem.web.controller;

import java.util.List;

import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import pers.liangshuyi.lotterysystem.service.IUserSrevice;
import pers.liangshuyi.lotterysystem.web.common.Common;


@Controller
@RequestMapping("/user")
public class UserController implements Common<User>{
	@Autowired
	public IUserSrevice service;
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping("userlogin")
	public String userlogin(User user){
		
		return "index";
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
