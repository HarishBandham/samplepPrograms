package com.string;

public class String1 {

	public static void main(String[] args) {

		String s = "Hello";

		String t = new String(s);

		if ("Hello".equals(s)) System.out.println("one");

		if (t == s) System.out.println("two");

		if (t.equals(s)) System.out.println("three");

		if ("Hello" == s) System.out.println("four");

		if ("Hello" == t) System.out.println("five");
		
		System.out.println("----------------------------");
		StringBuilder sb = new StringBuilder();

		sb.append("aaa").insert(1, "bb").insert(4, "ccc");

		System.out.println(sb);
		
		System.out.println("----------------------------");
		
	}

}
