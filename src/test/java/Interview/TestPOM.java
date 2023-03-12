package Interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPOM {
	
	@FindBy (xpath = "(//div[@class='plainlist'])[4]")
	private WebElement wikidate;
	
	@FindBy (xpath ="(//a[@class='ipc-metadata-list-item__list-content-item ipc-metadata-list-item__list-content-item--link'])[23]")
	private WebElement imbdDate;
	
	public TestPOM (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	

	public String Get_wikidate() {
		String s = wikidate.getText();
		System.out.println(s);
		return s;
	}
	
	public String get_imbdDate() {
		String ss =imbdDate.getText();
		return ss;
	}
}	
