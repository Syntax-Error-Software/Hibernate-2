package org.jsp.hibernatedemo;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchingAllUsers {
	public static void main(String[] args) {
		Session sess=new Configuration().configure().buildSessionFactory().openSession();
		Query<User> query=sess.createQuery("select u from User u");
		List<User> users=query.getResultList();
		if(users.isEmpty())
		{
			System.err.println("No Users Present");
		}
		else
		{
			for (User user : users) {
				System.out.println(user);
			}
		}

	}

}
