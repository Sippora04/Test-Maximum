package com.testmaximum;

import java.util.Arrays;

//Generic class
public class Maximum<T extends Comparable<T>> {
	//Any number of arguments
	public static <T extends Comparable<T>> T maximum(T ... values) {
		Arrays.sort(values);
		T max = values[values.length-1];
		printMax(max);
		return max;
	}

	public static<T> void printMax(T max) {
		// TODO Auto-generated method stub
		System.out.println("Maximum: " + max + "\n");
	}
}

