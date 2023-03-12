package Test_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM_class.AmaPOM;
import Utility_Class.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AmaTest {

	WebDriver driver;
	public AmaPOM pom;

	
	@BeforeClass
	public void BeforeClass() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		pom = new AmaPOM(driver);
	}
	
	@BeforeMethod
	public void BeforeMethod() throws EncryptedDocumentException, IOException {
		pom.Click_accounlist();
		pom.Send_emailsend(Utility.FetchData_ExcelSheet("Sheet1", 7, 7));
		pom.Click_emailclick();
		pom.Send_passSend(Utility.FetchData_ExcelSheet("Sheet1", 7, 8));
		pom.click_passClick();
		
	}
	
	@Test
	public void Ratings() {
		pom.Send_SreachSend();
		pom.Click_SreachClick();
		pom.get_iphoneRatings();
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}
	
	@AfterClass
	public void AfterClass() {
		driver.quit();
	}
}
