package com.csg.cs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.UserDetails;

public class _Main {

	public static void main(String[] args) {
		
		/*this is for type value example , where we have nested class called address*/
		

		
		UserDetails userdeatials = new UserDetails();
		
		
		
		/*user to create session object */
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();		
		session.save(userdeatials);
		session.getTransaction().commit();		
		session.close();

		
		
		
	}

}
