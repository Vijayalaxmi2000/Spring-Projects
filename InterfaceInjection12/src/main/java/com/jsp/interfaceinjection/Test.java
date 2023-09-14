package com.jsp.interfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext c1=
				new ClassPathXmlApplicationContext("com/jsp/interfaceinjection/interface.xml");
		Customer c2=(Customer)c1.getBean("customer");
		System.out.println(c2);
		
		c2.getAccount().withdraw();
		c2.getAccount().deposit();
	}

}
