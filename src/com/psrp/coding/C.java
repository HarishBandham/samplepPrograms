package com.psrp.coding;

interface A {
	  default void foo() { System.out.println("hello from A"); }
	}
	interface B extends A {
	    default void foo() { System.out.println("hello from B"); }
	}
	class C implements A, B {
		public static void main(String[] args) {
			C c = new C();
			c.foo();
		}
	
}