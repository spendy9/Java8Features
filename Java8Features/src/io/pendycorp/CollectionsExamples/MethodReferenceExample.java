package io.pendycorp.CollectionsExamples;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		Thread t = new Thread(() -> printMessage());
		t.start();
		
		Thread t2 = new Thread(MethodReferenceExample::printMessage);
		t2.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
