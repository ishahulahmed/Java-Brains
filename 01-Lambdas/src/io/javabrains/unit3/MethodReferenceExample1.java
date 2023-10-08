package io.javabrains.unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		Thread t = new Thread(MethodReferenceExample1::printMessage); //() -> method()
		t.start();
		// MethodReferenceExample1::printMessage == () -> printMessage();
	}
	
	public static void printMessage() {
	System.out.println("Hello");	
	}
}
