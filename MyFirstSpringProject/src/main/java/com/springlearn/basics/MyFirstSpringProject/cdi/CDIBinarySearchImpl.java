package com.springlearn.basics.MyFirstSpringProject.cdi;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Named
public class CDIBinarySearchImpl {
	
	@Inject
	@Qualifier("quick")
	private CDISortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.doSort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search array
		
		return 3;
	}	
	
	
}
