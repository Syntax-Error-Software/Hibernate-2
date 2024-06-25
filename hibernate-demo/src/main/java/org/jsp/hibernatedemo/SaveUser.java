package org.jsp.hibernatedemo;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
public class SaveUser {
	public static void main(String[] args) 
	{
		User user=new User();
		user.setName("Ram");
		user.setPhone(951522);
		user.setEmail("praveen@gmail.com");
		user.setPassword("praveen@123");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		int id=(Integer) s.save(user);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("The Generated Id Is:"+id);
		
	}

}
