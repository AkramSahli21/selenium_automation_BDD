package com.e2etests.automation.pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AuthentificationPage {

	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;
	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;
	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement button;
	@FindBy(how = How.ID, using = "spanMessage")
	public static WebElement errorMessage;
	@FindBy(how = How.ID, using = "spanMessage")
	public static WebElement invalidMessage;

	public void enterUserName() {
		username.sendKeys("Admin");
	}

	public void enterPassword() {
		password.sendKeys("admin123");
	}

	public void button() {
		button.click();
	}

	public void enterUserNameEmpty() {
		username.sendKeys("");
	}

	public void enterPasswordEmpty() {
		password.sendKeys("");
	}

	public void VerifyErrorMessage() {
		String expectedResult = "Username cannot be empty";
		String actualResult = errorMessage.getText();

		assertEquals(expectedResult, actualResult);

	}

	public void enterUserNameInvalide() {
		username.sendKeys("123");
	}

	public void enterPasswordInvalide() {
		password.sendKeys("123");
	}

	public void VerifyErrorMessageInvalide() {
		String expectedResult = "Invalid credentials";
		String actualResult = errorMessage.getText();

		assertEquals(expectedResult, actualResult);

	}

}
