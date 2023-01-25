package WebDriverFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
	public static WebDriver driver; 
	
	public WebDriver driverInitialization() throws IOException {
		
		FileInputStream sourceConfigFile = new FileInputStream("C:\\Users\\Admin\\OneDrive\\Desktop\\CommertialProject\\src\\test\\java\\Utilities\\config.properties");
		Properties configurations = new Properties();
		configurations.load(sourceConfigFile);
		String browserName = (String)configurations.get("browser");
		
		if(browserName.toLowerCase().equals("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
            
		}else if(browserName.toLowerCase().equals("edge")) {
			WebDriverManager.edgedriver().setup();
		   driver = new EdgeDriver();
		}else {
			System.out.println("The specified browser is not configured, by default chrome has been invoked");
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		
		return driver;
	}
}
