package Pages;

import java.io.IOException;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import WebDriverFactory.WebDriverFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	////////////////WebElements///////////////////
	@FindBy(how = How.XPATH, using = "//div[@class='_2QfC02']/button")
	private WebElement btnCancelPopup;
	
	@FindBy(how = How.NAME, using = "q")
	private WebElement EdtBoxSearch;
	
	@FindBy(how = How.CLASS_NAME, using = "L0Z3Pu")
	private WebElement btnSearch;
	
	
	
	///////////////Resuables//////////////////////
	
	/**
	 * click Popup Cancel Button
	 * @author Mohan
	 */
	public void clickPopupCancelButton(WebDriver driver) {
		btnCancelPopup.click();
	}
	
	/**
	 * enter Search Text In Edit Box And Search
	 * @param driver
	 * @param searchText
	 * @author Mohan
	 */
	public void enterSearchTextInEditBoxAndSearch(WebDriver driver, String searchText) {
		EdtBoxSearch.sendKeys(searchText);
		btnSearch.click();
	}
	
	

}
