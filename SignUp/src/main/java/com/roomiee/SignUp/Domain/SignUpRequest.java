package com.roomiee.SignUp.Domain;

import java.math.BigInteger;
import java.util.Date;

public class SignUpRequest {
	
	public String firstName;
	public String lastName;
	public String middleName;
	public BigInteger phoneNumber;
	public Date dob;
	public String email;
	
	
	public SignUpRequest() {
		super();
	}

	public SignUpRequest(String firstName, String lastName, String middleName, BigInteger phoneNumber, Date dob,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.phoneNumber = phoneNumber;
		this.dob = dob;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public BigInteger getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(BigInteger phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SignUpRequest [firstName=" + firstName + ", lastName=" + lastName + ", middleName=" + middleName
				+ ", phoneNumber=" + phoneNumber + ", dob=" + dob + ", email=" + email + "]";
	}
	

}
