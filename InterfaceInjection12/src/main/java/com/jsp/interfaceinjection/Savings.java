package com.jsp.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Savings implements Account 
{

	public void withdraw() 
	{
		System.out.println("withdraw from savings account");
	}

	public void deposit() 
	{
		System.out.println("deposite to savings account");
	}

}
