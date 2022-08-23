package com.pdp.incubationProgram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SortingOfMap {

	public static void main(String[] args) {

		Map<String,Integer> roleAndSalary = new HashMap<>();
		roleAndSalary.put("software Eng", 20000);
		roleAndSalary.put("Manager", 50000);
		roleAndSalary.put("devops eng", 22000);
		roleAndSalary.put("IT service", 29000);
		roleAndSalary.put("data Eng", 30000);
		roleAndSalary.put("associate Eng", 18000);
		roleAndSalary.put("Tester Eng", 21000);
		roleAndSalary.put("Trainer", 25000);
		roleAndSalary.put("staffing", 30000);
		roleAndSalary.put("pratice team", 34000);
		roleAndSalary.put(null, 1000);
		roleAndSalary.put("Management Team", null);
		
		
		roleAndSalary.entrySet().stream().filter(x->Objects.nonNull(x.getKey()))
		.sorted(Map.Entry.<String,Integer>comparingByKey().reversed())
		.forEach(System.out::println);
		
		System.out.println("\n---------\n");
		

		roleAndSalary.entrySet().stream().filter(x->Objects.nonNull(x.getValue()))
		.sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
		.forEach(System.out::println);
	}

}
