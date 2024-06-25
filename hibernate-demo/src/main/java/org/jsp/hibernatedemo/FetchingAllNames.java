package org.jsp.hibernatedemo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchingAllNames {
	public static void main(String[] args) {
		Session se=new Configuration().configure().buildSessionFactory().openSession();
		String qry="select u.name from User u";
		Query<String> query=se.createQuery(qry);
		for(String name:query.getResultList())
		{
			System.out.println(name);
		}
	}


}
