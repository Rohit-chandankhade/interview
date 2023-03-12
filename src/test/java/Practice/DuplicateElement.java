package Practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateElement {

	@Test
	public void Duplicate() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("C:\\Users\\ASUS\\OneDrive\\Desktop\\Rohit.html");
		driver.manage().window().maximize();
		
		
		WebElement element =  driver.findElement(By.xpath("//select[@id='automationtools']"));
		
		Select s = new Select(element);
		List<WebElement>  list =s.getOptions();
		System.out.println(list.size());
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		for(int i=0; i<list.size(); i++) {
			
			if(map.containsValue(list.get(i).getText())) {
				System.out.println("Duplicate element are "+ list.get(i).getText());
			}
			else {
				map.put(i, list.get(i).getText());
			}
		}
//		
		Assert.assertEquals(list.size(), map.size());

	}
}
