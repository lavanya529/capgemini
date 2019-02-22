package com.bank.model;

import java.io.Serializable;

public class User implements Serializable {
	
	private String FirstName,LastName;
	private Long AadharcardNo;
	private Long AccountNo;
	private String AccountType;
	private String PancardNo;
	private Long PhoneNo;
	private String Address;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public Long getAadharcardNo() {
		return AadharcardNo;
	}
	public void setAadharcardNo(Long aadharcardNo) {
		AadharcardNo = aadharcardNo;
	}
	public Long getAccountNo() {
		return AccountNo;
	}
	public void setAccountNo(Long accountNo) {
		AccountNo = accountNo;
	}
	public String getAccountType() {
		return AccountType;
	}
	public void setAccountType(String accountType) {
		AccountType = accountType;
	}
	public Long getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(Long phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getPancardNo() {
		return PancardNo;
	}
	public void setPancardNo(String pancardNo) {
		PancardNo = pancardNo;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	
	
		
	}


