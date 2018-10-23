package io.pendycorp.FunctionalInterfaces;

import java.util.function.BiConsumer;

/**
 * Lets consider performing arithmetic operations on an array of integers
 * 
 * @author srinathpendyala
 *
 */
public class BiConsumerWithExceptionHandling {

	public static void main(String[] args) {
		
		int[] numberArray = {1,2,3,4};
		int key = 2;
		
		//processAddition method loops through the array and adds key to each number
		processAddition(numberArray, key);
		
		/*
		 * create a method such that it takes the behavior of arithmetic operation 
		 * and performs any arithmetic operation that is passed to it  
		 */
		processArithmeticOperation(numberArray, key, wrapperLambda((v,k) -> System.out.println(v/k)));
		
	}

	/**
	 * This method is specifically to add key to the each number in the numberArrayl
	 * @param numberArray
	 * @param key
	 */
	private static void processAddition(int[] numberArray, int key) {
		
		for(int i : numberArray)
		{
			System.out.println(i+key);
		}
	}
	
	
	/**
	 * This method takes a numberArray, key and arithmetic operation behavior defined and passed by caller
	 * @param numberArray
	 * @param key
	 * @param consumer
	 */
	private static void processArithmeticOperation(int[] numberArray, int key, BiConsumer<Integer, Integer> consumer) {
		
		for(int i : numberArray) {
			consumer.accept(i, key);
		}		
	}
	
	
	/**
	 * This wraps the lambda expression and defines exception handling here
	 * @param consumer
	 * @return
	 */
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		
		return (v,k) -> {
			
			try {				
				consumer.accept(v, k);
			}catch(ArithmeticException e) {
				System.out.println("Exception in wrapperLambda");
			}
		};
		
	}

}
