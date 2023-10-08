package io.javabrains.unit2;

public class ThisReferenceExample {
	
	public void doProcess(int i, Process p) {
		p.process(i);
		
	}
	
	public void execute() {
		doProcess(10, i ->{
			System.out.println("Value of i is "+ i);
			System.out.println(this); // Points to Object on Which Instance Method is Called
		});
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		thisReferenceExample.execute();
		
		/*
		thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i is " + i);
			// System.out.println(this); //gives error in case of lambda  
		});
		*/
		
		
	//	System.out.println(this); //this reference cannot be used in static context
		
		
		/*
		thisReferenceExample.doProcess(10, new Process() {

			@Override
			public void process(int i) {
				System.out.println("Value of i is "+ i);
				System.out.println(this); // this reference point new Process instance here
			}
			
			public String toString() {
				return "This is the anonymous inner class";
			} // if toString is Overrided then this will refer to the message 
			
		});
		*/
	}
	
	public String toString() {
		return "This is the main ThisReferenceExample class Instance";
	}

}
