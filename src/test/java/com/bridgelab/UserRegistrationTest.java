package com.bridgelab;

import org.junit.Test;

import junit.framework.Assert;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	// Name Starts with a capital letter
	@Test
	public void givenFirstName_ShouldReturn_True() {
		boolean result = userRegistration.ValidateFirstName("Deepak");
		Assert.assertTrue(result);
	}

	// Name starts with small letter
	@Test
	public void givenFirstName_ShouldReturn_False() {
		boolean result = userRegistration.ValidateFirstName("deepak");
		Assert.assertFalse(result);
	}

	// When name does not contain minimum 3 letters
	@Test
	public void givenFirstName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateFirstName("de");
		Assert.assertFalse(result);
	}

	// Case For LastName
	// Last Name do not starts with Min three Letters
	@Test
	public void givenLastName_WhenDoNotReturnMinThreeLetters_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateLastName("Pa");
		Assert.assertFalse(result);

	}

	// Last Name start with small letter
	@Test
	public void givenLastName_WhenDoNotStartWithCapitalLetters_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateLastName("patil");
		Assert.assertFalse(result);
	}

	// Last Name Starts With a Capital Letter
	@Test
	public void givenLastName_WhenStartWithCapitalLetters_ShouldReturnTrue() {
		boolean result = userRegistration.ValidateLastName("Patil");
		Assert.assertTrue(result);
	}

	// case For Email

	// Email starts with small letter

	@Test
	public void givenEmail_WhenStartsWithSmallLetter_ShouldReturnTrue() {
		boolean result = userRegistration.ValidateEmail("deepak27@gmail.com");
		Assert.assertTrue(result);
	}
	// Email starts with Capital letter

	@Test
	public void givenEmail_WhenStartsWithCapitalLetter_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateEmail("Deepak27@gmail.com");
		Assert.assertTrue(result);
	}

	// email ends with .com

	@Test
	public void givenEmail_WhenEndsWithComOrIn_ShouldReturnTrue() {
		boolean result = userRegistration.ValidateEmail("deepakpatil27@gmail.com");
		Assert.assertTrue(result);
	}
	// email do not ends with .COM OR IN

	@Test
	public void givenEmail_WhenDoNotEndsWithComOrIn_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateEmail("deepakpatil27@gmail.inn");
		Assert.assertTrue(result);
	}

	// Cases for Mobile Number
	// Phone number followed with country code

	@Test
	public void givenMobileNumber_WhenFollowedByCountryCode_ShouldReturnTrue() {
		boolean result = userRegistration.ValidateMobileNumber("91 9632587410");
		Assert.assertTrue(result);
	}

	// Number does not contain country code

	@Test
	public void givenMobileNumber_WhenDoesNotFollowedByCountryCode_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateMobileNumber("9632587410");
		Assert.assertFalse(result);
	}

	// Phone Number Does Not have 10 digit number
	@Test
	public void givenMobileNumber_WhenDoNotHaveTenDigitNumber_ShouldReturnFalse() {
		boolean result = userRegistration.ValidateMobileNumber("9632587410");
		Assert.assertFalse(result);
	}

	// phone num has 10 digit number
	@Test
	public void givenMobileNumber_WhenHaseTenDigitNumber_ShouldReturnTrue() {
		boolean result = userRegistration.ValidateMobileNumber("91 9632587410");
		Assert.assertTrue(result);
	}
	// Validation of Password
	// Must Contain Minimum 8 Characters

	@Test
	public void givenPassword_WhenIsMinimumEightDigit_ShouldReturnTrue() {
		boolean result = userRegistration.ValidatePassword("Deepak@123");
		Assert.assertTrue(result);
	}
	// Does Not Fulfill The Criteria

	@Test
	public void givenPassword_WhenDoNotContainMinimumEightDigit_ShouldReturnFalse() {
		boolean result = userRegistration.ValidatePassword("Dee@12");
		Assert.assertTrue(result);

	}

	// Case For One UpperCase
	// Password with 1 uppercase
	@Test
	public void givenPassword_WhenContainOneUpperCase_ShouldReturnTrue() {
		boolean result = userRegistration.ValidatePassword("Deep@123");
		Assert.assertTrue(result);
	}

	// password does not contain any uppercase
	@Test
	public void givenPassword_WhenContainsNoUpperCase_ShouldReturnFalse() {
		boolean result = userRegistration.ValidatePassword("deep@123");
		Assert.assertFalse(result);
	}

	// case for 1 numeric number
	// password contains 1 numeric number
	@Test
	public void givenPassword_WhenContainsOneNumericNumber_ShouldReturnTrue() {
		boolean result = userRegistration.ValidatePassword("Deep@1234");
		Assert.assertTrue(result);
	}

	// case for no numeric number
	@Test
	public void givenPassword_WhenDoNotContainOneNumericNumber_ShouldReturnFalse() {
		boolean result = userRegistration.ValidatePassword("Deep@#");
		Assert.assertFalse(result);
	}

	// case for One Special Character
	// Have 1 special character
	@Test
	public void givenPassword_WhenPasswordHaveAtLeastOneSpecialCharacter_ShouldReturnTrue() {
		boolean result = userRegistration.ValidatePassword("Deep@1234");
		Assert.assertTrue(result);
	}

	// have no special Character
	@Test
	public void givenPassword_WhenPasswordDoNotHaveAnySpecialCharacter_ShouldReturnFalse() {
		boolean result = userRegistration.ValidatePassword("Deep1234");
		Assert.assertFalse(result);
	}

}
