package com.epam.traning.buyit.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.traning.buyit.dao.user.UserDAO;
import com.epam.traning.buyit.model.User;
import com.epam.traning.buyit.service.CrudService;

@Service("userService")
public class UserService implements CrudService<User> {

	@Autowired
	UserDAO userDAO;

	@Override
	@Transactional
	public void createElement(User elem) {
		System.out.println("public void createElement(User elem)");
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

}
