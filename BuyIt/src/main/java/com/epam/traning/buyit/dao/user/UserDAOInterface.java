package com.epam.traning.buyit.dao.user;

import java.util.List;

import com.epam.traning.buyit.dao.GenericDAO;
import com.epam.traning.buyit.model.User;

public interface UserDAOInterface extends GenericDAO<User> {
	
	List<User> getAllUsers();
	
	boolean checkLogin(String login);
	
	User getUser(String login, String password);
	
	User getUserByLogin(String login);

    boolean changePasswordByUserId(int id, String newPassword);
}
