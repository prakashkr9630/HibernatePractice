package com.csg.cs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.UserDetails;

public class _Main {

	public static void main(String[] args) {

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		for (int i = 1; i <= 10; i++) {
			UserDetails user = new UserDetails();
			user.setUserName("UserName" + i);
			session.save(user);
		}
		session.getTransaction().commit();
		session.close();

	}

}
