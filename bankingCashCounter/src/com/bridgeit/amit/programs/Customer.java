package com.bridgeit.amit.programs;

public class Customer 
{
	private String name;
	private int age;
	private double amt;
	
	public Customer() {	}
	public Customer(String name, int age, double amt) {
		this.name = name;
		this.age = age;
		this.amt = amt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	
}
