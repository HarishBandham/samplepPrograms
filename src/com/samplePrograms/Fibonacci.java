package com.samplePrograms;

import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {

		Stream.iterate(new int[]{0,1}, t->new int[]{t[1],t[0]+t[1]})
		.limit(10)
		//.map(x->x[0])
		.forEach(x->System.out.println("{" + x[0] + "," + x[1] + "}"));
		
		System.out.println("============================");
		
		Stream.iterate(new int[]{0,1}, t->new int[]{t[1],t[0]+t[1]})
		.limit(10)
		.map(x->x[0])
		.forEach(System.out::println);
	}

}
