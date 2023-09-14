package mavenproject2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		 ClassPathXmlApplicationContext c1 = new ClassPathXmlApplicationContext("mavenproject2/company.xml");
		 System.out.println(c1.getBean("company"));
		 System.out.println(c1.getBean("ABC"));			
	}

}
