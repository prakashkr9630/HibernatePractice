package com.csg.cs.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/*WHEN THIS NAME PROPERTY IS BEING USED THIS WILL CONSIDE THIS NAME INSTEAD OF THIS CLASS NAME*/
/*@Entity(name="USER_DETAILS")*/

/* NOW THIS IS DIFFERENT FROM DEFINEIN/CHANGING  ENTITY NAME, JUST GOOGLE IT*/ 
/*@Table(name="USER_DEFINED TABLE")*/
@Entity
public class UserDetails {
	
	/*@generatedtype is user to increment the value ,this is application for defining unique sequence number */
	/*@Id @GeneratedValue(strategy=GenerationType.AUTO)*/
	@Id
	private int userId;
	/*@Column(name="You can change the column name here by setting up the new value")*/
	private String userName;
	
	/*without this it will add the whole time stamp into the database, so for restriction need to use @Temporal*/ 
	@Temporal(TemporalType.DATE) /*this will only store dates*/
	
	private Date todadate;
	private String address;
	
	@Transient  /*this will help us not to create the column in the database, or mark this variable as transient */
	private String password;
	
	/*this can be long long data like a long story , so by default hibernate will store it as varchar(225), so we need to tell them as store it either CLOB/BLOB, 
	if @Lob is used over String then it will treat this as clob, (character large object ) and if it is over byte type it will treat this as BLOB(byte large object )*/ 
	@Lob
	private String description;
	
	/*@Embedded this is optional , if the "Address" class is marked as "@Embeddable" then here it can be or can't be marked both will work 
*/	
	private Address addressvaluetype;
		
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
	public Address getAddressvaluetype() {
		return addressvaluetype;
	}
	public void setAddressvaluetype(Address addressvaluetype) {
		this.addressvaluetype = addressvaluetype;
	}
	
	

}
