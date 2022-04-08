package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class myVaccinationPage {
	

	WebDriver driver;
	
	public myVaccinationPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickOnMyVaccination(By clickMyVaccination) {
		driver.findElement(clickMyVaccination).click();

	}
	
	public void clickOnDose1(By clickOnDose1) {
		driver.findElement(clickOnDose1).click();

	}
	
	public void clickOnDose2(By clickOnDose2) {
		driver.findElement(clickOnDose2).click();

	}
	
	public void verifyVaccinationmessage(By verifyVaccinationMessage) {
		String profileName = driver.findElement(verifyVaccinationMessage).getText();
		System.out.println(profileName);

	}
	
	public void verifyFirstQuestion(By verifyFirstQuestion) {
		String firstQuestion = driver.findElement(verifyFirstQuestion).getText();
		System.out.println(firstQuestion);

	}

}
