package com.algor;

import java.io.InputStream;

public class Scanner {
	public Scanner(InputStream in) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		
		
		Scanner myObj = new Scanner(System.in);

	    System.out.println("Enter name, age and salary:");

	    // String input
	    String name = myObj.nextLine();

	    // Numerical input
	   // int age = myObj.nextLine();
	   // double salary = myObj.nextLine();

	    // Output input by user
	    System.out.println("Name: " + name);
	   // System.out.println("Age: " + age);
	 //   System.out.println("Salary: " + salary);
		
		
		
		
		
		
		
	}

	private String nextLine() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
