package com.optional;

import java.util.Objects;
import java.util.Optional;

public class Nullable {

	public static void main(String[] args) {
		ClassA a = new ClassA("harish",1);
		boolean b = method(a);
		System.out.println(b);
	}

	private static boolean method(ClassA a) {
		String str = "";
		return Optional.ofNullable(a.getName())
				.map(value-> Objects.equals(value,str ))
				.orElse(false);
	}

}


