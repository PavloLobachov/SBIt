package com.epam.traning.buyit.dao.user;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.traning.buyit.model.User;

@Repository("userDAO")
public class UserDAO implements UserDAOInterface {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createElement(User elem) {
		System.out.println("public void createElement(User elem)");
		sessionFactory.getCurrentSession().persist(elem);
	}

	@Override
	public User getElementById(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);
	}

	@Override
	public void updateElement(User elem) {
		sessionFactory.getCurrentSession().update(elem);

	}

	@Override
	public void deleteElement(User elem) {
		sessionFactory.getCurrentSession().delete(elem);
	}

	@Override
	public List<User> getAllUsers() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean checkLogin(String login) {
		throw new UnsupportedOperationException();
	}

	@Override
	public User getUser(String login, String password) {
		throw new UnsupportedOperationException();
	}

	@Override
	public User getUserByLogin(String login) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean changePasswordByUserId(int id, String newPassword) {
		throw new UnsupportedOperationException();
	}

}
