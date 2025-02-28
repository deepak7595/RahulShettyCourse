package javaStreamToEnhanceSeleniumCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Assignment1_JavaStream {

	public static void main(String[] args) {

		//print unique numbers
		//sort the list
		//get 3rd index after sorted

		//To convert integer we shouldn't specify int. that should be INterger.
		Integer a [] = {3, 222, 2, 7, 5, 2, 9 , 8 , 1};
		List<Integer> list = Arrays.asList(a);
		
		
		System.out.println("sorted count");
		System.out.println(list.stream().distinct().sorted().count());
		
		System.out.println("unique values");
		list.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> collect = list.stream().distinct().sorted().collect(Collectors.toList());
		
		System.out.println("3rd index");
		System.out.println(collect.get(2));
		}

}
