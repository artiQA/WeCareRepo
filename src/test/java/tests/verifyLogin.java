package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.loginPage;


public class verifyLogin extends setUpPage{
	public UIMap uimap;
	loginPage login;
	
	
@Test(priority = 0)
	
	public void verifyLoginOne() throws Exception {
		
	
	
		//WebElement mobile = driver.findElement(obj.getLocator("loginMoileNumberField"));
		
		login.enterMobile(uimap.getLocator("loginMobileNumberField"),uimap.getLocator("loginGetOTP"),datafile.getData("mobileNumber"));
		
	}
@Test(priority = 1)

	public void enterOTP() throws Exception {
		login.enterOTP(uimap.getLocator("loginEnterOTP"),uimap.getLocator("loginDoneButton"),datafile.getData("otp"));
		
	}
@Test(priority = 2)
	
	public void enterMpin() throws Exception {
		login.enterMpin(uimap.getLocator("loginEnterMpin"),uimap.getLocator("loginProceedButton"),datafile.getData("mpin"));
		
	}
	
@Test(priority = 3)
	public void selProfile() throws Exception {
		login.selProfile(uimap.getLocator("selectRootUser"));
		
	}

@Test(priority = 4)
	
	public void clickProfile() throws Exception {
		login.clickOnProfile(uimap.getLocator("clickOnProfile"));
		
	}

@BeforeMethod
	public void beforeMethod() {
	uimap = new UIMap(workingDir + "/Configs/locators.properties");
	login = new loginPage(driver);
	
	
}


}
