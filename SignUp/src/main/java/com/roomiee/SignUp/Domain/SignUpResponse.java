package com.roomiee.SignUp.Domain;

public class SignUpResponse {
	
	public String name;
	public int hashCd;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHashCd() {
		return hashCd;
	}

	public void setHashCd(int hashCd) {
		this.hashCd = hashCd;
	}

	@Override
	public String toString() {
		return "SignUpResponse [name=" + name + ", hashCd=" + hashCd + "]";
	}
	
	
	
	
}
