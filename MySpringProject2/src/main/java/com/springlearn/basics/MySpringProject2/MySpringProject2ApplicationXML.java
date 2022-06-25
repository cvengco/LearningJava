package com.springlearn.basics.MySpringProject2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springlearn.basics.MySpringProject2.xml.BinarySearchImplXML;


public class MySpringProject2ApplicationXML {
	
	private static Logger LOGGER = LoggerFactory.getLogger(MySpringProject2ApplicationXML.class);

	public static void main(String[] args) {
		
			
		try {
		
			// Spring ApplicationContext
			ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			BinarySearchImplXML binarySearch = appContext.getBean(BinarySearchImplXML.class);
			BinarySearchImplXML binarySearch1 = appContext.getBean(BinarySearchImplXML.class);
			LOGGER.info(binarySearch.toString());
			LOGGER.info(binarySearch1.toString());
			LOGGER.info("Beans Loaded -> {}", (Object)appContext.getBeanDefinitionNames());
			
			int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
			//System.out.println(result);
		
		
		}
		finally {
			
		}
	}
	
}
