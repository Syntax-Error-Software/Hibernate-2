package org.jsp.hibernatedemo;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class DeleteUser {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id:");
		int id=sc.nextInt();
		Session sess=new Configuration().configure().buildSessionFactory().openSession();
		Transaction t=sess.beginTransaction();
		User u=sess.get(User.class, id);
		if(u!=null)
		{
			sess.delete(u);
			t.commit();
		}
		else
		{
			System.err.println("Id Not Found In The Database");
		}
	}

}
