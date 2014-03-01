package com.epam.traning.buyit.dao.address;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.epam.traning.buyit.model.Address;

@Repository("addressDAO")
public class AddressDAO implements AddressDAOInterface {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createElement(Address elem) {
//		sessionFactory.getCurrentSession().save(elem);
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
	public Address getElementById(int id) {
//		return (Address) sessionFactory.getCurrentSession().load(Address.class,
//				id);
		Session session = null;
		Address address = null;
		try {
			session = sessionFactory.openSession();
			address = (Address) session.get(Address.class, id);
		} catch (Exception e) {
			System.out.println("I/O Exeption");
			System.err.println(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return address;
	}

	@Override
	public void updateElement(Address elem) {
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
	public void deleteElement(Address elem) {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAllAddress() {
		Session session = null;
		List<Address> address = new ArrayList<Address>();

		try {
			session = sessionFactory.openSession();
			address = session.createCriteria(Address.class).list();
		} catch (Exception e) {
			System.out.println("I/O Exeption");
			System.err.println(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

		return address;
	}

}
