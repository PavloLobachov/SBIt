package com.epam.traning.buyit.service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.traning.buyit.dao.user.UserDAO;
import com.epam.traning.buyit.model.User;

@Service("userService")
public class UserService implements UserServiseInterfase {

	@Autowired
	UserDAO userDAO;

	@Override
	@Transactional
	public void createElement(User elem) {
		userDAO.createElement(elem);
	}

	@Override
	@Transactional
	public User getElementById(int id) {
		return userDAO.getElementById(id);
	}

	@Override
	@Transactional
	public void updateElement(User elem) {
		userDAO.updateElement(elem);
	}

	@Override
	@Transactional
	public void deleteElement(User elem) {
		userDAO.deleteElement(elem);
	}

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

}
