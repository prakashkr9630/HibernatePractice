package com.csg.cs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.UserDetails;
import com.csg.cs.dto.Vehicle;

public class _Main {

	public static void main(String[] args) {
		
		/*this is for type value example , where we have nested class called address*/
		

		
		UserDetails userdeatials = new UserDetails();		
		userdeatials.setUserName("Prakkash");
		Vehicle vh = new Vehicle();
		vh.setVehicleName("Car");
		
		userdeatials.setVh(vh);
		
		/*user to create session object */
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();		
		session.save(userdeatials);
		session.save(vh);
		session.getTransaction().commit();		
		session.close();
		
		
	}

}
