package com.csg.cs.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.Address;
import com.csg.cs.dto.UserDetails;

public class _Main {

	public static void main(String[] args) {

		
//		UserDetails userdeatials = new UserDetails();
//		userdeatials.setUserId(3);
//		userdeatials.setUserName("first user");
//		userdeatials.setTodadate(new Date());
//		userdeatials.setAddress("pune");
//		userdeatials.setPassword("password");
//		userdeatials.setDescription("this is a long description");
//		
//		
//		/*user to create session object */
//		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
//		Session session = sessionfactory.openSession();
//		session.beginTransaction();		
//		session.save(userdeatials);
//		session.getTransaction().commit();		
//		session.close();
		
		//process to fetch data from userdetails 
//		userdeatials = null;
//		session = sessionfactory.openSession();
//		session.beginTransaction();
//		// 3 is the id , its simmiler to "select * from userdetails where id=3";
//		userdeatials = (UserDetails)session.get(UserDetails.class, 3);
//		System.out.println(userdeatials .getUserId()+"\n"+userdeatials.getUserName()+"\n"+userdeatials.getAddress()+"\n"+userdeatials.getDescription());
		
		/*--------------------------------------------------------------------------------*/
		
		/*this is for type value example , where we have nested class called address*/
		

		
		UserDetails userdeatials = new UserDetails();
		userdeatials.setUserId(1);
		userdeatials.setUserName("prakash");
		Address addressvaluetype = new Address();
		
		addressvaluetype.setCity("pune");
		addressvaluetype.setPin("12334");
		addressvaluetype.setState("Maharastra");
		addressvaluetype.setStreet("Some street");
		
		userdeatials.setAddressvaluetype(addressvaluetype );
		userdeatials.setDescription("little description");
		userdeatials.setTodadate(new Date());
		
		
		
		/*user to create session object */
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();		
		session.save(userdeatials);
		session.getTransaction().commit();		
		session.close();

		
		
		
	}

}
