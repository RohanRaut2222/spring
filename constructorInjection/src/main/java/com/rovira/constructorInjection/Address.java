package com.rovira.constructorInjection;

public class Address
{
	String city;
	Long pinCode;
	
	Address(String city, Long pinCode)
	{
		this.city = city;
		this.pinCode = pinCode;
	}
}

