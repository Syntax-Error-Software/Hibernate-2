package org.jsp.hibernatedemo;

import java.util.Scanner;

import javax.persistence.NoResultException;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchingByIdAndName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id and name:");
		int id = sc.nextInt();
		String name = sc.next();
		Session sess = new Configuration().configure().buildSessionFactory().openSession();
		String hql = "select u from User u where u.id=?1 and u.name=:ps";
		Query<User> query = sess.createQuery(hql);
		query.setParameter(1, id);
		query.setParameter("ps", name);

		try {
			User user = query.getSingleResult();
			System.out.println("Verification Successful");
			System.out.println(user);

		} catch (NoResultException e) {
			System.err.println("Invalid Id or Name");
		}

	}

}
