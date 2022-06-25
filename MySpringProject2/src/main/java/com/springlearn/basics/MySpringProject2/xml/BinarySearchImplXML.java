package com.springlearn.basics.MySpringProject2.xml;

public class BinarySearchImplXML {
	
	private SortAlgorithmXML sortAlgorithm;
	
	
	public void setSortAlgorithm(SortAlgorithmXML sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		int[] sortedNumbers = sortAlgorithm.doSort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search array
		
		return 3;
	}	
	
	
}
