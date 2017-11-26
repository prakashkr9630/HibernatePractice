package com.main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.pojo.Address;
import com.pojo.Employee;
import com.pojo.Product;

public class _main {

	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setName("Prakash kumar");
		Address address = new Address();
		address.setStreetno("181");
		address.setStreetname("hinzewad");		
		emp.setAddress(address);
		
		emp.setProduct(getProductList());
		
		SessionFactory sessionfactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionfactory.openSession();		
		session.beginTransaction();
		
		 session.save(emp);
		
					
		session.getTransaction().commit();
		session.close();
		
		/*----------------------------*/
		emp=null;
		session = sessionfactory.openSession();		
		session.beginTransaction();
		
		
		emp = (Employee) session.get(Employee.class, 1);		
		session.getTransaction().commit();
		session.close();
		
		System.out.println(emp.getProduct().size());
		
		
		
		
		
		
		
		
	}

	private static List<Product> getProductList() {

		
		List<Product> prod_list =  new ArrayList<Product>();
		Product p1= new Product();
		p1.setProductid(121);
		p1.setProductname("p1 product");
		
		prod_list.add(p1);
		
		Product p2= new Product();
		p2.setProductid(122);
		p2.setProductname("p2 product");
		
		prod_list.add(p2);
		
		
		Product p3= new Product();
		p3.setProductid(123);
		p3.setProductname("p3 product");
		
		prod_list.add(p3);
		
		
		Product p4= new Product();
		p4.setProductid(124);
		p4.setProductname("p4 product");
		
		prod_list.add(p4);
	
		return prod_list;
		
	}
}
