package javaStreamToEnhanceSeleniumCoding;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class JavaStreamConcepts {

	public static void main(String[] args) {
		// JavaStream
		// Stream API is new feature available from java 8. By using streams, we can
		// perform various aggeragate on the data returned from collections classes by
		// drastically reduce the complexity of code

		// what is lambda expression?
		// Lambda expression introduce the new arrow operator -> into java. It divides
		// the lambda expression in two parts
		// The left side specifies the paramaters required by the expression, which
		// could also be empty if no paramater are required.
		// The right side is lambda body which specifies the actions of the lambda
		// expression.

		// normal way of usage

		int count = 0;
		ArrayList<String> list = new ArrayList<String>();
		list.add("deepak");
		list.add("dhakshith");
		list.add("karpagam");
		list.add("valarmathi");
		list.add("vaidhylingam");
		list.add("dhaaksha");

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (name.startsWith("d")) {
				count = count + 1;
				System.out.println(name);
			}

		}
		System.out.println(count);

		// Through JavaStream

		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("deepak");
		list2.add("dhakshith");
		list2.add("karpagam");
		list2.add("valarmathia");
		list2.add("vaidhylingam");
		list2.add("dhaaksha");
		list2.add("dhaaksha");

		// there is no life for intermediate operator if there is no terminal operator.
		// if intermediate operator return false, then terminal operator wont execute.
		// (only for filter scenarios)

		long count1 = list2.stream().filter(s -> s.startsWith("d")).count();

		System.out.println("Through java Stream " + count1);

		// Create Stream java directly, instead of converting from list to stream
		long count2 = Stream.of("deepak", "Dhakshith").filter(s -> s.startsWith("D")).count();
		System.out.println(count2);

		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// length() usage
		// we can use greater than & and other possible maths
		list2.stream().filter(s -> s.length() == 6).forEach(s -> System.out.println(s));

		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// limit
		// one limited values will be stored.
		list2.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// print the name which ends with "a" , with uppercase.
		// map is used to modify our stream results
		// filter the lists, and modify by using map, and printing it by using foreach
		list2.stream().filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// print the name which ends with "a" , with uppercase in sorting order
		list2.stream().filter(s -> s.endsWith("a")).sorted().forEach(s -> System.out.println(s));
		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// distinct -> removes the duplicates
		list2.stream().filter(s -> s.endsWith("a")).distinct().forEach(s -> System.out.println(s));

		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// to convert from array to list
		// sort and make it uppercase
		List<String> names2 = Arrays.asList("deepak", "Dhakshith", "follow");
		names2.stream().filter(s -> s.length() == 6).sorted().map(s -> s.toUpperCase())
				.forEach(s -> System.out.println(s));

		System.out.println("@@@@@@@@@@@@@@@@@@@@");
		// Merge two arraylists

		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("deepak");
		list3.add("dhakshith");

		ArrayList<String> list4 = new ArrayList<String>();

		list4.add("karpagam");
		list4.add("unknown");

		// one way to add two list into one single list
		// List<String> combinedList = Stream.concat(list3.stream(), list4.stream())
		// .collect(Collectors.toList());
		// System.out.println(combinedList);

		// anotherway

		Stream<String> concated = Stream.concat(list3.stream(), list4.stream());
		// concated.sorted().forEach(s->System.out.println(s));

		// check the value is present in the list.
		boolean anyMatch = concated.anyMatch(s -> s.equalsIgnoreCase("karpagam"));
		System.out.println(anyMatch);
		Assert.assertTrue(anyMatch);
		
		//collectmethod
		//is used to collect our result and convert it back to any list
		//we can convert them into set, map.
		List<String> ls =list3.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls);
		
		System.out.println("first one from list");
		System.out.println(ls.get(0));
		
	}

}
