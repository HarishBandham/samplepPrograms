package com.inheritance;

public class IMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		InheriteanceA Ia = new InheriteanceB();
//		Ia.method1();
//		
		InheriteanceB obj = new InheriteanceB();
	      obj.show(); // show() method of Hi class is called. 

	      System.out.println("----------------------------------\n");
	// Superclass reference is equal to child class object. 
	      InheriteanceA obj1 = new InheriteanceB(); 
	      obj1.show();
	}

}
