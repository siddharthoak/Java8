package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
 */
public class Excercise3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14);
		Stream<Integer> evenStream = numbers.stream();
		Stream<Integer> oddStream = numbers.stream();

		int evenTotal = evenStream.filter((Integer i) -> {
			// TODO Auto-generated method stub
			return i % 2 == 0;
		}).collect(Collectors.summingInt((n) -> n));
		
		int oddTotal = oddStream.filter((Integer i) -> {
			// TODO Auto-generated method stub
			return i % 2 != 0;
		}).collect(Collectors.summingInt((n) -> n));
		System.out.println("Even = "+evenTotal+" and Odd = "+oddTotal);
	}
}
