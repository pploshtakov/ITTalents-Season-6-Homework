package main;

import java.util.Arrays;

import exceptionsExample.ExceptionsExample;

public class Demo {

	public static void main(String[] args) {
		int[] a1 = {9,8,4,2,6,7,4,3,5};
		int[] a2 = {3,2,0,2,3,0,4,2,-5,6};
		ExceptionsExample e = new ExceptionsExample(a1,a2);
		System.out.println(Arrays.toString(e.devideArrays(a1, a2)));
		System.out.println(Arrays.toString(e.devideArrays(a2, a1)));
		System.out.println(Arrays.toString(e.devideArrays(null, a1)));
		System.out.println(Arrays.toString(e.devideArrays(a1, null)));
		System.out.println(Arrays.toString(e.devideArrays(null, a1)));
		try {
			System.out.println(Arrays.toString(e.devideArrays(new int[-1], a1)));
		} catch (NegativeArraySizeException e1) {
			System.out.println("Cannot have a negative array's size!");
		}
	}
	
}
