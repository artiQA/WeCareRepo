package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	

	
	public void enterMobile(By enterMobileNumberField, By clickGetOtp, String MobNo ) {
		driver.findElement(enterMobileNumberField).sendKeys(MobNo); 
		driver.findElement(clickGetOtp).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.wait();
	}
	
	public void enterOTP(By enterOTP, By clickDoneButton, String otp) {
		driver.findElement(enterOTP).sendKeys(otp);
		driver.findElement(clickDoneButton).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void enterMpin(By enterMpin, By clickOnProceed, String mpin) {
		
		driver.findElement(enterMpin).sendKeys(mpin);
		driver.findElement(clickOnProceed).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void selProfile(By selectRootUser) {
		driver.findElement(selectRootUser).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public void clickOnProfile(By clickProfile) {
		driver.findElement(clickProfile).click();
	}

}
