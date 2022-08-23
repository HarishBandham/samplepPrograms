package com.generics;

import java.util.ArrayList;
import java.util.List;

public class Program1 {

	static Character charArr[] = { 'a', 'c', 's', 'd' };
	static Integer intArr[] = { 1, 3, 4, 6, 7, 5 };
	static Boolean boolArr[] = { true, false, false, true };

	public static void main(String[] args) {

		List<Character> charList = arrayToList(charArr, new ArrayList<>());
		List<Boolean> boolList = arrayToList(boolArr, new ArrayList<>());
		List<Integer> intList = arrayToList(intArr, new ArrayList<>());
		System.out.println(intList.get(0));
	}

	private static<T>  List<T> arrayToList(T[] object, List<T> arrayList) {

		for (T obj : object) {
			arrayList.add(obj);
		}
		return arrayList;
	}

}
