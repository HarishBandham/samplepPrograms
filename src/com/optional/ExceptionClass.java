package com.optional;

public class ExceptionClass {

	
	public static void main(String[] args) {

		String s1 = new String("Epam");
		s1.concat(" private");
		
		String s2 =s1.concat("Client XYZ");
		s1 = s2.concat("LOcation Hyd");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("\n-----------\n");
		System.out.println(Integer.valueOf(1).equals(Long.valueOf(1)));
		
		Integer i1=1000;
		Integer i2=1000;
		System.out.println(i1 == i2);
	}

}
