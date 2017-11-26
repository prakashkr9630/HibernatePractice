package com.comparble_comparator;

import java.util.Comparator;

public class Pojo_comparator implements Comparator<Pojo_comparator>{
	
	private String name;
	private int price;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int compare(Pojo_comparator val1, Pojo_comparator val2) {

		return 0;
	}
	
	
	
	
	
	
	
	
	

}
