package com.OrangeHRMTestCases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRMAppPages.DashBoardPage;
import com.OrangeHRMAppPages.LoginPage;
import com.OrangeHRMBaseTest.BaseTest;
import com.Properties.PropertiesClass;
import com.Utility.Log;

public class DashboardPageTest extends BaseTest {

	DashboardPageTest dashBoardPageTest;

	@BeforeMethod
	public void LoginTest() {
		
		loginPage=new LoginPage();
		
		loginPage.login("ALavanya19","ALavanya@19");
			
	}
	
	@AfterMethod
	public void closeTest() {
		
		dashboardPage=new DashBoardPage();
		dashboardPage.welcomeAdmin();
		dashboardPage.welcomeAdminLogOut();
	}
	
	@Test(priority=2)
	public void dashboardOhrmLogoTest() {
  
	
		dashboardPage=new DashBoardPage();
		dashboardPage.dashboardOhrmLogo();
		Log.info("DashBoard Logo Varification Successfull");
		
	}
	
	@Test(priority=3)
	public void headerMenuTest() {
  
	
		dashboardPage=new DashBoardPage();
		dashboardPage.headerMenu();
		
	}
	
	@Test(priority=4)
    public void assignLeaveTest() {
    	dashboardPage=new DashBoardPage();
        dashboardPage.assignLeave();
    }
    
	@Test(priority=5)
    public void leaveListTest() {
    	dashboardPage=new DashBoardPage();
    	dashboardPage.leaveList();
    }
    
	@Test(priority=6)
    public void timeSheetsTest() {
    	dashboardPage=new DashBoardPage();
    	dashboardPage.timeSheets();
    	
    }
  
	@Test(priority=7)
    public void empDisbySubunitTest() {
    	dashboardPage=new DashBoardPage();
    	dashboardPage.empDisbySubunit();
    }
    
	@Test(priority=8)
    public void legendTest() {
    	
    	dashboardPage=new DashBoardPage();
    	dashboardPage.legend();
    }
    
	@Test(priority=9)
    public void pendingLeaveRequest() {
    	
    	dashboardPage=new DashBoardPage();
    	dashboardPage.pendingLeaveRequest();
    }
	
	
	@Test(priority=11)
	public void welcomeAdminAbout() {
		dashboardPage=new DashBoardPage();
		dashboardPage.welcomeAdmin();
		dashboardPage.welcomeAdminAbout();
		dashboardPage.welcomeAdminLogOut();
	}
	
	
	@Test(priority=12)
	public void dashBoardPageTitleTest() {
		dashboardPage=new DashBoardPage();
		dashboardPage.dashBoardPageTitle();
	}
	@Test(priority=13)
	public void welcomeAdminChangePassword() {
		dashboardPage=new DashBoardPage();
		dashboardPage.welcomeAdmin();
		dashboardPage.welcomeAdminChangePassword();
		
	}
    
	
}
