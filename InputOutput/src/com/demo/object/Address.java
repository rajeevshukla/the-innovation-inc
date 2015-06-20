package com.demo.object;

public class Address {

	private int hNo;

	private String street;

	public int gethNo() {
		return hNo;
	}

	public void sethNo(int hNo) {
		this.hNo = hNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", street=" + street + "]";
	}

}
