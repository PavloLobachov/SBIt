package com.epam.traning.buyit.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.traning.buyit.model.Address;
import com.epam.traning.buyit.model.Contact;
import com.epam.traning.buyit.model.User;
import com.epam.traning.buyit.service.address.AddressServiceInterface;
import com.epam.traning.buyit.service.contact.ContactServiceInterface;
import com.epam.traning.buyit.service.user.UserServiseInterfase;

public class App {
	
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		User user = new User();
		Contact contact = new Contact();
		Address address = new Address();
		
		user.setFirstName("Andy");
		user.setLastName("German");
		user.setLogin("paul");
		user.setPassword("1111");
		user.setRole(false);
		user.setBan(false);
		
		UserServiseInterfase service = (UserServiseInterfase) context.getBean("userService");
		service.createElement(user);
		System.out.println("Created user :" + service.getElementById(user.getIdUser()).getFirstName());
		
		contact.setUser(service.getElementById(user.getIdUser()));
		contact.setPhone("0636540229");
		contact.setEmail("deltaxxx@ukr.net");
		
		ContactServiceInterface contactService = (ContactServiceInterface) context.getBean("contactService");
		contactService.createElement(contact);
		System.out.println("Email is:" + contactService.getElementById(contact.getIdContact()).getEmail());
	
		address.setCity("Lviv");
		address.setContact(contactService.getElementById(contact.getIdContact()));
		address.setFlat("34");
		address.setHouse("12");
		address.setRegion("--------------");
		address.setStreet("Kryva");
		address.setZipCode("23124");
		
		AddressServiceInterface addressService = (AddressServiceInterface) context.getBean("addressService");
		addressService.createElement(address);
		System.out.println("Sity is :" + addressService.getElementById(address.getId_address()).getCity());
		
//		System.out.println("Create name :" + service.getElementById(user.getIdUser()).getFirstName());		
//		user.setFirstName("John");
//		service.updateElement(user);
//		System.out.println("Updated name :" + service.getElementById(user.getIdUser()).getFirstName());
//		service.deleteElement(user);
		context.close();
	}

}
