package com.epam.traning.buyit.service.user;

import java.util.List;

import com.epam.traning.buyit.model.User;
import com.epam.traning.buyit.service.CrudService;

public interface UserServiseInterfase extends CrudService<User> {
	
	List<User> getAllUsers();

}
