package com.optional;

public class Testcase {

	public static void method(String s) {
		System.out.println("string argument");
	}
	
	public static void method(Object s) {
		System.out.println("string argument");
	}

	public boolean exceptionMethod() {
		
		try {
			System.out.println("try block "+22/0);
			return true;
		}catch(Exception e) {
			System.out.println("catch block ");
			return true;
		}finally {
			System.out.println("finally ");
			return false;
		}
}
	public void exceptionMethod1() {
		
		try {
			System.out.println("try block "+22/0);
			
		}catch(Exception e) {
			System.out.println("catch block ");
		}finally {
			System.out.println("finally ");
		}
}
	

	public static void main(String[] args) {
		
		Testcase obj = new Testcase();
		//obj.method(null);
		Integer i1=1000;
		Integer i2=1000;
		//System.out.println(obj.exceptionMethod());
		obj.exceptionMethod1();
		System.out.println(Long.valueOf(1).equals(Integer.valueOf(1)));
		//System.out.println(i1 == i2);
		
		System.out.println("------------------------");
		String s1 = new String("Epam");
		s1.concat("private");
		
		System.out.println(s1);
		System.out.println("------------------------");
		String s2 =s1.concat("LMd");
		s1 = s2.concat("hyd");
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
