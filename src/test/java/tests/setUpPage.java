package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class setUpPage {

public static WebDriver driver;
public UIMap datafile;
public String workingDir;

	
	@BeforeSuite
	
	public void Initialize() throws IOException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://covid.sit.health.jiolabs.com/vaccination"); 
		System.out.println("Done");

		
		//home.enterMobile(null, null)
	
	}
	
	@BeforeClass
	
	public void testBeforeMethod() {
		workingDir = System.getProperty("user.dir");
		datafile = new UIMap(workingDir + "/Configs/datafile.properties");
		
		
	}
	

	
	@AfterSuite
	
	public void TeardownTest() {
		setUpPage.driver.quit();
	}

}
