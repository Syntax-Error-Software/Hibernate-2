package org.jsp.hibernatedemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchingByName {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		//long phone=sc.nextLong();
		String name=sc.next();
		Session sess=new Configuration().configure().buildSessionFactory().openSession();
		String hql="select u from User u where u.name=?1";
		Query<User> query=sess.createQuery(hql);
		query.setParameter(1, name);
		List<User> user=query.getResultList();
		if(user.isEmpty())
		{
			System.err.println("No Data Found");
		}
		else
		{
			for (User user2 : user) {
				System.out.println(user2);
				
			}
		}
	}

}
