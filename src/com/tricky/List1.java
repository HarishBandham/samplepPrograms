package com.tricky;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class List1 {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("one");
		list.add("two");
		list.add(7);
		for (String s: list)
		System.out.print(s);
		
		HashSet<Number> hs = new HashSet<Integer>();
		HashSet<? super ClassCastException> set = new HashSet<Exception>();
		List<String> list1 = new Vector<String>();
		List<Object> values = new HashSet<Object>();
		List<Object> objects = new ArrayList<? extends Object>();
		Map<String, ? extends Number> hm = new HashMap<String, Integer>();
	}

}
