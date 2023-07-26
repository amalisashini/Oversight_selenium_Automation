package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.AddBillingSpace;
import pageobjects.LoginPage;
import resources.Base;


public class AddBillingSpaceTest extends Base{
  
   WebDriver driver;    

    //  @BeforeMethod
	// public void openApplication() throws IOException {
		
	// 	driver = initializeDriver();
	// 	driver.get(prop.getProperty("consumerurl"));
		
	// }

    @Test(dataProvider="giveLoginData")
	public void login(String email, String password) throws IOException, InterruptedException {

        driver = initializeDriver();
		driver.get(prop.getProperty("consumerurl"));
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailAddressTextField().sendKeys(email);
		loginPage.passwordField().sendKeys(password);
		loginPage.loginButton().click();

         AddBillingSpace billSpace = new AddBillingSpace(driver);
		// billSpace.deviceBtn().click();
        // billSpace.createBillingSpaceBtn().click();

           
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(billSpace.deviceBtn()));
        billSpace.deviceBtn().click();

        
        wait.until(ExpectedConditions.visibilityOf(billSpace.createBillingSpaceBtn()));
        billSpace.createBillingSpaceBtn().click();
		
	}
    
    // @Test
    // public void AddBillingSpace() throws IOException, InterruptedException{

    //     AddBillingSpace billSpace = new AddBillingSpace(driver);
	// 	billSpace.deviceBtn().click();
    //     billSpace.createBillingSpaceBtn().click();

    // }

    // @Test
    // public void AddBillingSpace() throws IOException, InterruptedException{

    //     AddBillingSpace billSpace = new AddBillingSpace(driver);

    //     // Wait for the "Device" button to be visible before clicking it
    //     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    //     wait.until(ExpectedConditions.visibilityOf(billSpace.deviceBtn()));
    //     billSpace.deviceBtn().click();

    //     // Wait for the "Create Billing Space" button to be visible before clicking it
    //     wait.until(ExpectedConditions.visibilityOf(billSpace.createBillingSpaceBtn()));
    //     billSpace.createBillingSpaceBtn().click();

    // }

    @DataProvider
	public Object[][] giveLoginData() {
		
		Object[][] data = {{"oversight_user", "welCome1/"}};
		
		return data;
		
	}
    
}
