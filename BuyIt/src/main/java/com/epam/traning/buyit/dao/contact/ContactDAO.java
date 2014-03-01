package com.epam.traning.buyit.dao.contact;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.traning.buyit.model.Contact;

@Repository("contactDAO")
public class ContactDAO implements ContactDAOInterface {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createElement(Contact elem) {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.save(elem);
		} catch (Exception e) {
			System.out.println("I/O Exeption");
			System.err.println(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public Contact getElementById(int id) {
		Session session = null;
		Contact contact = null;
		try {
			session = sessionFactory.openSession();
			contact = (Contact) session.get(Contact.class, id);
		} catch (Exception e) {
			System.out.println("I/O Exeption");
			System.err.println(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return contact;
	}

	@Override
	public void updateElement(Contact elem) {
//		sessionFactory.getCurrentSession().update(elem);
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.update(elem);
		} catch (Exception e) {
			System.out.println("I/O Exeption");
			System.err.println(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public void deleteElement(Contact elem) {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contact> getAllContacts() {
		Session session = null;
		List<Contact> contacts = new ArrayList<Contact>();

		try {
			session = sessionFactory.openSession();
			contacts = session.createCriteria(Contact.class).list();
		} catch (Exception e) {
			System.out.println("I/O Exeption");
			System.err.println(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

		return contacts;
	}

}
