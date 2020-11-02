package com.testmaximum;

public class Maximum {
public static void main (String args[]) {
	System.out.println("Welcome");
}

public static Integer findIntegerMaximum(Integer num1, Integer num2, Integer num3) {
	Integer max = num1;
	if (num2.compareTo(max) > 0) {
		max = num2;
	}
	if (num3.compareTo(max) > 0) {
		max = num3;
	}
	printMaxInteger(num1, num2, num3, max);
	return max;
}

public static void printMaxInteger(Integer num1, Integer num2, Integer num3, Integer max) {
	System.out.printf("Maximum of " + num1 + ", " + num2 + " and " + num3 + " is " + max + "\n");
}
}
