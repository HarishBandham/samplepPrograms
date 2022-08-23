package com.inheritance;

public class InheriteanceB extends InheriteanceA{

	
	public InheriteanceB() {
		 System.out.println("InheriteanceB constructor"); 
	}

	public void method1(){
		System.out.println("InheriteanceB - method1()");
	}
	
	void show() { // Override the show() method. 
	     System.out.println("InheriteanceB -- show()"); 
	  } 
}
