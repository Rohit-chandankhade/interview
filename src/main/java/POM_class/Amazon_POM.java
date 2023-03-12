package POM_class;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_POM {

	@FindBy (xpath = "//span[@class='nav-line-2 ']")
	private WebElement accountlist;
	
	@FindBy (xpath = "//input[@id='ap_email']")
	private WebElement email;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continue_email;
	
	@FindBy (xpath = "//input[@id='ap_password']")
	private WebElement password;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement continue_password;
	
	//=============================== LOG OUT ===============
//	@FindBy (xpath = "")
//	private WebElement accountlist;
	
	@FindBy (xpath = "//a[@id='nav-hamburger-menu']")
	private WebElement All;
	
	@FindBy (xpath = "//a[text()='Sign Out']")
	private WebElement All_signout;
	
	//============================SEARCH =============================
	
	@FindBy (xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchField;
	
	@FindBy (xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchbtn;	
	
	//============================ Rating===========================
	
	@FindBy (xpath ="((//div[@class='sg-col-inner'])[26]//span)[6]")
	private WebElement washingMachine;
	
	//--------------------------ADD TO CART ===================
	
	@FindBy (xpath ="(//span[@class='a-size-medium a-color-base a-text-normal'])[5]")
	private WebElement click_washingmachine;
	
	@FindBy (xpath ="//input[@id='add-to-cart-button']")
	private WebElement AddToCart;
	
	@FindBy (xpath ="//div[@id='attach-added-to-cart-message']//input")
	private WebElement anothere_AddToCart;
	
	//============================= CONSTRUCTOR ===================
	public Amazon_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
public void Click_account_list() {
		
	accountlist.click();
	}
	public void Put_email(String email1) {
			
		email.sendKeys( email1);
		}
	
	public void Click_email() {
		
		continue_email.click();
		}
	public void Put_password(String Pass) {
			
		password.sendKeys(Pass);
			}
	
	public void Click_password() {
		
		continue_password.click();
			}
	
	//==================================== log out methods==============
	
	public void Click_All() {
		All.click();
	}
	
	public void Click_All_signout() {
		All_signout.click();
	}
	
	//==================================search methods ============

	public void Click_searchField() {
		searchField.sendKeys("washing machine");
	}
	
	public void Click_searchbtn() {
		searchbtn.click();
	}
	
	//================================ RATING =======================
	
	public void get_washingMachine() {
		String rating = washingMachine.getText();
		System.out.println(rating);
		
	}
	
public void user_click_washingmachine(WebDriver driver) {
		
		click_washingmachine.click();
		ArrayList<String> array = new ArrayList<String>(driver.getWindowHandles());
		for(int i=0; i<array.size(); i++) {
			String url = array.get(1);
			driver.switchTo().window(url);
		}
		
		AddToCart.click();
		anothere_AddToCart.click();
		
	}
	
	
	
}
