package com.has_a_relation;

public class Address {
	String city;
	String State;
	
	//getter setter
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	
	//para constructor
	public Address(String city, String state) {
		super();
		this.city = city;
		State = state;
	}
	
	//to String 
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + "]";
	}
	
	
	
}
