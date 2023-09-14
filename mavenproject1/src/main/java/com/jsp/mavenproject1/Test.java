package com.jsp.mavenproject1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
       ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("com/jsp/mavenproject1/config.xml");
       Employee e1=(Employee) c1.getBean("emp");
       System.out.println(e1);
  
	}
    
}
