package com.OrangeHRMAppPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.OrangeHRMBaseTest.BaseTest;

public class PimPage extends BaseTest {
	
	public PimPage(){
		
		PageFactory.initElements(driver, this);
		
	}

	
	//Object Identification
	@FindBy(id="menu_pim_viewPimModule")
	WebElement pimE;
	
    @FindBy(id="menu_pim_Configuration")
    WebElement configurationE;
    
         @FindBy(id="menu_pim_configurePim")
         WebElement menuPim_configurePimE;
    	   
         
         @FindBy(id="menu_pim_listCustomFields")
         WebElement menuPim_listCustomFieldsE;
    
         @FindBy(id="menu_admin_pimCsvImport")
         WebElement menuPim_pimCsvImportE;
    	   
         @FindBy(id="menu_pim_viewReportingMethods")
         WebElement menuPim_viewReportingMethodsE;
    	   
         @FindBy(id="menu_pim_viewTerminationReasons")
         WebElement menuPim_viewTerminationReasonsE;
    	   
 
    @FindBy(id="menu_pim_viewEmployeeList")
    WebElement employeeListE;
    
    @FindBy(id="menu_pim_addEmployee")
    WebElement addEmployeeE;
    
    @FindBy(id="menu_core_viewDefinedPredefinedReports")
    WebElement reportsE;
	
    
	//Business Logic
    public void pim() throws InterruptedException {
     
    	Actions action=new Actions(driver);
    	action.moveToElement(pimE).build().perform();
    	
    	String actual_pimText=pimE.getText();
    	String expected_pimText="PIM";
    	Assert.assertEquals(actual_pimText, expected_pimText, "PIM Text is not Matched - FAIL");
    	
    }
    
    public void pimConfiguration() {
    	
    	Actions action=new Actions(driver);
    	action.moveToElement(configurationE).build().perform();
    	
    }
    
    public void menuPimConfigurePim() {
    	
    	menuPim_configurePimE.click();
    	String actual_MenuPimconfigurePim=menuPim_configurePimE.getText();
    	String expected_actual_menupimconfigurePim="Optional Fields";
    	Assert.assertEquals(actual_MenuPimconfigurePim, expected_actual_menupimconfigurePim, "PimConfig Optional Fields Text is not Matched : FAIL");
    }
    
    public void menuPimListCustomFields() {
    	
    	menuPim_listCustomFieldsE.click();
    	String actual_MenuPimListCustomFields=menuPim_listCustomFieldsE.getText();
    	String expected_menupimlistCustomFields="Custom Fields";
    	Assert.assertEquals(actual_MenuPimListCustomFields, expected_menupimlistCustomFields, "PIMConfig Custom Fields Text is not Matched : FAIL");
    }
    
    public void menuPimCsvImport() {
    	
    	menuPim_pimCsvImportE.click();
    	String actual_menuPimCsvImport=menuPim_pimCsvImportE.getText();
    	String expected_menuPimCsvImport="Data Import";
    	Assert.assertEquals(actual_menuPimCsvImport, expected_menuPimCsvImport, "PIMConfig Data Import Text is not Matched : FAIL");
    }
    
    public void menu_pim_viewReportingMethods() {
    	
    	menuPim_viewReportingMethodsE.click();
    	String actual_MenuPimViewReporting=menuPim_viewReportingMethodsE.getText();
    	String expected_MenuPimViewReporting="Reporting Methods";
    	Assert.assertEquals(actual_MenuPimViewReporting, expected_MenuPimViewReporting, "PIMConfig Reporting Methods Text is not Matched : FAIL ");
    }
    
    
    public void menuPimViewTerminationReasons() {
    	
    	menuPim_viewTerminationReasonsE.click();
    	String actual_MenuPimViewTerminationReasons=menuPim_viewTerminationReasonsE.getText();
    	String expected_MenuPimViewTerminationReasons="Termination Reasons";
    	Assert.assertEquals(actual_MenuPimViewTerminationReasons, expected_MenuPimViewTerminationReasons, "PIMConfig Termination Reasons Text is not Matched : FAIL");
    }
    
    
    public void employeeList() {
    	
    	employeeListE.click();
    	String actual_PimEmployeeList=employeeListE.getText();
    	String expected_PimEmployeeList="Employee List";
    	Assert.assertEquals(actual_PimEmployeeList, expected_PimEmployeeList, "Pim Employee List Text is not Matched : FAIL");
    	
    }
    
    public void addEmployee() {
    	addEmployeeE.click();
    	String actual_PimAddEmployee=addEmployeeE.getText();
    	String expected_PimAddEmployee="Add Employee";
    	Assert.assertEquals(actual_PimAddEmployee, expected_PimAddEmployee, "Pim Add Employee Text is not Matched  : FAIL");
    }
    
    public void menuPimReports() {
    	
    	reportsE.click();
    	String actual_PimReports=reportsE.getText();
    	String expected_PimReports="Reports";
    	Assert.assertEquals(actual_PimReports, expected_PimReports, "Pim Reports Text is not Matched : FAIL");
    }
    
    
    
    
}
