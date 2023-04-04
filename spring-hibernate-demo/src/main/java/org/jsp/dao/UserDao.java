package org.jsp.dao;

import java.util.List;

import org.jsp.dto.User;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class UserDao extends HibernateDaoSupport {
	@Transactional
	public User saveUser(User user) {
		getHibernateTemplate().save(user);
		return user;
	}

	@Transactional
	public User updateUser(User user) {
		getHibernateTemplate().update(user);
		return user;
	}

	public User getUserById(int id) {
		return getHibernateTemplate().get(User.class, id);
	}

	@Transactional
	public boolean deleteUser(int id) {
		User u = getUserById(id);
		if (u != null) {
			getHibernateTemplate().delete(u);
			return true;
		}
		return false;
	}

	public List<User> getAllUsers() {
		return getHibernateTemplate().loadAll(User.class);
	}
}
