package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class manageIdentityPage {

	WebDriver driver;
	
	public manageIdentityPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	
	public void clickManageIdentity(By clickManageIdentity) {
		driver.findElement(clickManageIdentity).click();

	}
	public void clickInfoPopup(By clickInfoPopUp) {
		driver.findElement(clickInfoPopUp).click();
	}
	public void clickLinkNewId(By clickNewIdentity) {
		driver.findElement(clickNewIdentity).click();
	}
	
	public void clickOnCorporate(By clickOnCorporate) {
		driver.findElement(clickOnCorporate).click();
	
	}
	
}

