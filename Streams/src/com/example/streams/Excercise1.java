package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a Java program to calculate the average of a list of integers using streams.
 */
public class Excercise1 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
	     
	     Stream<Integer> intStream = list.stream();
	     int val = intStream.collect(Collectors.summingInt(num -> num)).intValue();
	     System.out.println(val);
	     double avg = val/7;
	     System.out.println(avg);
	}
}
