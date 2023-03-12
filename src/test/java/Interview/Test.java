package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	TestPOM pom ;
	WebDriver driver;
	
	@BeforeClass
	public void BeforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Pushpa%3A_The_Rise");
		driver.manage().window().maximize();
		pom = new TestPOM(driver);
	}
	
	@BeforeMethod 
	public void Aftervoid() {
		System.out.println("After method");
	}
	
	@org.testng.annotations.Test
	public void wikipediaDate() {
		String date = pom.Get_wikidate();
		driver.navigate().to("https://www.imdb.com/title/tt9389998/?ref_=fn_al_tt_1");
		String imdbdate = pom.get_imbdDate();
		
		
		Assert.assertNotEquals(date, imdbdate);
		System.out.println("Tesct case paassssssssssssssssssssssss");
	}
	
	
	
	
}
