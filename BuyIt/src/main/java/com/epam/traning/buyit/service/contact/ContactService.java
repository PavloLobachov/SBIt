package com.epam.traning.buyit.service.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.epam.traning.buyit.dao.contact.ContactDAO;
import com.epam.traning.buyit.model.Contact;

@Service("contactService")
public class ContactService implements ContactServiceInterface {
	
	@Autowired
	ContactDAO contactDAO;

	@Override
	@Transactional
	public void createElement(Contact elem) {
		contactDAO.createElement(elem);
	}

	@Override
	@Transactional
	public Contact getElementById(int id) {
		return contactDAO.getElementById(id);
	}

	@Override
	@Transactional
	public void updateElement(Contact elem) {
		contactDAO.updateElement(elem);
	}

	@Override
	@Transactional
	public void deleteElement(Contact elem) {
		throw new UnsupportedOperationException();
	}

}
