package com.comparble_comparator;

public class Pojo implements Comparable<Pojo>{
	
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
	public int compareTo(Pojo val) {		
		return this.age - val.getAge();
		//return val.getAge() - this.age;
		
	}
	
	
	
	
	
	
	
	
	

}
