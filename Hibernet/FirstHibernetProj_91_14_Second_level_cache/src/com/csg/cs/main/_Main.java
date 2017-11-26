package com.csg.cs.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.UserDetails;
/**
 * this is an example of named query, 
 * @author Prakash
 *
 */

public class _Main {

	public static void main(String[] args) {		

		/*
		 * 
		 * some configuration in userdetails class.
		 * @Cacheable
		 * @Cache(usage=CacheConcurrencyStrategy.READ_WRITE) 
		 */
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();		
		/*UserDetails user = (UserDetails)session.get(UserDetails.class, 1);*/
		Query query =session.createQuery("from UserDetails where userId=1");
		query.setCacheable(true);
		List user  = query.list();
		
		
		session.getTransaction().commit();
		session.close();
		
		
		
		Session session1 = sessionfactory.openSession();
		session1.beginTransaction();		
		/*UserDetails user1 = (UserDetails)session1.get(UserDetails.class, 1);*/
		
		Query query1 =session1.createQuery("from UserDetails where userId=1");
		query1.setCacheable(true);
		List user1  = query1.list();
		
		session1.getTransaction().commit();
		session1.close();
		

	}	
	
}
