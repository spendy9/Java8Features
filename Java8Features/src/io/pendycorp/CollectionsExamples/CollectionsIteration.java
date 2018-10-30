package io.pendycorp.CollectionsExamples;

import java.util.Arrays;
import java.util.List;

import io.pendycorp.LambdaExamples.Person;

public class CollectionsIteration {

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
		 * External Iterators.
		 * Iterators where we control the iteration
		 */
		
		//Loop through for loop
		System.out.println("######## Printing using traditional for loop ########");
		for(int i=0; i< people.size() ; i++) 
		{
			System.out.println(people.get(i));
		}
		
		//Loop through for-in loop
		System.out.println("######## Printing using for-in loop ########");
		for(Person p : people) 
		{
			System.out.println(p);
		}
		
		
		/*
		 * Internal Iterator
		 */
		System.out.println("######## Internal Iterator - Printing using for-each loop ########");
		people.forEach(i -> System.out.println(i));
		
		System.out.println("######## Internal Iterator - Printing using for-each and Method Reference ########");
		people.forEach(System.out::println);
		
		System.out.println("######## Internal Iterator - Print only Last Name using for-each loop ########");
		people.forEach(i -> System.out.println(i.getLastName()));
	}

}
