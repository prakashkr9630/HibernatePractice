package com.csg.cs.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.UserDetails;

public class _Main {

	public static void main(String[] args) {		

		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();
		/**
		 * first run this so that it will save some data inside the database 
		 */
		
		
		/*for(int i=0;i<10;i++){
			UserDetails  user = new UserDetails();
			user.setUserName("user "+i);
			session.save(user);
		}*/
		
		/**
		 * change <property name="hbm2ddl.auto">create</property> to update
		 * import org.hibernate for query  
		 * first run the above commented code and after running comment them again
		 * and then run this code
		 *   
		 */
		Query query = session.createQuery("from UserDetails where userId > 7");
		/**
		 * for pagination
		 * 
		 */
		 
		query.setFirstResult(4);
		query.setMaxResults(2);
		
		List<UserDetails> list = query.list();
//		System.out.println("Size -"+list.size());
		for(UserDetails u :list){
			System.out.println("USer:"+u.getUserName());
		}
						
		
		
		session.getTransaction().commit();
		session.close();
		
		

	}

//	we can just pull some of the column, like:
//		Query query = session.createQuery("select  name from UserDetails where userId > 7");
//	Aggregated function will work well with HQL
//	
	
	
	
}
