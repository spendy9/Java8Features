package io.pendycorp.LambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Simple example to demonstrate implementation of few conditions using Lambda
 * 
 * Look at this example that performs same operation using Java 8 approach
 * 
 * @author srinathpendyala
 *
 */
public class LambdaImplementation {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Dwayne", "Johnson", 46),
				new Person("Robert", "Downey", 53),
				new Person("Tom", "Cruise", 56),
				new Person("Tom", "Hanks", 62),
				new Person("Brad", "Pitt", 54),
				new Person("Mark", "Wahlberg", 47)
				);
		
		//Sort List by Last Name
		/*
		 * Java 8 way
		 */
		Collections.sort(people,  (o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
		
		//Create a method that prints all elements in the list
		System.out.println("Print All :");
		printConditionally(people, p -> true);
		
		//Create a method that prints all people that have first name starts with T
		System.out.println("Print All where first name start with T :");
		printConditionally(people, p -> p.getFirstName().startsWith("T"));
		
		//Create a method that prints all people that have age > 50
		System.out.println("Print All where age is > 50 :");
		printConditionally(people, p -> p.getAge() > 50);
	}

	/**
	 * This method takes list of Person and condition. 
	 * Rather than hard coding condition in the implementation method and create new method for each condition requirement.
	 * This method takes the condition, this is passing behavior, and the condition is defined in by the caller
	 * @param people
	 * @param condition
	 */
	private static void printConditionally(List<Person> people, Condition condition) {
		
		for(Person p : people) {
			
			if(condition.test(p)) {
				System.out.println(p);
			}
		}
	}

}
