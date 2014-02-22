package com.epam.traning.buyit.dao.address;

import java.util.List;

import com.epam.traning.buyit.dao.GenericDAO;
import com.epam.traning.buyit.model.Address;

public interface AddressDAOInterface extends GenericDAO<Address>{

	public List<Address> getAllAddress();
}
