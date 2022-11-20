package com.OrangeHRMTestCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OrangeHRMAppPages.LoginPage;
import com.OrangeHRMAppPages.PimPage;
import com.OrangeHRMBaseTest.BaseTest;

public class PimPageTest  extends BaseTest{
	
	DashboardPageTest dashBoardPage;
	
	@BeforeTest
	public void loginTest() {
	
		loginPage=new LoginPage();
		loginPage.login("ALavanya19", "ALavanya@19");
		
	}
	
	@Test(priority=1)
	public void pimTest() {
		
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	@Test(priority=2)
	public void pimConfigurationTest() {
		
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimPage.pimConfiguration();
		
	}
	
	@Test(priority=3)
	public void menuPimConfigurePimTest(){
		
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimPage.pimConfiguration();
		pimPage.menuPimConfigurePim();
	}
	
	@Test(priority=4)
	public void menuPimListCustomFieldsTest(){
		
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimPage.pimConfiguration();
		pimPage.menuPimListCustomFields();
		
	}

	@Test(priority=5)
	public void menuPimCsvImportTest(){
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimPage.pimConfiguration();
		pimPage.menuPimCsvImport();
	}
	
	@Test(priority=6)
	public void menu_pim_viewReportingMethodsTest(){
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimPage.pimConfiguration();
		pimPage.menu_pim_viewReportingMethods();
	}
	
	@Test(priority=7)
	public void menuPimViewTerminationReasonsTest() {
		pimPage=new PimPage();
		try {
			pimPage.pim();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pimPage.pimConfiguration();
		pimPage.menuPimViewTerminationReasons();
	}
	
	@Test(priority=8)
	public void employeeListTest() {
		pimPage=new PimPage();
		pimPage.employeeList();
	}
	
	@Test(priority=9)
	public void addEmployeeTest() {
		pimPage=new PimPage();
	   pimPage.addEmployee();	
	}
	
	@Test(priority=10)
	public void menuPimReportsTest() {
		pimPage=new PimPage();
		pimPage.menuPimReports();
	}
	
	
	
}
