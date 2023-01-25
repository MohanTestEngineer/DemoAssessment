package Pages;

import javax.imageio.plugins.tiff.BaselineTIFFTagSet;
import javax.swing.JSeparator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplayPage {
WebDriver driver;
	public ProductDisplayPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	///////////WebElements///////////////////
	
	@FindBy(how = How.XPATH, using = "//div[@class='_1KOcBL']//section[@class='_2hbLCH _24gLJx']/label/input")
	private WebElement chkBoxFlipkartAssured ;
	
	//////////Reusables//////////////////////
	
	
	/**
	 * click Chech Box Flipcart Assured
	 * @param driver
	 */
	public void clickChechBoxFlipcartAssured(WebDriver driver) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", chkBoxFlipkartAssured);
	}
	

	@FindBy(how = How.XPATH, using = "//div[text()='Internal Storage']")
	private WebElement btninternalStorage ;
	
	
	/*public void clickButtonInternalStorage(WebDriver driver) {
		JavascriptExecutor jes = (JavascriptExecutor)driver;
		jes.executeScript("arguments[0].click();",btninternalStorage);
		
	
		
	}*/
	
		
	}

