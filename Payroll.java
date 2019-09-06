package arrays2;

import employees.*;
import util.*;

/**
* Tests the {@link Employee} class.
*/

public class Payroll {
	public static void main(String[] args)	{
		Employee e = null;
		String fName, lName;
		int dept;
		double salary;
		
		for (int i = 0; i < 1; i++)	{
			fName = KeyboardReader.getPromptedString("Enter First Name: ");
			lName = KeyboardReader.getPromptedString("Enter last name: ");
			do	{
				dept = KeyboardReader.getPromptedInt("Enter Department: ");
				if (dept <= 0) System.out.println("Department must be >= 0");
			}	while (dept <= 0);
			do	{
				salary = KeyboardReader.getPromptedDouble("Enter Pay Rate: ");
				if (salary < 0.0) System.out.println("Pay rate must be >= 0");
			}	while (salary< 0.0);
			e = new Employee(fName, lName, dept, salary);
			System.out.println(e.getPayInfo());
		}

/**	
		fName = KeyboardReader.getPromptedString("Enter First Name: ");
		lName = KeyboardReader.getPromptedString("Enter Last Name: ");
		dept = KeyboardReader.getPromptedInt("Enter Department: ");
		if (dept <=0)	{
			System.out.println("Department must be > 0");
			dept = 0;
		}
		payRate = KeyboardReader.getPromptedDouble("Enter Pay Rate: ");
		if (payRate < 0.0)	{
			System.out.println("Pay Rate must be Greater or equal to 0");
		}
		
*/

/**
		fName = KeyboardReader.getPromptedString("Enter First Name: ");
		lName = KeyboardReader.getPromptedString("Enter Last Name: ");
		dept = KeyboardReader.getPromptedInt("Enter Department: ");
		payRate = KeyboardReader.getPromptedDouble("Enter Pay Rate: ");
		Employee e2 = new Employee(fName, lName, dept, payRate);
		
		fName = KeyboardReader.getPromptedString("Enter First Name: ");
		lName = KeyboardReader.getPromptedString("Enter Last Name: ");
		dept = KeyboardReader.getPromptedInt("Enter Department: ");
		payRate = KeyboardReader.getPromptedDouble("Enter Pay Rate: ");
		Employee e3 = new Employee(fName, lName, dept, payRate);
		
		System.out.println(e1.getPayInfo());
		//System.out.println(e2.getPayInfo());
		//System.out.println(e3.getPayInfo());
		/*
		Employee e1 = new Employee();
		e1.setFirstName("John");
		e1.setLastName("Doe");
		e1.setPayRate(6000.00);
		e1.setDept(2);
		System.out.println(e1.getPayInfo());
		
		/**Employee e2 =
				new Employee("Jane", "Smith", 15, 6500);
				System.out.println(e2.getPayInfo());
				
		//Employee e3 =
				new Employee("Bob", "Jones", 6500);
				System.out.println(e3.getPayInfo());
				
		Employee e4 =
				new Employee("Bill", "Meelater", 15);
				System.out.println(e4.getPayInfo()); */
	}
}
