package com.rashmi.first;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

class TestHTTPServer2 {
	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String name;
		int age;
		float income;
		boolean marital_status;
		
		List<Employee> li = new ArrayList<>();
		
		HashSet hs = new HashSet();
		for (int i = 0; i < 3; i++) {
			System.out.println("name:");
			name = user_input.next();

			System.out.println("age :");
			age = user_input.nextInt();

			System.out.println("income :");
			income = user_input.nextFloat();
			if (income > 300000) {
				System.out.println("your salary is higher than 300000");
			}
			System.out.println("marital_status:");
			marital_status = user_input.nextBoolean();
			Employee e = new Employee(name,age,income,marital_status);
			li.add(e);
		}
		
		

		Employee e1 = new Employee ("ram",15,5000,true);
		Employee e2 = new Employee ("shyam",13,15000,true);
		
		if ( e1.equals(e2) ){
			
			System.out.println(" The two employees are same!! ");
			
		}
		
		
		
		
		
		System.out.println("All the entries have been taken. Printing them:-");
		for (Employee e : li){
			
			
			System.out.println(e.getName() +" , " + e.getAge() +" , " +  e.getIncome() +" , " +  e.isMarital_status() );
		}

	}

}
