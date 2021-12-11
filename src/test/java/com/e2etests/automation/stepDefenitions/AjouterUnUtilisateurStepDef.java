package com.e2etests.automation.stepDefenitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.pageObjects.AjouterUserPage;
import com.e2etests.automation.pageObjects.AuthentificationPage;
import com.e2etests.utils.Common;
import com.e2etests.utils.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AjouterUnUtilisateurStepDef {
	public WebDriver driver;
	private AjouterUserPage ajouterUserPage = new AjouterUserPage();
	private Common common = new Common();

	public AjouterUnUtilisateurStepDef() {
		driver = Setup.driver;
		PageFactory.initElements(driver, AjouterUserPage.class);
	}

	@Given("^I click to admin button$")
	public void i_click_to_admin_button() throws Throwable {
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		ajouterUserPage.adminModule();
		

	}

	@When("^I click to the add button$")
	public void i_click_to_the_add_button() throws Throwable {
		ajouterUserPage.buttonAdd();
	}

	@When("^Add user page displayed$")
	public void add_user_page_displayed() throws Throwable {
		ajouterUserPage.verifyPageUser();
	}

	@When("^I choose the role of the user$")
	public void i_choose_the_role_of_the_user() throws Throwable {
		ajouterUserPage.selectChoice();
	}

	@When("^I put the Name$")
	public void i_put_the_Name() throws Throwable {
		ajouterUserPage.nomEmploiye();
	}

	@When("^I put the Username$")
	public void i_put_the_Username() throws Throwable {
		ajouterUserPage.userNameEmploiye();

	}

	@When("^I choose the status$")
	public void i_choose_the_status() throws Throwable {
		ajouterUserPage.selectStatus();
	}

	@When("^I put the password$")
	public void i_put_the_password() throws Throwable {
		ajouterUserPage.enterPassworduUser();
	}

	@When("^I confirm the password$")
	public void i_confirm_the_password() throws Throwable {
		ajouterUserPage.confirmPassworduUser();
	}

	@When("^I click to the Save button$")
	public void i_click_to_the_Save_button() throws Throwable {
		ajouterUserPage.buttonSave();
	}

	@Then("^I got a Succefully message$")
	public void i_got_a_Succefully_message() throws Throwable {

	}

}
