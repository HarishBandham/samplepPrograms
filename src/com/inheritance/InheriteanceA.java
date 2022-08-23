package com.inheritance;

public class InheriteanceA {

	{
		show();
	}

	public InheriteanceA() {
		System.out.println("InheriteanceA constructor");
		show();
	}

	public void method1() {
		System.out.println("InheriteanceA - method1()");
	}

	void show() {
		System.out.println("InheriteanceA - Hello method");
	}
}
