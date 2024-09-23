package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Write a Java program to find the maximum and minimum values in a list of integers using streams.
 */
public class Excercise7 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 17, 54, 14, 14, 33, 45, -11);
		System.out.println(nums.stream().max(Comparator.naturalOrder()).get());
		System.out.println(nums.stream().min(Comparator.naturalOrder()).get());

	}
}
