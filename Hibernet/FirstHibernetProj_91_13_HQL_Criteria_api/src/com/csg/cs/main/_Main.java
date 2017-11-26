package com.csg.cs.main;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.csg.cs.dto.UserDetails;
/**
 * this is an example og named query, 
 * @author Prakash
 *
 */

public class _Main {

	public static void main(String[] args) {		

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		
		/*
		 * here i'm assuming that the record are already updated into the database. 
		 */
		

		Criteria criteria  = session.createCriteria(UserDetails.class);
		/*Many restriction can be added
		 * 
		 * the much restriction added all will be in and condition , 
		 * 
		 *  for OR need to imply like Restrictions.or(lhs, rhs) 
		 * 
		 * */
		criteria.add(Restrictions.eq("userId", 5));
		
		List<UserDetails> userdetail = (List<UserDetails>)criteria.list();
		for(UserDetails u : userdetail){
			System.out.println(u.getUserId()+":"+u.getUserName());
		}
				
		
		
		
		session.getTransaction().commit();
		session.close();
		
		

	}	
	
}
