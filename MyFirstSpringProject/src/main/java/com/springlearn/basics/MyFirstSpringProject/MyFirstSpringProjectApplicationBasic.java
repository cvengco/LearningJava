package com.springlearn.basics.MyFirstSpringProject;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springlearn.basics.MyFirstSpringProject.basic.BinarySearchImpl;

@SpringBootApplication
public class MyFirstSpringProjectApplicationBasic {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		
		// Loose-coupling example
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortImpl());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortImpl());
		//int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
		//System.out.println(result);
		
		
		// Spring ApplicationContext
		ApplicationContext appContext = SpringApplication.run(MyFirstSpringProjectApplicationBasic.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
		//System.out.println(result);
	}

	@PostConstruct
	public void postConstruct() {
		logger.info("PostConstruct");
	}
	
	@PreDestroy
	public void preDestroy() {
		logger.info("PreDestroy");
	}
	
}
