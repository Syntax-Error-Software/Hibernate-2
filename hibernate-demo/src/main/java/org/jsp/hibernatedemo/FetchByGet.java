package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FetchByGet {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id:");
		int id=s.nextInt();
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session se=factory.openSession();
		User u=se.get(User.class, id);
		if(u!=null)
		{
			System.out.println("Data Found");
			System.out.println(u);
		}
		else
		{
			System.err.println("Invalid Id");
		}
		
	}

}
