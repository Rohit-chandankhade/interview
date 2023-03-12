package Test_Class;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Base_Class.DiffrentBrowser;
import POM_class.Amazon_POM;
import Utility_Class.Utility;

public class AmazpoonTest {

	WebDriver driver;
	Amazon_POM pom; 
	
	@Parameters ("browser")
	@BeforeTest
	public void BeforeTest(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			 driver = DiffrentBrowser.ChromeBrowserOpen("https://www.amazon.in");
		}
		
		if(browser.equalsIgnoreCase("firefox")) {
			driver = DiffrentBrowser.FirefoxBrowserOpen("https://www.amazon.in");
		}
	}
	
	@BeforeClass
	public void BeforeClass() {
		pom = new Amazon_POM(driver);
		pom.Click_account_list();
		
		
	}
	
	@BeforeMethod
	public void BeforeMethod() throws EncryptedDocumentException, IOException {
		pom.Put_email(Utility.FetchData_ExcelSheet("Sheet1", 7, 7));
		pom.Click_email();
		pom.Put_password(Utility.FetchData_ExcelSheet("Sheet1", 7, 8));
		pom.Click_password();
		pom.Click_searchField();
		pom.Click_searchbtn();
	}
	
	@Test
	public void Test() {
		pom.get_washingMachine();
		pom.user_click_washingmachine(driver);
		
	}
	
	@AfterMethod
	public void AfterMethod() {
		pom.Click_All();
		pom.Click_All_signout();
	}
	
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}
}


