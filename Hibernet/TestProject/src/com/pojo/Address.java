package com.pojo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String streetno;
	private String streetname;
	
	
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	public String getStreetname() {
		return streetname;
	}
	public void setStreetname(String streetname) {
		this.streetname = streetname;
	}
	
	
	
	
	

}
