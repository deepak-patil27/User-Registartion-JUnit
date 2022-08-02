package com.bridgelab;

public class UserRegistration {

	public boolean ValidateFirstName(String firstName) {
		boolean Validation = firstName.matches("[A-Z]{1}[a-z]{2,}");
		if (Validation) {
			System.out.println(firstName + " is an Valid First Name");
		} else {
			System.out.println(firstName + " is an Invalid First Name");
		}
		return Validation;
	}

	public boolean ValidateLastName(String lastName) {
		boolean Validation = lastName.matches("[A-Z]{1}[a-z]{2,}");
		if (Validation) {
			System.out.println(lastName + " is an Valid Last Name");
		} else {
			System.out.println(lastName + " is an Invalid Last Name");
		}
		return Validation;
	}

	public static boolean ValidateEmail(String email) {
		boolean Validation = email
				.matches("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
		if (Validation) {
			System.out.println(email + " is a Valid Email address\n");
		} else {
			System.out.println(email + " is an Invalid Email address");
		}
		return Validation;
	}

	public boolean ValidateMobileNumber(String mobileNumber) {
		boolean Validation = mobileNumber.matches("^[0-9]{2}\\s{1}[0-9]{10}$");
		if (Validation) {
			System.out.println(mobileNumber + " is a Valid  Mobile Number\n");
		} else {
			System.out.println(mobileNumber + " is an Invalid Mobile Number");
		}
		return Validation;

	}

	public boolean ValidatePassword(String Password) {
		boolean Validation = Password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])([a-zA-Z0-9]*).{8,}$");
		if (Validation) {
			System.out.println(Password + " is a Valid  Password\n");
		} else {
			System.out.println(Password + " is an Invalid Password");
		}
		return Validation;
	}

}
