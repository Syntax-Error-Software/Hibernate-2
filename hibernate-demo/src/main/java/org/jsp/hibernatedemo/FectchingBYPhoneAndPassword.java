package org.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FectchingBYPhoneAndPassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter phone and password:");
		long phone=sc.nextLong();
		String password=sc.next();
		Session sess=new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u from User u where u.phone=?1 and u.password=:ps";
		Query<User> query=sess.createQuery(hql);
		query.setParameter(1, phone);
		query.setParameter("ps", password);
		
	    try
	    {
	    	User user=query.getSingleResult();
	    	System.out.println("Verification Successful");
	    	System.out.println(user);
	    	
	    }
	    catch(NoResultException e)
	    {
	    	System.err.println("Invalid Phone or Password");
	    }

	}

}
