package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
    WebDriver driver;
	
    public Profile(WebDriver driver){
    	
    	this.driver = driver;
    	
    	PageFactory.initElements(driver,this);
    	    	
    }
    
    @FindBy(xpath="//div[@class='text-dark-2 font-weight-600']")
    WebElement profileName;
    
    public WebElement profileName() {
    	
    	return profileName;
    	
    }
}
