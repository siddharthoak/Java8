package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a Java program to count the number of strings in a list that start with a specific letter using streams.
 */
public class Excercise6 {
	public static void main(String[] args) {
	    List < String > colors = Arrays.asList("Red", "Green", "Blue", "Pink", "Brown");
	    char startingLetter = 'B';
	    Stream<String> stream = colors.stream();
	    System.out.println(stream.filter( color -> color.startsWith(String.valueOf(startingLetter))).collect(Collectors.toList()));
	}

}
