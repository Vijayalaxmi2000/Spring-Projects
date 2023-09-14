package com.jsp.intefaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Saving implements Account {

	public void withdraw()
	{
		System.out.println("withdraw from saving account");
	}

	public void deposite() 
	{
		System.out.println("deposite to saving account");
	}

}
