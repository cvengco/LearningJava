package com.springlearn.basics.MyFirstSpringProject.cdi;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named
@Qualifier("bubble")
public class CDIBubbleSortImpl implements CDISortAlgorithm {
	
	public int[] doSort(int[] numbers) {
		
		
		return numbers;
	}

}
