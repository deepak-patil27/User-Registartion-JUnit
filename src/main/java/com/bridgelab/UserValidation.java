package com.bridgelab;

import java.util.Scanner;

public class UserValidation extends UserRegistration {
	public void SelectOption() {
		while (true) {
			System.out.println("1. FirstName");
			System.out.println("2. LastName");
			System.out.println("3. Email");
			System.out.println("4. Mobile Number");
			System.out.println("5. Password");
			System.out.println("0. Exit");
			System.out.println("Enter option to check for Validation");

			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("Enter your first name");
				String firstName = sc.next();
				ValidateFirstName(firstName);
				break;
			case 2:
				System.out.println("Enter your Last name");
				String lastName = sc.next();
				ValidateLastName(lastName);
				break;
			case 3:
				System.out.println("Enter your Email Address");
				String email = sc.next();
				ValidateEmail(email);
				break;
			case 4:
				System.out.println("Enter your Mobile Number");
				String mobile = sc.next();
				ValidateMobileNumber(mobile);
				break;
			case 5:
				System.out.println("Enter your Password");
				String password = sc.nextLine();
				ValidatePassword(password);
				break;
			case 0:
				return;
			}
		}
	}

}