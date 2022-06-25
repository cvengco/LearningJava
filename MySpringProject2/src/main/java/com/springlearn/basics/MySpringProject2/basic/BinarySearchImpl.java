package com.springlearn.basics.MySpringProject2.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	/* Example One - need to specify @Component and @Primary if more than one implmentation of interface
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.doSort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search array
		
		return 3;
	}
	*/

	/* Example Two - Autowiring by name - name property to match class
	@Autowired
	private SortAlgorithm bubbleSortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = bubbleSortAlgorithm.doSort(numbers);
		System.out.println(bubbleSortAlgorithm);
		
		// Search array
		
		return 3;
	}
	*/
	
	/* Example Three - use qualifer */
	@Autowired
	@Qualifier("bubbleSort")
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.doSort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search array
		
		return 3;
	}	
	
	
}
