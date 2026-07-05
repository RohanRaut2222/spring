package com.rovira;

public class WelcomeBean
{
	private final int i;
	private String addr;
	private Person person;
	public WelcomeBean(int i)
	{
		this.i=i;
	}
	public String getMessage()
	{
		return "Welcome to spring "+i+" "+addr+" "+person.getName() ;
	}
	
	public void setAddr(String addr)
	{
		this.addr = addr;
	}
	
	public void setPerson(Person person)
	{
		this.person = person;
	}
	
}