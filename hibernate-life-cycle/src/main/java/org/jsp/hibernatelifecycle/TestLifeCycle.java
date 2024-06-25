package org.jsp.hibernatelifecycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestLifeCycle {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Person p=new Person();  // Transient state
		p.setName("Nandu");
		p.setPhone(9515225514L);
		t.begin();
		manager.persist(p); // Persistence State
		t.commit();
		
		p.setName("Vamshi");
		p.setPhone(8125625514L);
		t.begin();
		t.commit();
		
		p.setName("Praveen");
		p.setPhone(654627);
		t.begin();
		t.commit();
		
		manager.detach(p);// Detached State
		p.setName("Mahendra");
		p.setPhone(9515625514L);
		t.begin();
		t.commit();
		
	}

}
