package com.csg.cs.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
/*		first data will be inserted for this module
		run this once to insert recored into the database  and then comment that
		
		and modify hibernat xml to update from create
		
		*/
		
		
//		for(int i=0;i<10;i++){
//			UserDetails user = new UserDetails();
//			user.setUserName("User:"+i);
//			session.save(user);
//		}
			
		
		
		Query query =session.getNamedQuery("userdetail.id");
		query.setString(0, "6");
		List<UserDetails> list = query.list();
		System.out.println(list.size());
		for(UserDetails u : list){
			System.out.println(u.getUserName());
		}
		
		session.getTransaction().commit();
		session.close();
		
		

	}	
	
}
