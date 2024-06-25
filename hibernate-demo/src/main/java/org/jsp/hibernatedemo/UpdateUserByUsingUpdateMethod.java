package org.jsp.hibernatedemo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class UpdateUserByUsingUpdateMethod {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session se=factory.openSession();
		Transaction tr=se.beginTransaction();
		User u=new User();
		u.setId(2);
		u.setName("Bhargavi");
		u.setEmail("bagi@gmail.com");
		u.setPhone(733075);
		u.setPassword("bagi123");
		se.update(u);
		tr.commit();

	}

}
