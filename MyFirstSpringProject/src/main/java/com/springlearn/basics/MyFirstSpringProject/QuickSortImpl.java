package com.springlearn.basics.MyFirstSpringProject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quickSort")
public class QuickSortImpl implements SortAlgorithm {
	
	public int[] doSort(int[] numbers) {
		
		
		return numbers;
	}

}
