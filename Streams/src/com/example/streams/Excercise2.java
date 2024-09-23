package com.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Write a Java program to convert a list of strings to uppercase or lowercase using streams.
 */

public class Excercise2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hllo", "how", "ARE","you", "DoIng", "todAY");
		Stream<String> strStream = list.stream();
		List<String> listUpper = strStream.map((String str) -> str.toUpperCase()).collect(Collectors.toList());
		listUpper.stream().forEach( System.out::println);	
	}
}
