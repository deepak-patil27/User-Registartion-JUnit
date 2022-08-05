package com.bridgelab;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {

	@Test
	public void firstnameTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.FirstName();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void lastnameTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.LastName();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void mobileTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.MobileNumber();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void emailTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.Email();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

	@Test
	public void passwordTest() {
		try {
			UserRegistration user = new UserRegistration();
			boolean result = user.Password();
			Assert.assertEquals(true, result);

		} catch (InvalidUserInputException i) {
			System.out.println("Invalid input");
		}
	}

}
