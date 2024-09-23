package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Write a Java program to find the second smallest and largest elements in a list of integers using streams.
 */
public class Excercise8 {

	public static void main(String[] args) {
	    List < Integer > nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
	    System.out.println(nums.stream().sorted().skip(1).findFirst().get());
	    System.out.println(nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());

	}
}
