package com.javatpoint.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.javatpoint.Student;

public class Test {

	public static void main(String[] args)
	{
	
		Resource res= new ClassPathResource("applicationContext.xml");
		BeanFactory fac= new XmlBeanFactory(res);
		Student sobj= (Student)fac.getBean("studentbean");
		
		sobj.displayinfo();
	}

}
