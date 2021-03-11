package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/collections/config.xml");
		 
		  Emp emoloyee1 = (Emp) context.getBean("employee1");
		  
		  
		  System.out.println(emoloyee1.getName());

		  System.out.println(emoloyee1.getPhones());

		  System.out.println(emoloyee1.getAddresses());
		  

		  System.out.println(emoloyee1.getCourses());
	}
	

}
