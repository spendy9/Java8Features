package io.pendycorp;

/**
 * Defining lambda expression using Functional interfaces has huge advantage in backward compatibility.
 * This is a small example of implementing Runnable interface
 * Runnable interface is a perfect example for Functional Interface.
 * 
 * @author srinathpendyala
 *
 */
public class RunnableLambda {

	/*
	 * A new thread can be created by either extending a Thread class or implementing Runnable Interface.
	 * Below is a simple implementation of Runnable interface using Lambda 
	 */
	public static void main(String[] args) {

		/*
		 * Creating a new Thread and passing it an instance of runnable
		 */
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {

				System.out.println("Printed inside Runnable");
			}
		});
		
		
		/*
		 * Lambda expression to implement Runnable
		 */
		Thread myThread2 = new Thread(() -> System.out.println("Printed inside Lambda Runnable"));
		
		
		myThread.run();
		
		myThread2.run();
	}

}
