package com.OrangeHRMAppPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.OrangeHRMBaseTest.BaseTest;
import com.Properties.PropertiesClass;

public class DummyLoginPage extends BaseTest{
    
	static String userNameid=prop.getProperty("userName");
	
	DummyLoginPage(){
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void userName() {
		
		
	}

	
}


