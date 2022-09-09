package com.tricky;

public class Test2 {

	Test2() {

		 System.out.print("1 ");

		 }

		 Test2(int num) {

		 System.out.print("2 ");

		 }

		 Test2(Integer num) {

		 System.out.print("3 ");

		 }

		 Test2(Object num) {

		 System.out.print("4 ");

		 }

		 Test2(int... nums) {

		 System.out.print("5 ");

		 }

		 public static void main(String[] args) {

		 new Test2(100);

		 new Test2(1000L);

		 }

}
