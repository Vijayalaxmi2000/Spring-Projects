package com.jsp.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account
{

	public void withdraw() 
	{
		System.out.println("withdraw from cuurent account");
	}

	public void deposit() 
	{
		System.out.println("deposite to current account");
	}
    
}
