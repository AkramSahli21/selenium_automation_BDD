package com.e2etests.automation.stepDefenitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.e2etests.automation.pageObjects.AuthentificationPage;
import com.e2etests.utils.Common;
import com.e2etests.utils.FileReaderManager;
import com.e2etests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDef {

	public WebDriver driver;
	private AuthentificationPage authentificationPage = new AuthentificationPage();
	private Common common = new Common();
	public AuthentificationStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AuthentificationPage.class);

	}

	@Given("^I navigate to the application$")
	public void i_navigate_to_the_application() throws Throwable {
		FileReaderManager fileReaderManager = new FileReaderManager();
		driver.get(fileReaderManager.getInstance().getApplicationUrl());
		//WebDriverWait wait = new WebDriverWait(driver, 10);

	}

	@When("^I enter the correct username$")
	public void i_enter_the_correct_username() throws Throwable {
		authentificationPage.enterUserName();

	}

	@When("^I enter the correct password$")
	public void i_enter_the_correct_password() throws Throwable {
		authentificationPage.enterPassword();
	}

	@When("^I click to the button$")
	public void i_click_to_the_button() throws Throwable {
		authentificationPage.button();
	}

	@Then("^I connect to the dashbord page$")
	public void i_connect_to_the_dashbord_page() throws Throwable {

	}

	@When("^I enter an invalid username$")
	public void i_enter_an_invalid_username() throws Throwable {
		authentificationPage.enterUserNameInvalide();

	}

	@When("^I enter an invalid password$")
	public void i_enter_an_invalid_password() throws Throwable {
		authentificationPage.enterPasswordInvalide();
	}


	@Then("^I got an erreur message$")
	public void i_got_an_erreur_message() throws Throwable {
		authentificationPage.VerifyErrorMessageInvalide();
					}

	@When("^I leave the fields empty username$")
	public void i_leave_the_fields_empty_username() throws Throwable {
		authentificationPage.enterUserNameEmpty();
	}

	@When("^I leave the fields empty password$")
	public void i_leave_the_fields_empty_password() throws Throwable {
		authentificationPage.enterPasswordEmpty();
	}

	@Then("^I received an error message$")
	public void i_received_an_error_message() throws Throwable {
		authentificationPage.VerifyErrorMessage();
	   
	}
}
