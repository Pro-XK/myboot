package org.proxu.myboot.service;

import org.proxu.myboot.pojo.entity.User;

import java.util.List;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/17 0017 0:05
 */
public interface UserService {
	List<User> findAllUser() throws Exception;


	boolean saveUser(User user) throws Exception;

	boolean updateUser(User user) throws Exception;
}
