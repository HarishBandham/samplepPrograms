package com.tricky;

public class FinalizeMcq {

	protected void finalize() {

		 System.out.println("Roar!");

		}
	public static void main(String[] args) {

		FinalizeMcq bear = new FinalizeMcq();

		 bear = null;
		 System.out.println("called");
		 System.gc();
		 System.out.println("complted task");
	}
}