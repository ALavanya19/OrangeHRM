package com.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.OrangeHRMBaseTest.BaseTest;

public class PropertiesClass extends BaseTest {

	
	public static final String LoginProperties = null;

	public static void LoginProperties() {
		
     	try {
     		
			loginPagePropertyFile=new FileInputStream("./src/main/java/com/Properties/loginPage.properties");
			prop=new Properties();
			try {
				prop.load(loginPagePropertyFile);
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		} 
     	
     	catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}	

		
     	String userNameP=prop.getProperty("userName");

	}
}
