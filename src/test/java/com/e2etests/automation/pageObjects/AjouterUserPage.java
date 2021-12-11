package com.e2etests.automation.pageObjects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AjouterUserPage {
	

	@FindBy(how = How.ID, using = "txtUsername")
	public static WebElement username;
	@FindBy(how = How.ID, using = "txtPassword")
	public static WebElement password;
	@FindBy(how = How.ID, using = "btnLogin")
	public static WebElement button;
	@FindBy(how =How.ID , using ="menu_admin_viewAdminModule")
	public static WebElement adminmodule ;
	@FindBy (how = How.ID , using ="systemUser_employeeName_empName")
	public static WebElement empName;
	@FindBy (how = How.ID , using ="systemUser_userName")
	public static WebElement usernameemploiye;
	@FindBy (how = How.ID , using ="systemUser_password")
	public static WebElement passworduser;
	@FindBy (how = How.ID , using ="systemUser_confirmPassword")
	public static WebElement confirmpassworduser;
	@FindBy (how = How.ID , using ="btnSave")
	public static WebElement savebtn;
	@FindBy (how = How.ID , using ="btnAdd")
	public static WebElement saveadd;
	@FindBy (how = How.ID , using="UserHeading")
	public static WebElement UserHeading ;
	@FindBy(how = How.ID , using ="systemUser_userType")
	public static WebElement SelectUser;
	@FindBy(how = How.ID , using ="systemUser_status")
	public static WebElement SelectStatus;
	
	
	
	
	public void enterUserName() {
		username.sendKeys("Admin");
	}

	public void enterPassword() {
		password.sendKeys("admin123");
	}

	public void button() {
		button.click();
	}
	
	public void adminModule () {
		adminmodule.click();
	}
	 
	public void nomEmploiye() {
		empName.sendKeys("Aaliyah Haq");
	}
	
	public void userNameEmploiye() {
		usernameemploiye.sendKeys("akramsaw1122");
	}
	
	public void enterPassworduUser() {
		passworduser.sendKeys("sahlouba21AS!!");
	}

	public void confirmPassworduUser() {
		confirmpassworduser.sendKeys("sahlouba21AS!!");
	}

	public void buttonSave() {
		savebtn.click();
	}
	public void buttonAdd() {
		saveadd.click();
	}
	public void verifyPageUser(){
		String textActuel = UserHeading.getText();
		String textExpected = "Add User";
		assertEquals(textActuel, textExpected);
	}
	public void selectChoice () {
		
		Select se = new Select (SelectUser);
		se.selectByValue("2");
	}
	public void selectStatus() {
		Select se = new Select (SelectStatus);
		se.selectByValue("1");
	}
}
