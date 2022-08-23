package com.pdp.incubationProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapMain {

	public static void main(String[] args) {

		Student s1 = new Student(1, 40);        
        Student s2 = new Student(2, 60);
        Student s3 = new Student(3, 42);
        Student s4 = new Student(4, 63);                
        List<Student> listofStudents = Arrays.asList(s1,s2,s3,s4);
        
        List<Department> listOfDepartments = Arrays.asList(
        		new Department("mechanical", listofStudents),
                new Department("computers", listofStudents),
                new Department("civil", listofStudents));
        
        
        Stream<Student> studentStream = listOfDepartments.stream()
    			.flatMap(dept->dept.getStudents().stream());
        
        int max = studentStream.mapToInt(x->x.getMarks()).max().getAsInt();
        System.out.println(max);
        
        Student s = listOfDepartments.stream()
    			.flatMap(dept->dept.getStudents().stream())
    				.sorted(Comparator.comparingInt(Student::getMarks).reversed())
    				.findFirst().get();
        System.out.println(s);
        
        Student s11 = listOfDepartments.stream().flatMap(stu->stu.getStudents().stream()).
        		max(Comparator.comparing(z->z.getMarks())).get();
        
        System.out.println(s11);
        
		Map<String,Student> stud = listOfDepartments.stream()
				.collect(Collectors.toMap(
						x->x.departmentName,
			x->x.getStudents().stream().max(Comparator.comparing(z->z.getMarks())).get()
						
						));
		
		System.out.println(stud);
        
						
        
	}

	
}
