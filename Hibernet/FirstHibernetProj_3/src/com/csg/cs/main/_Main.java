package com.csg.cs.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.Address;
import com.csg.cs.dto.UserDetails;

public class _Main {

	public static void main(String[] args) {
		
		/*this is for type value example , where we have nested class called address*/
		

		
		UserDetails userdeatials = new UserDetails();
		Set<Address> set = new HashSet();
		Address ad1 = new Address();
		ad1.setCity("city1");
		ad1.setPin("pin1");
		ad1.setState("state1");
		ad1.setStreet("street1");
		set.add(ad1);
		Address ad2 = new Address();
		ad2.setCity("city2");
		ad2.setPin("pin3");
		ad2.setState("state2");
		ad2.setStreet("street2");
		set.add(ad2);
		userdeatials.setListOfAddress(set);
		
		
		
		/*user to create session object */
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();		
		session.save(userdeatials);
		session.getTransaction().commit();		
		session.close();

		
		
		
	}

}
