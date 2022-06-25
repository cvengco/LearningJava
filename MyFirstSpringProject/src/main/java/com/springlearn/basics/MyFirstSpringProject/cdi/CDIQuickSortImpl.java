package com.springlearn.basics.MyFirstSpringProject.cdi;

import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Named
@Qualifier("quick")
public class CDIQuickSortImpl implements CDISortAlgorithm {
	
	public int[] doSort(int[] numbers) {
		
		
		return numbers;
	}

}
