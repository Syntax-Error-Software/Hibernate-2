package org.jsp.hibernatedemo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class UpdateUser {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session se=factory.openSession();
		Transaction tr=se.beginTransaction();
		User u=se.get(User.class, 1); // Persistance state
		u.setName("Mahadev");
		u.setEmail("maha@gmail.com");
		u.setPassword("maha123");
		tr.commit();
	}

}
