package com.jsp.inheritance;

public class Person 
{
	private Address address;
	private int personId;
	private String personName;
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address = address;
	}
	public int getPersonId() 
	{
		return personId;
	}
	public void setPersonId(int personId) 
	{
		this.personId = personId;
	}
	public String getPersonName() 
	{
		return personName;
	}
	public void setPersonName(String personName) 
	{
		this.personName = personName;
	}
	@Override
	public String toString() 
	{
		return "Person [Address=" + address + ", Person Id=" + personId + ", Person Name=" + personName + "]";
	}
	
	

}
