package com.FunctionalInterfaces;

//Program to implement a user-defined functional interface using lambda expressions

@FunctionalInterface
interface Square {
	int calculateSquare(int x);
}

public class Test {
	public static void main(String args[]) {
		int num = 10;

		// lambda expression to define the calculate method
		Square sq = x -> x * x;
		int answer = sq.calculateSquare(num);
		System.out.println("The square of the number is: " + answer);
	}
}
