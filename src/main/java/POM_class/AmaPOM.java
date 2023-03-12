package POM_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmaPOM {

	@FindBy (xpath="//span[@class='nav-line-2 ']")
	private WebElement accounlist;
	
	
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement emailsend;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement emailclick;
	
	@FindBy (xpath = "//input[@id='ap_password']")
	private WebElement passSend;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement passClick;
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SreachSend;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement SreachClick;
	
//	@FindBy (xpath = "(//div[@class='sg-col-inner'])[4]")
//	private WebElement iphone;
	
	
	@FindBy (xpath = "((//div[@class='sg-col-inner'])[4]//span)[17]")
	private WebElement iphoneRatings;
			
	public AmaPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Click_accounlist() {
		accounlist.click();
	}
	
	public void Send_emailsend(String email) {
		emailsend.sendKeys(email);
	}
	
	public void Click_emailclick() {
			emailclick.click();
		}
	public void Send_passSend(String pass) {
		passSend.sendKeys(pass);
	}
	public void click_passClick() {
		passClick.click();
	}
	public void Send_SreachSend() {
		SreachSend.sendKeys("iphone");
	}
	
	public void Click_SreachClick() {
		SreachClick.click();
		}
	public String get_iphoneRatings() {
		String text = iphoneRatings.getText();
		System.out.println(text);
		return text;
		
		
	}
//	public void () {
//		
//	}
//	
//	public void () {
//		
//	}
}
