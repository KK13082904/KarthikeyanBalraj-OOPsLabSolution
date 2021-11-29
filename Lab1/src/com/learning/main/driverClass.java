package com.learning.main;

import java.util.Scanner;
import com.learning.model.employee;
import com.learning.service.credentialService;

public class driverClass {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

		// Local variable for storing email and password
		String email;
		String password;
		
		//First Name 
		System.out.println("Please enter the First Name");
		String fn = sc.nextLine(); 
		//Last Name
		System.out.println("Please enter the Last Name");
		String ln = sc.nextLine(); 
		
		employee emp = new employee(fn, ln);
		
		// Call credentialService class
		credentialService cs = new credentialService();
		
		// Displaying options to user for selecting department
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		int choice = sc.nextInt();

		if (choice == 1) {
			email = cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "tech");
			password = credentialService.generatePassword();
			cs.showCredentials(emp.getFirstname(), email, password);

		}

		else if (choice == 2) {
			email = cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "admin");
			password = credentialService.generatePassword();
			cs.showCredentials(emp.getFirstname(), email, password);

		}

		else if (choice == 3) {
			email = cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "hr");
			password = credentialService.generatePassword();
			cs.showCredentials(emp.getFirstname(), email, password);

		}

		else if (choice == 4) {
			email = cs.generateEmailAddress(emp.getFirstname().toLowerCase(), emp.getLastName().toLowerCase(), "legal");
			password = credentialService.generatePassword();
			cs.showCredentials(emp.getFirstname(), email, password);

		}
		else {
			System.out.println("Invalid Option");

		}

	}

}
