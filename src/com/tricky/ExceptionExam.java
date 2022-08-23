package com.tricky;

public class ExceptionExam {
	 public static void main(String[] args) {
    String returnVal = method1();
    System.out.println(returnVal);
}

public static String method1() {
    try {
        int i = 9/0;
        System.out.println(i);
        return "try block";
    } catch (Exception e) {
        System.out.println("exception caught");
       //return "from catch";
    } finally {
        System.out.println("finally block executing");
       //return "Final catch";
    }

    System.out.println("end");
    return "from end";
}

}