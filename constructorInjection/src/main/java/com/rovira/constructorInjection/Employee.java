package com.rovira.constructorInjection;

public class Employee
{
	String name;
	Address address;
	
	public Employee(String name, Address address)
	{
		this.name = name;
		this.address = address;
	}
	
	public void employeeDetails()
	{
		System.out.println("name:    "+this.name);
		System.out.println("city:    "+this.address.city);
		System.out.println("pincode: "+this.address.pinCode);
	}
}

