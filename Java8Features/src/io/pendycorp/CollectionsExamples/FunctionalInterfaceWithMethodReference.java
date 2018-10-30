package io.pendycorp.CollectionsExamples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import io.pendycorp.LambdaExamples.Person;

/**
 * In LambdaImplementation example we have implemented conditions using Lambda but have used Condition interface that we defined.
 * In this example we used interface Predicate, which is out of the box functional interface in Java 8 for such common purposes
 * 
 * Look at this example that performs same operation using Java 8 approach
 * 
 * Functional Interface Predicate<T>, the functional method takes an Object as an input argument and returns a boolean
 * 
 * boolean test(T t)
 * 
 * Functional Interface Consumer<T>, the functional method takes an Object as an input argument and return type is void
 * 
 * void accept(T t)
 * 
 * @author srinathpendyala
 *
 */
public class FunctionalInterfaceWithMethodReference {
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Dwayne", "Johnson", 46),
				new Person("Robert", "Downey", 53),
				new Person("Tom", "Cruise", 56),
				new Person("Tom", "Hanks", 62),
				new Person("Brad", "Pitt", 54),
				new Person("Mark", "Wahlberg", 47)
				);
		

		//Create a method that prints all elements in the list
		System.out.println("######### Print All #########");
		//Method Reference 
		printConditionally(people, p -> true, System.out::println); //p -> System.out.println(p)

	}

	/**
	 * This method takes list of Person and condition. 
	 * Rather than hard coding condition in the implementation method and create new method for each condition requirement.
	 * This method takes the condition, this is passing behavior, and the condition is defined in by the caller
	 * 
	 * Predicate Functional Interface is used to evaluate the condition
	 * Consumer Functional Interface is used to print the sysout
	 * 
	 * 
	 * @param people
	 * @param condition
	 */
	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		
		for(Person p : people) {
			
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
