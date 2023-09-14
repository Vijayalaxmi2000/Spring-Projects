package com.jsp.intefaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account
{
	public void withdraw() 
	{
		System.out.println("withdraw from current account");	
	}

	public void deposite() 
	{
		System.out.println("deposite to current account");
	}


}
