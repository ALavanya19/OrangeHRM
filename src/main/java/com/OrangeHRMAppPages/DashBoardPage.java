package com.OrangeHRMAppPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.OrangeHRMBaseTest.BaseTest;

public class DashBoardPage extends BaseTest {
	
	
	//Instance Variable
	String userName;
	String password;
	
	//Create PageFactroy
	public DashBoardPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	//Object Repositary
	//Find all Objects in the Dashboard Page
	
	@FindBy(xpath="/html/body/div[1]/div[1]/a[1]/img")
	WebElement dashboardOhrmLogoE;
	

	@FindAll({
		
		@FindBy(xpath="//div[2]/ul/li[1]"),
	 //	WebElement adminE;
		
		@FindBy(xpath="//div[2]/ul/li[2]"),
	//	WebElement pimE;
		
		@FindBy(xpath="//div[2]/ul/li[3]"),
	//	WebElement leaveE;
		
		@FindBy(xpath="//div[2]/ul/li[4]"),
	//	WebElement timeE;
		
		@FindBy(xpath="//div[2]/ul/li[5]"),
	//	WebElement recruitmentE;
		
		@FindBy(xpath="//div[2]/ul/li[6]"),
	//	WebElement performanceE;
		
		@FindBy(xpath="//div[2]/ul/li[7]"),
	//	WebElement dashBoardE;
		
		@FindBy(xpath="//div[2]/ul/li[8]"),
	//	WebElement directoryE;
		
		@FindBy(xpath="//div[2]/ul/li[9]")
	//	WebElement maintanceE;
		
	})
	List<WebElement> headerMenuListE;
	
	
	@FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]//td[1]")
	WebElement assignLeaveE;
	
	@FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]//td[2]")
	WebElement leaveListE;
	
	@FindBy(xpath="//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]//td[3]")
	WebElement timeSheetsE;
	
	@FindBy(xpath="//*[@id=\"panel_resizable_1_0\"]/legend")
	WebElement empDisbySubunitE;

	@FindBy(xpath="//*[@id=\"panel_resizable_1_1\"]/legend")
  	WebElement legendE;
	
	@FindBy(xpath="//*[@id=\"panel_resizable_1_2\"]/legend")
	WebElement pendingLeaveRequestE;
	
    @FindBy(linkText="Welcome Admin")
    WebElement welcomeAdminE;
    
    @FindBy(linkText="About")
    WebElement welcomeAdminAboutE;
    
    @FindBy(linkText="Change Password")
    WebElement welcomeAdminChangePasswordE;
    
    @FindBy(linkText="Logout")
    WebElement welcomeAdminLogOutE;
    
   
	
	//Business Logic/Methods
    
    
    
    public void dashBoardPageTitle() {
		
		String actual_DashBoardTitle=driver.getTitle();
		String expected_DashBoardTitle="OrangeHRM";
		Assert.assertEquals(actual_DashBoardTitle, expected_DashBoardTitle, "DashBoard Page Title is Not Matched : FAIL");
		
	} 


	public void dashboardOhrmLogo() {
		
		boolean flag=dashboardOhrmLogoE.isDisplayed();
		
		Assert.assertTrue(flag, "Dashboard Ohrm Logo is not Displayed");
		
	}
	
	//header Operations
	public void headerMenu() {
		
		for(int list=0;list<headerMenuListE.size();list++)
		{
			System.out.println(headerMenuListE.get(list).getText());
			Actions action=new Actions(driver);
			action.moveToElement(headerMenuListE.get(list)).build().perform();
			
		}
		
	}
	
	//Quick Launch Table elements
	public void assignLeave() {
		
		assignLeaveE.click();
	}
	
	
	public void leaveList() {
		leaveListE.click();
	}
	
	public void timeSheets() {
		timeSheetsE.click();
	}
	
	//
	public void empDisbySubunit() {
		
		String actual_empDisbySubunit=empDisbySubunitE.getText();
		String expected_empDisbySubunit="Employee Distribution by Subunit";
		Assert.assertEquals(actual_empDisbySubunit, expected_empDisbySubunit, "Employee Distribution by Subunit Text is not Matched - FAIL");
		
	}
	
    public void legend() {
		
		String actual_Legend=legendE.getText();
		String expected_Legend="Legend";
		Assert.assertEquals(actual_Legend, expected_Legend, "Legend Text is not Matched - FAIL");
		
	}
    
    public void pendingLeaveRequest() {
		
		String actual_PendingLeaveRequest=pendingLeaveRequestE.getText();
		String expected_PendingLeaveRequest="Pending Leave Requests";
		Assert.assertEquals(actual_PendingLeaveRequest, expected_PendingLeaveRequest, "Pending Leave Request Text is not Matched - FAIL");
		
	}
	
	public void welcomeAdmin() {
		
		welcomeAdminE.click();
	
	}
	
	public void welcomeAdminAbout() {
		
		welcomeAdminAboutE.click();
		
	}
	
	public void welcomeAdminChangePassword() {
		
		welcomeAdminChangePasswordE.click();
	}
	public void welcomeAdminLogOut() {
		
		welcomeAdminLogOutE.click();
	}
	
	
	
	
	
}
