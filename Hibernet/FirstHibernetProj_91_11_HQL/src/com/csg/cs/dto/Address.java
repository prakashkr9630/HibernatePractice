package com.csg.cs.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	
	/**
	 * @column will change the name is the database column 
	 */
	@Column(name="CITY_STREET")
	private String street;
	@Column(name="CITY_NAME")
	private String city;
	@Column(name="CITY_STATE")
	private String state;
	@Column(name="PIN")
	private String pin;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}			
}
