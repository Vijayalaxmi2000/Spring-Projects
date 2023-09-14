package collection.setter.list;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext c1= new 
				ClassPathXmlApplicationContext("collection/setter/list/Employee.xml");
        Employee e1=(Employee) c1.getBean("emp");
        System.out.println(e1);

        List<String> s1= e1.getProjects();
        System.out.println(s1.getClass());
        
	}

}
