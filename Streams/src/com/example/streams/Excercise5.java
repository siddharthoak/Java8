package com.example.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
 * Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
 */
public class Excercise5 {
	public static void main(String[] args) {
		List<String> colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
		System.out.println(colors.stream().sorted().toList());
		System.out.println(colors.stream().sorted(Comparator.reverseOrder()).toList());

	}
}
