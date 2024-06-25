package org.jsp.hibernatedemo;

import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FetchingAllPhoneNumbers {
	public static void main(String[] args) {
		Session se=new Configuration().configure().buildSessionFactory().openSession();
		String qry="select u.phone from User u";
		Query<Long> query=se.createQuery(qry);
		for(long phone:query.getResultList())
		{
			System.out.println(phone);
		}
	}

}
