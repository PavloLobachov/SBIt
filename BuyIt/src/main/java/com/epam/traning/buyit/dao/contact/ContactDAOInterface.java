package com.epam.traning.buyit.dao.contact;

import java.util.List;

import com.epam.traning.buyit.dao.GenericDAO;
import com.epam.traning.buyit.model.Contact;

public interface ContactDAOInterface extends GenericDAO<Contact>{

	List<Contact> getAllContacts();
}
