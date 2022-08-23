package com.optional;

import java.util.Objects;
import java.util.Optional;

public class Nullable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA a = new ClassA(null,1);
		boolean b = method(a);
		System.out.println(b);
	}

	private static boolean method(ClassA a) {
		// TODO Auto-generated method stub
		String str = "harish";
		return Optional.ofNullable(a.getName())
				.map(value-> Objects.equals(str, value))
				.orElse(true);
	}

}


