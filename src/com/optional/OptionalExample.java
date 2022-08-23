package com.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object ob = null;
		ArrayList<String> ae = new ArrayList<>(Arrays.asList("x","y","z","a","b"));
		String str= "Root";
		List<?> li = getArrayList(ae,ob);
		System.err.println(li.size());
		
		
	}

	private static <T> T getArrayList(ArrayList<String> ae,Object ob) {
		// TODO Auto-generated method stub
		System.out.println(Optional.ofNullable(ob).orElse("<N/A>")); //MALE
		return (T)(Objects.isNull(ob)?ob:null);
	}

	
}
