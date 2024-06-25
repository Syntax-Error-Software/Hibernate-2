package org.jsp.customerfoodapp;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Customer c=new Customer();
		c.setAge(23);
		c.setEmail("nandu@gmail.com");
		c.setGender("male");
		c.setName("Nandieswar");
		c.setPassword("nandu123");
		c.setPhone(9515225514L);
		
		FoodOrder fd=new  FoodOrder();
		fd.setAddress("bangalore");
		fd.setCost(150);
		fd.setFood_item("Biryani");
		
		
		fd.setCustomer(c);
		c.setFd(Arrays.asList(fd));
		t.begin();
		manager.persist(c);
		t.commit();
		
		
	}

}
