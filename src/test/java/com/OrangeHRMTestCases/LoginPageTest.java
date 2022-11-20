package com.OrangeHRMTestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRMAppPages.DashBoardPage;
import com.OrangeHRMAppPages.LoginPage;
import com.OrangeHRMBaseTest.BaseTest;
import com.Utility.Log;


public class LoginPageTest extends BaseTest{
	
	
	@Test(enabled=false)
	public void loginTest() {
		
		loginPage=new LoginPage();
		loginPage.login("ALavanya19", "ALavanya@19");
		
	}
		
	
	@Test(priority=1)
	public void loginMultiDataTest() throws IOException, InterruptedException {
         
		loginPage=new LoginPage();
		
		
		loginMultTestInputDataFile=new FileInputStream("./src/main/java/com/OrangeHrmInputExcelFile/OrangeHRM_Login_MultipleTestData.xlsx");
		workbook=new XSSFWorkbook(loginMultTestInputDataFile);
		workbookSheet=workbook.getSheet("Sheet1");
		
		for(int row=1;row<=workbookSheet.getLastRowNum();row++)
		{
			String userNameData=workbookSheet.getRow(row).getCell(0).getStringCellValue();
			String passwordData=workbookSheet.getRow(row).getCell(1).getStringCellValue();
			
			String results=loginPage.loginMultiData(userNameData, passwordData);
			
			workbookSheet.getRow(row).createCell(3).setCellValue(results);
				
		}
		Log.info("Multiple Login Data Test Successfully");	
		
		loginMultTestOutputFile=new FileOutputStream("./src/main/java/com/OrangeHrmOutputExcelFile/OrangeHRM_Login_MultipleTestDataResults.xlsx");
		workbook.write(loginMultTestOutputFile);
		
	}
	
	/*
	@Test(priority=2)
	public void allRightsReservedTest() {
		
		loginpage=new LoginPage();
		loginpage.allRightsReserved();
		Log.info("All Rights Reserved Clicked");
		
	}
	
	@Test(priority=3)
	public void linkedINTest() {
		loginpage=new LoginPage();
		loginpage.linkedIN();
		Log.info("LinkedIN image link clicked");
	}
	
	@Test(priority=4)
	public void faceBookTest() {
		loginpage=new LoginPage();
		loginpage.faceBook();
		Log.info("Facebook image link clicked");
		
	}
	
	@Test(priority=5)
	public void twitterTest() {
		loginpage=new LoginPage();
		loginpage.twitter();
		Log.info("Twitter image link Clicked");
		
	}
	
	@Test(priority=6)
	public void youTubeTest() {
		loginpage=new LoginPage();
		loginpage.youTube();
		Log.info("youtube image link Clicked");
	
	}
	
	@Test(priority=7)
	public void loginPanelTextValidationTest() {
		loginpage=new LoginPage();
		loginpage.loginPanelTextValidation();
		Log.info("loginPanel Validation successfull");
		
	}
	
	@Test(priority=8)
	public void loginPageLogoTest() {
		loginpage=new LoginPage();
		loginpage.loginPageLogo();
		Log.info("loginPageLogo Validation successfull");
		
	}
    
	@Test(priority=9)
	public void loginPageTitleTest() {
		loginpage=new LoginPage();
		loginpage.loginPageTitle();
		Log.info("LoginPage Title Validation successfull");
		
	}
	
	@Test(priority=10)
	public void loginPageUrlTest() {
		loginpage=new LoginPage();
		loginpage.loginPageUrl();
		Log.info("LoginPage Url Validation Successfull");
		
	}
	*/
}
