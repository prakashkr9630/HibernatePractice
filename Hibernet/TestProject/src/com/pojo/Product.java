package com.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Product {
	
	private int productid;
	private String productname;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	
	
	
	
	
	
	

}
