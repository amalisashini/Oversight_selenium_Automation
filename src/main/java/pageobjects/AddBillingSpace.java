package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddBillingSpace {
     WebDriver driver;
	
	public AddBillingSpace(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(xpath="//div[@class='p-1']//span[contains(text(),'Devices')][1]")
	WebElement deviceBtn;
	
	@FindBy(xpath="//div[contains(text(),'Create Billing Space')]")
	WebElement createBillingSpaceBtn;
	
	public WebElement deviceBtn() {
		
		return deviceBtn;
		
	}
	
	public WebElement createBillingSpaceBtn() {
		
		return createBillingSpaceBtn;
		
	}
		
}
