package com.studentapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main2 {
     private static List<Student> studentList;
	public static void main(String[] args) {
		System.out.println("*************** Student Management System **************");
		System.out.println("*************** Welcome *************** ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Student Name");
		String name = scanner.next();//If you want to read the input in String format you will use next method
		System.out.println("You have entered the name...." + name);
	
	// To read integer values from the console/terminal
	//the readInt();
	
	System.out.println("Enter Student Age");
	int age = scanner.nextInt();
	System.out.println("The Student Age is..." + age);
	}
	
	
		
	private static void sortByName() {
		Comparator<Student> studentNameComparator = (o1,o2) -> o1.getName().compareTo(o2.getName());
				/*new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());//
			}
			
		
	};
	*/
     Collections.sort(studentList, studentNameComparator);
     System.out.println(studentList);

	}

	public static Student findStudentById(String studentId) {
		
		Student result = null;
		
		try {
		result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
		.findFirst()
		.orElseThrow(()-> new RuntimeException("No Data Found !!!"));
		}
		catch (RuntimeException e) {
			System.err.println("Student with ID "+studentId+" not found!!");
		}
		
		return result;
		}
	}




