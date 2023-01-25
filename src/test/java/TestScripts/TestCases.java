package TestScripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.ProductDisplayPage;
import WebDriverFactory.WebDriverFactory;

public class TestCases {
	WebDriver driver;
	WebDriverFactory webDriverFactory = new WebDriverFactory();
	
	@AfterMethod
	public void quit() {
//		driver.quit();
	}
	
	@BeforeMethod
	public void beforeMethodImplementation() throws IOException {
	    driver=webDriverFactory.driverInitialization();
		driver.get("https://www.flipkart.com");
	}
	
	@Test()
	public void EndToEndFlow() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		HomePage homePage= new HomePage(driver);
		homePage.clickPopupCancelButton(driver);
		homePage.enterSearchTextInEditBoxAndSearch(driver, "Iphone 13 128GB");
		ProductDisplayPage productDisplayPage  = new ProductDisplayPage(driver);
		productDisplayPage.clickChechBoxFlipcartAssured(driver);
		/*productDisplayPage.clickButtonInternalStorage(driver);*/
	}
	
	
	

}
