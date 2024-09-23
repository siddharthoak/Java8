package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a Java program to remove all duplicate elements from a list using streams.
 */
public class Excercise4 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 23, 22, 23, 24, 24, 33, 15, 26, 15);
		Stream<Integer> stream = nums.stream();
		System.out.println(stream.distinct().collect(Collectors.toList()));
	}

}
