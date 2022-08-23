package com.exceptions;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String returnVal = method1();
        System.out.println(returnVal);
	}
	public static String method1() {
        try {
            int i = 9/0;
            System.out.println(i);
            return "from try";
        } catch (Exception e) {
            System.out.println("exception caught");
            return "from catch";
        } finally {
            System.out.println("finally block executing");
           // return "from finally";
        }
        //System.out.println("finally block executing");
    }

}
