/**
 * 
 */
package com.main.actor;

import java.sql.Date;
import java.util.Calendar;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 * @author cuong
 *
 */
public class Actor
{
	protected int id;
	protected String role;
	protected String lastName;
	protected String firstName;
	protected String street; 
	protected String houseNumber; 
	protected String unitNumber;
	protected String city;
	protected String province;
	protected String postalCode; 
	protected String country;
	protected String phoneNumber;
	protected String email;
	protected String password;
	protected Date 	dateOfBirth;
	protected boolean state;
	
	
	public Actor()
	{
		
	}

	public Actor(int id, String role, String lastName, String firstName, String street, String houseNumber,
			String unitNumber, String city, String province, String postalCode, String country, String phoneNumber,
			String email, String password, int dateOfBirth, boolean state) {
		super();
		this.id = id;
		this.role = role;
		this.lastName = lastName;
		this.firstName = firstName;
		this.street = street;
		this.houseNumber = houseNumber;
		this.unitNumber = unitNumber;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.country = country;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		
		this.state = state;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getUnitNumber() {
		return unitNumber;
	}
	public void setUnitNumber(String unitNumber) {
		this.unitNumber = unitNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
 /// dasdsadsa
	///i am Ken xinh gai beautiful girl - ken said - andrew saiddakkldjkldjf
	
	///i am Ken xinh gai beautiful girl - ken said - andrew said Ken
	
	///i am duy
	
	////i am ken
	///backup
}
