package com.bridgelab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	static Scanner scan = new Scanner(System.in);

	public boolean FirstName() throws InvalidUserInputException {
		System.out.println("Enter First Name : ");
		String name = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(name);

		if (ma.matches() == true) {
			System.out.println("Entered First Name : " + name + " is " + ma.matches());
			return ma.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

	public boolean LastName() throws InvalidUserInputException {
		System.out.println("Enter Last Name : ");
		String lastname = scan.next();
		String regex = "[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(lastname);

		if (ma.matches() == true) {
			System.out.println("Entered Last Name : " + lastname + " is " + ma.matches());
			return ma.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

	public static boolean Email() throws InvalidUserInputException {
		System.out.println("Enter Email ID: ");
		String email = scan.next();
		String regex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(email);

		if (ma.matches() == true) {
			System.out.println("Entered Email Id : " + email + " is " + ma.matches());
			return ma.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

	public boolean MobileNumber() throws InvalidUserInputException {
		System.out.println("Enter Mobile Number : ");
		String mobile = scan.next();
		String regex = "(91)?[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(mobile);

		if (ma.matches() == true) {
			System.out.println("Entered Mobile Number : " + mobile + " is " + ma.matches());
			return ma.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();

	}

	public boolean Password() throws InvalidUserInputException {
		System.out.println("Enter Password : ");
		String password = scan.next();
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher ma = pattern.matcher(password);

		if (ma.matches() == true) {
			System.out.println("Entered Password : " + password + " is " + ma.matches());
			return ma.matches();
		}
		// if not match throw exception
		throw new InvalidUserInputException();
	}

}
