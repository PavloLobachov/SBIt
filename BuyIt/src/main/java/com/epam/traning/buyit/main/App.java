package com.epam.traning.buyit.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.epam.traning.buyit.model.User;
import com.epam.traning.buyit.service.CrudService;
import com.epam.traning.buyit.service.UserService.UserService;

public class App {
	
	public static void main(String[] args) {
		System.out.println("load context");
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application-config.xml");
		User em = new User();
		em.setIdUser(1111);
		em.setFirstName("Paul");
		em.setLastName("German");
		em.setLogin("paul");
		em.setPassword("1111");
		em.setRole(false);
		
		CrudService<User> service = (CrudService<User>) context.getBean("userService");
		service.createElement(em);
		System.out.println("Updated age :" + service.getElementById(1111).getFirstName());		
		em.setFirstName("John");
		service.updateElement(em);
		System.out.println("Updated age :" + service.getElementById(1111).getFirstName());
		service.deleteElement(em);
		context.close();
	}

}
