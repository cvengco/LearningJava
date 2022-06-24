package com.springlearn.basics.MyFirstSpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubbleSort")
public class BubbleSortImpl implements SortAlgorithm {
	
	public int[] doSort(int[] numbers) {
		
		
		return numbers;
	}

}
