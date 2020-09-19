package org.proxu.myboot.dao;

import org.proxu.myboot.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * TODO
 *
 * @author ProXu
 * @version 1.0
 * @date 2020/9/16 0016 21:37
 */
@Repository
public interface UserDao {
	List<User> findListByQuery(User entity) throws Exception;

	Integer save(User entity) throws Exception;

	Integer update(User entity) throws Exception;

}
