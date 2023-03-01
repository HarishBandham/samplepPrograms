package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RestrickElement {

	public static void main(String[] args) {
		
		List<String> listObj = Arrays.asList("har","bar","sar");
		listObj.set(0, "oor");
		List<String> listObj1 = new ArrayList<>(Arrays.asList("har","bar","sar"));
		List<String> listObj2 = Collections.unmodifiableList(listObj1);
		//listObj1.add("nar");
		//listObj2.set(0, "nar");
		System.out.println(listObj1);
		//System.out.println(listObj2);
		
		//List<String> java9 = List.of("har","bar","sar");
	}
	
	

}
