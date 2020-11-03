package com.testmaximum;
//Refactor2: Generic class
public class Maximum<T extends Comparable<T>> {
	T x, y, z;
	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z= z;
	}
	
	public T maximum() {
		return Maximum.maximum(x, y, z);
	}
	
	//Refactor1: Generic method to find maximum
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		printMax(x, y, z, max);
			return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Maximum of " + x + ", " + y + " and " + z + " is " + max + "\n");
	}
}

