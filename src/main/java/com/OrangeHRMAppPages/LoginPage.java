package com.OrangeHRMAppPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import com.OrangeHRMBaseTest.BaseTest;

public class LoginPage extends BaseTest {
	
	
	DashBoardPage dashboardPage;
	
	//Instance Variables
	String userName;
	String password;
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	// Object Repository Class
	// Identification of the Element of the Webpage - based on its Properties
	
	//Logo Properties
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div/img")
	WebElement loginPanelLogoE;
	
	//Login Panel 
	@FindBy(id="logInPanelHeading")
	WebElement loginPanelTextE;
	
	//UserName properties
	@FindBy(name="txtUsername")
	WebElement userNameE;
	
	//Password Properties
	@FindBy(id="txtPassword")
	WebElement passwordE;
	
	//Login Button Properties
	@FindBy(id="btnLogin")
	WebElement loginButtonE;
	
	//Alternative Login dropbox properties
	@FindBy(id="openIdProvider")
	WebElement alternativeLoginE;
	
	//Alternative Login Button properties
	@FindBy(id="openIdLogin")
	WebElement alternativeLoginButtonE;
	
	//Orange HRM all rights reserved properties
	@FindBy(partialLinkText="Inc")
	WebElement allRightsReservedE;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[1]")
	WebElement linkedINE;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[2]")
	WebElement facebookE;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[3]")
	WebElement twitterE;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[2]/a[4]")
	WebElement youTubeE;
	
	
	
	//Business Logic/User Method to perform operations on Element
	//Login operation
	
	public void login(String userName,String password)
	{
		userNameE.sendKeys(userName);
		passwordE.sendKeys(password);
		loginButtonE.click();
	}
	
	
	public String loginMultiData(String userName,String password)
	{
		dashboardPage=new DashBoardPage();
		userNameE.sendKeys(userName);
		passwordE.sendKeys(password);
		loginButtonE.click();
		
		String actual_DashBoardUrl=driver.getCurrentUrl();
		String expected_DashBoardUrl="dashboard";
		boolean flag=actual_DashBoardUrl.contains(expected_DashBoardUrl);
		if(flag) {
		    
			Assert.assertTrue(flag, "Invalid UserName and Password"); 
		    dashboardPage.welcomeAdmin();
			dashboardPage.welcomeAdminLogOut();
			return "PASS";
			
		}
		else
		{
			Assert.assertFalse(flag, "Valid UserName and Password");
			return "FAIL";
			
		}
		
		
	
	}
	
	/*
	//Alternative Login operation
	public void allRightsReserved() {
		allRightsReservedE.click();	
	}
	
	//Linked In link operation
	public void linkedIN() {
		
		linkedINE.click();
	}
	
	//Facebook operation
	public void faceBook() {
		
		facebookE.click();
	}
	
	//twitter operation
	public void twitter() {
		
		twitterE.click();
	}

	//Youtube operation
	public void youTube() {
		youTubeE.click();
	}
	
	//Get LoginPanelText validations
	public void loginPanelTextValidation() {
		
		System.out.println("Login panel entered");
		String expected_LoginPanelText="LOGIN Panel";
		String actual_LoginPanelText=loginPanelTextE.getText();
		Assert.assertEquals(actual_LoginPanelText, expected_LoginPanelText, "Text not Matched - FAIL");
	}
	
	//Validate LoginPage LOGO
	public void loginPageLogo() {
		boolean flag=loginPanelLogoE.isDisplayed();
		Assert.assertTrue(flag, "Login Panel Logo not found");
		
	}
	
	//Validate LoginPage Title
	public void loginPageTitle() {
		
		String expected_LoginPageTitle="OrangeHRM";
		String actual_LoginPageTitle=driver.getTitle();	
		Assert.assertEquals(actual_LoginPageTitle, expected_LoginPageTitle, "LoginPage Title not Matched - FAIL");
	}
	
	//validate LoginPage current Url
	public void loginPageUrl() {
		String expected_LoginPageCurrentUrl="orangehrm-4.2.0.1";
		String actual_LoginPageCurrentUrl=driver.getCurrentUrl();
		boolean flag=actual_LoginPageCurrentUrl.contains(expected_LoginPageCurrentUrl);
		Assert.assertTrue(flag, "Login Page URL not Matched - FAIL");
	
	}
	
   */
	
}
