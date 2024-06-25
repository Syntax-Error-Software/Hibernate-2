package org.jsp.hibernatedemo;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class FetchByLoad {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id:");
		int id=sc.nextInt();
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session se=factory.openSession();
		User u=se.load(User.class, id);
		try 
		{
			System.out.println(u);
		}
		catch (Exception e) 
		{
			System.err.println("Invalid Id");
		}
	}

}
