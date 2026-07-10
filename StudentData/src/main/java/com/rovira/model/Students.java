package com.rovira.model;

public class Students {

	private String name;
	private String city;
	private double percentage;
	
	public Students(String name,String city,double percentage)
	{
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	public String getName()
	{
		return this.name;
	}
	
	public String getCity()
	{
		return this.city;
	}
	
	public double getPercentage()
	{
		return this.percentage;
	}
	
	public String toString()
	{
		return "Name: "+name+"| City: "+city+"| Percentage: "+percentage;
	}
}
