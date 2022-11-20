package com.OrangeHRMBaseTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.OrangeHRMAppPages.DashBoardPage;
import com.OrangeHRMAppPages.LoginPage;
import com.OrangeHRMAppPages.PimPage;
import com.Properties.PropertiesClass;
import com.Utility.Log;


public class BaseTest {

	public static WebDriver driver;

	public static FileInputStream loginPagePropertyFile;
	public static Properties prop;

	public LoginPage loginPage;
	public DashBoardPage dashboardPage;
	public PimPage pimPage;
	
    public FileInputStream loginMultTestInputDataFile;
    public XSSFWorkbook workbook;
    public XSSFSheet workbookSheet;
    public FileOutputStream loginMultTestOutputFile;
	
	
	public String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.edge.driver", "./DriverFiles/msedgedriver.exe");
		driver=new EdgeDriver();
		Log.info("EdgeDriver Lunched");
		
		driver.get(applicationUrlAddress);
		Log.info("Application Lunched");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
    	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		Log.info("Application closed");
		
	}
	
	
}
