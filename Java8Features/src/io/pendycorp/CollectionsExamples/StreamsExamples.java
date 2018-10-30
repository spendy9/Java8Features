package io.pendycorp.CollectionsExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import io.pendycorp.LambdaExamples.Person;

public class StreamsExamples {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Dwayne", "Johnson", 46),
				new Person("Robert", "Downey", 53),
				new Person("Tom", "Cruise", 56),
				new Person("Tom", "Hanks", 62),
				new Person("Brad", "Pitt", 54),
				new Person("Mark", "Wahlberg", 47)
				);
		
		
		/*
		 * Loop through the list and create a new list with people whose first name starts with T
		 * Loop through the new list and print them
		 */
		
		people.stream()
		.filter(p -> p.getFirstName().startsWith("T"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long count = people.stream().filter(p -> p.getAge() < 50).count();
		System.out.println(count);
	}

}
