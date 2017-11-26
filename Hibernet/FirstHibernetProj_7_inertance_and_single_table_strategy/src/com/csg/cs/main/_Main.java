package com.csg.cs.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.csg.cs.dto.FourWheeler;
import com.csg.cs.dto.TwoWheeler;
import com.csg.cs.dto.Vehicle;

public class _Main {

	public static void main(String[] args) {
				
		

		
		
		Vehicle vh = new Vehicle();
		vh.setVehicleName("Car");
		
		TwoWheeler bike =  new TwoWheeler();
		bike.setVehicleName("herohainda");
		bike.setSteeringHandle("bike steering handle");
		
		

		FourWheeler car =  new FourWheeler();
		car.setVehicleName("Maruti");
		car.setSteeringWheel("Maruti steering handle");

		
		
		
		
		/*user to create session object */
		SessionFactory sessionfactory = new  Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();
		session.beginTransaction();		
		session.save(vh);
		session.save(bike);
		session.save(car);
		session.getTransaction().commit();		
		session.close();
		
		
	}

}
