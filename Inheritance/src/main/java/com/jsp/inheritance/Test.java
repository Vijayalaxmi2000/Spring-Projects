package com.jsp.inheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1=
				new ClassPathXmlApplicationContext("com/jsp/inheritance/inheritance.xml");
		// 1st way
		Person p1=(Person)c1.getBean("person");
		System.out.println(p1);
		//2nd way
		Person p2=(Person)c1.getBean("person2");
		System.out.println(p2);
		Address a2 = (Address) c1.getBean("address2");
		System.out.println(a2);
		
	}

}
