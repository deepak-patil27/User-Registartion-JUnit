package com.bridgelab;

import java.util.regex.*;

interface userCheck {
	public String format(String name);
}

public class UserRegistration {

	public static void main(String[] args) {
		// Lambda expression for Check first Name
		userCheck obj = (name) -> {
			String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
			Pattern patternObject = Pattern.compile(firstNameRegex);
			Matcher matcherObject = patternObject.matcher(name);
			if (matcherObject.matches()) {
				System.out.println("Valid First Name:");
			} else {
				System.err.println("Invalid First Name:");
			}
			return name;
		};
		System.out.println(obj.format("Deepak"));

		// Lambda expression for Check last Name
		userCheck lastName = (name) -> {
			String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
			Pattern patternObject = Pattern.compile(firstNameRegex);
			Matcher matcherObject = patternObject.matcher(name);
			if (matcherObject.matches()) {
				System.out.println("Valid Last Name:");
			} else {
				System.err.println("Invalid Last Name:");
			}
			return name;
		};
		System.out.println(lastName.format("Patil"));

		// Lambda expression for Check Email Name
		userCheck emailId = (email) -> {
			String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
			Pattern patternObject = Pattern.compile(emailRegex);
			Matcher matcherObject = patternObject.matcher(email);
			if (matcherObject.matches()) {
				System.out.println("Valid Email Address:");
			} else {
				System.out.println("Invalid Email Address:");
			}
			return email;
		};
		System.out.println(emailId.format("deepak.123@gmail.com"));

		// Lambda expression for Check Mobile Number
		userCheck mobileNumber = (mobileNo) -> {
			String mobileRegex = "^[0-9]{2}\\s{1}[0-9]{10}$";
			Pattern patternObject = Pattern.compile(mobileRegex);
			Matcher matcherObject = patternObject.matcher(mobileNo);
			if (matcherObject.matches()) {
				System.out.println("Valid  Mobile Number:");
			} else {
				System.out.println("Invalid Mobile Number");
			}
			return mobileNo;
		};
		System.out.println(mobileNumber.format("91 9874563210"));

		// Lambda expression for Check Password
		userCheck Password = (password) -> {
			String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$";
			Pattern patternObject = Pattern.compile(passwordRegex);
			Matcher matcherObject = patternObject.matcher(password);
			if (matcherObject.matches()) {
				System.out.println("Valid Password:");
			} else {
				System.out.println("Invalid Password");
			}
			return password;
		};
		System.out.println(Password.format("Deepak@123"));
	}
}
