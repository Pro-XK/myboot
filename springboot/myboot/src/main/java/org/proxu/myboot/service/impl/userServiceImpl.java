package org.proxu.myboot.service.impl;

import org.proxu.myboot.dao.UserDao;
import org.proxu.myboot.pojo.entity.User;
import org.proxu.myboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/17 0017 0:09
 */
@Service("userService")
@Transactional
public class userServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> findAllUser() throws Exception {
		return userDao.findListByQuery(new User());
	}

	@Override
	public boolean saveUser(User user) throws Exception {
		Integer count = userDao.save(user);
		if(count>0){
			return true;
		}
		return false;
	}
//
	@Override
	public boolean updateUser(User user) throws Exception {
		Integer count = userDao.update(user);
		if(count>0){
			return true;
		}
		return false;
	}
}
