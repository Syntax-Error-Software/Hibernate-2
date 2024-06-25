package org.jsp.hibernatedemo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class FetchingAllIds {
	public static void main(String[] args) {
		Session se=new Configuration().configure().buildSessionFactory().openSession();
		String qry="select u.id from User u";
		Query<Integer> query=se.createQuery(qry);
		for(int id:query.getResultList())
		{
			System.out.println(id);
		}
	}


}
