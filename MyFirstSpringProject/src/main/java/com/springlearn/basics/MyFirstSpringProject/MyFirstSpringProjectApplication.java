package com.springlearn.basics.MyFirstSpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyFirstSpringProjectApplication {

	public static void main(String[] args) {
		
		// Loose-coupling example
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortImpl());
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortImpl());
		//int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
		//System.out.println(result);
		
		
		// Spring ApplicationContext
		ApplicationContext appContext = SpringApplication.run(MyFirstSpringProjectApplication.class, args);
		BinarySearchImpl binarySearch = appContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = appContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int result = binarySearch.binarySearch(new int[] {3, 4, 10, 7}, 7);
		//System.out.println(result);
	}

}
