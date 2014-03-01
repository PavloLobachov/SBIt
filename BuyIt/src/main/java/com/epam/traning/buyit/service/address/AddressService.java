package com.epam.traning.buyit.service.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.traning.buyit.dao.address.AddressDAO;
import com.epam.traning.buyit.model.Address;


@Service("addressService")
public class AddressService implements AddressServiceInterface {
	
	@Autowired
	AddressDAO addressDAO;

	@Override
	@Transactional
	public void createElement(Address elem) {
		addressDAO.createElement(elem);
	}

	@Override
	@Transactional
	public Address getElementById(int id) {
		return addressDAO.getElementById(id);
	}

	@Override
	@Transactional
	public void updateElement(Address elem) {
		addressDAO.updateElement(elem);
	}

	@Override
	@Transactional
	public void deleteElement(Address elem) {
		throw new UnsupportedOperationException();

	}

}
