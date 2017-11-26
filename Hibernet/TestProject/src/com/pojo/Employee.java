package com.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class Employee {
	
	public Employee(){
		
	}
	

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Address address;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="PRODUCT",joinColumns=@JoinColumn(name="item"))
	private List<Product> product = new ArrayList<Product>();
	
	
	public Employee(int i,String name,Address add,List<Product> prod){
		setId(i);
		setName(name);
		setAddress(add);
		setProduct(prod);		
	}
		
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public List<Product> getProduct() {
		return product;
	}



	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	
}
