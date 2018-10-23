package io.pendycorp.LambdaExamples;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Simple example to demonstrate implementation of few conditions without Lambda
 * 
 * Look at this example that performs same operation using Java 7 approach
 * 
 * @author srinathpendyala
 *
 */
public class WithoutLambdaImplementation {
	
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
		 * Java 7 way
		 */
		Collections.sort(people,  new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//Create a method that prints all elements in the list
		System.out.println("Print All :");
		printAll(people);
		
		//Create a method that prints all people that have first name starts with T
		System.out.println("Print All where first name start with T :");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getFirstName().startsWith("T");
			}
		});
		
		//Create a method that prints all people that have age > 50
		System.out.println("Print All where age is > 50 :");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getAge() > 50;
			}
		});
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

	
	/**
	 * This is a plain print all method
	 * @param people
	 */
	private static void printAll(List<Person> people) {
		
		for(Person p : people)
		{
			System.out.println(p); 
		}
	}

}
