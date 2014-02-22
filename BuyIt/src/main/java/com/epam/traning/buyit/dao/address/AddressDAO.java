package com.epam.traning.buyit.dao.address;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.epam.traning.buyit.dao.utils.connection.ConnectionManager;
import com.epam.traning.buyit.model.Address;

@Repository
public class AddressDAO implements AddressDAOInterface {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(AddressDAO.class);

	@Override
	public void createElement(Address elem) {
		Session session = null;
		try {
			session = ConnectionManager.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(elem);
			session.getTransaction().commit();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public Address getElementById(int id) {
		Session session = null;
		Address address = null;
		try {
			session = ConnectionManager.getSessionFactory().openSession();
			address = (Address) session.load(Address.class, id);
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return address;
	}

	@Override
	public void updateElement(Address elem) {
		Session session = null;
		try {
			session = ConnectionManager.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(elem);
			session.getTransaction().commit();
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}

	}

	@Override
	public void deleteElementById(int id) {
		throw new UnsupportedOperationException();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Address> getAllAddress() {
		Session session = null;
        List<Address> studs = new ArrayList<Address>();
        try {
            session = ConnectionManager.getSessionFactory().openSession();
            studs = session.createCriteria(Address.class).list();
        } catch (Exception e) {
        	LOGGER.error(e.getMessage());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return studs;
	}

}
