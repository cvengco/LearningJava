package com.springlearn.basics.MySpringProject2;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springlearn.basics.MySpringProject2.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.springlearn.basics.MySpringProject2.basic")
public class MySpringProject2Application {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		
			
		try {
		
			// Spring ApplicationContext
			AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MySpringProject2Application.class);
			BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
			BinarySearchImpl binarySearch1 = appContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearch);
			System.out.println(binarySearch1);
			
			int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
			//System.out.println(result);
		
		
		}
		finally {
			
		}
	}
	
}
