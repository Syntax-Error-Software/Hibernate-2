package org.jsp.hibernatelifecycle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeletePerson {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Person p=manager.find(Person.class, 1);
		if(p!=null)
		{
			manager.remove(p);
			t.begin();
			t.commit();
		}
		
	}

}
