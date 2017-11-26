package com.csg.cs.dto;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class UserDetails {

	/*when we want to declare userdefined class as key then @EmbeddedId need to be used */ 
	
//	@EmbeddedId
//	private UserdefinedIdClass userdefinedkey; 
	
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;

	private String userName;	 
	@Temporal(TemporalType.DATE) /*this will only store dates*/	
	private Date todadate;
	private String address;
	private String password;
	
	@Lob
	private String description;
	
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name="street",column=@Column(name="HOME_STREET")),
	@AttributeOverride(name="city",column=@Column(name="HOME_CITY")),
	@AttributeOverride(name="state",column=@Column(name="HOME_STATE")),
	@AttributeOverride(name="pin",column=@Column(name="HOME_PIN"))	
	})	
	private Address homeAddressvaluetype;
	
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="OFFICE_STREET")),
		@AttributeOverride(name="city",column=@Column(name="OFFICE_CITY")),
		@AttributeOverride(name="state",column=@Column(name="OFFICE_STATE")),
		@AttributeOverride(name="pin",column=@Column(name="OFFICE_PIN"))	
		})
	@Embedded
	private Address officeAddressvaluetype;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getTodadate() {
		return todadate;
	}

	public void setTodadate(Date todadate) {
		this.todadate = todadate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Address getHomeAddressvaluetype() {
		return homeAddressvaluetype;
	}

	public void setHomeAddressvaluetype(Address homeAddressvaluetype) {
		this.homeAddressvaluetype = homeAddressvaluetype;
	}

	public Address getOfficeAddressvaluetype() {
		return officeAddressvaluetype;
	}

	public void setOfficeAddressvaluetype(Address officeAddressvaluetype) {
		this.officeAddressvaluetype = officeAddressvaluetype;
	}
		
	
	
	
	

}
