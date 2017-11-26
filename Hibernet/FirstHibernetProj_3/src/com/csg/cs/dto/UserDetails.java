package com.csg.cs.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class UserDetails {

	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	private String userName;
	@ElementCollection
	
	/*
	 * this is just to improve the name , by which the name in the table the data will be saved. 
	 */
//	@JoinTable(name="USER_ADDRESS",	
//				joinColumns=@JoinColumn(name="USER_ID"))
//			
//	private Set<Address> listOfAddress= new HashSet();
	
	
	/**
	 * this is an example when we want to create index in the sub table that address table, 
	 * since set does not have index property, hence we need to user ArrayList as implementation class;
	 * 
	 * Uncomment this before using this upper one.
	 * 
	 * this is just to add index in the other table (address table)
	 */
	
	
	@JoinTable(name="USER_ADDRESS",joinColumns=@JoinColumn(name="USER_ID"))
	@GenericGenerator(name="hilo-gen",strategy="hilo")
	@CollectionId(columns = { @Column(name="Address_ID") }, generator = "hilo-gen", type = @Type(type="long") )			
	private Collection<Address> listOfAddress= new ArrayList<>();
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
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}
	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
	
	
			
	

}
