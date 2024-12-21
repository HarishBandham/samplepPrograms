package com.tricky;

public class Example {

	public Example() {
		System.out.println("Example");
	}

	public Example(int i) {
		System.out.println(" int");
	}

	public Example(Integer i) {
		System.out.println("Integer");
	}

	public Example(Long o) {
		System.out.println("Long");
	}

	public Example(Object o) {
		System.out.println("Object");
	}

	public Example(int... i) {
		System.out.println("int...");
	}

	public static void main(String[] args) {

		String s = "Hello"; 

		String t = new String(s);

		if ("Hello".equals(s))
			System.out.println("one");

		if (t == s)
			System.out.println("two");

		if (t.equals(s))
			System.out.println("three");

		if ("Hello" == s)
			System.out.println("four");

		if ("Hello" == t)
			System.out.println("five");

	}

}