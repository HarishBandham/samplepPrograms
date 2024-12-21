package com.tricky;

public class StringClass {

	public static void main(String[] args) {
		functionA(null);
	}
	
	static void functionA(Object a) {
		System.out.println("Object");
	}
	static void functionA(String a) {
		System.out.println("String");
	}
}
