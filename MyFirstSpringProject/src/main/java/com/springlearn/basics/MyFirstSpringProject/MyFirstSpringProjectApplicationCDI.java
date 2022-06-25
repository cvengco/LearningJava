package com.springlearn.basics.MyFirstSpringProject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springlearn.basics.MyFirstSpringProject.cdi.CDIBinarySearchImpl;

@SpringBootApplication
public class MyFirstSpringProjectApplicationCDI {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		
		// Spring ApplicationContext
		ApplicationContext appContext = SpringApplication.run(MyFirstSpringProjectApplicationCDI.class, args);
		CDIBinarySearchImpl binarySearch = appContext.getBean(CDIBinarySearchImpl.class);
		CDIBinarySearchImpl binarySearch1 = appContext.getBean(CDIBinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
		System.out.println(result);
	}
	
}
