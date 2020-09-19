package org.proxu.myboot.controller;

import org.proxu.myboot.pojo.entity.User;
import org.proxu.myboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/17 0017 0:01
 */
@Controller("userController")
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/list")
	@ResponseBody
	public List<User> findListByQuery() throws Exception{
		return userService.findAllUser();
	}
	@GetMapping("/save")
	@ResponseBody
	public boolean saveUser(User user) throws Exception{
		return userService.saveUser(user);
	}

	@GetMapping("update")
	@ResponseBody
	public boolean updateUser(User user) throws Exception{
		return userService.updateUser(user);
	}
}
