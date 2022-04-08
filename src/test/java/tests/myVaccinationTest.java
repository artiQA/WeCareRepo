package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.myVaccinationPage;

public class myVaccinationTest extends setUpPage {
	
	public UIMap uimap;
	myVaccinationPage vaccine;

	
	@Test(priority = 0)
	
	public void ClickMyVaccination() throws Exception {
		
		vaccine.clickOnMyVaccination(uimap.getLocator("clickMyVaccination"));
	
	}
	
	@Test(priority = 1)
	public void clickDose1() throws Exception {
		vaccine.clickOnDose1(uimap.getLocator("clickOnDose1"));
		
	}
	
	@Test(priority = 2)
	
	public void verifyVaccinationMessage() throws Exception {
		vaccine.verifyVaccinationmessage(uimap.getLocator("profileName"));
	}
	
	@Test(priority = 3)
	
	public void verifyFirstQuestion() throws Exception {
		vaccine.verifyFirstQuestion(uimap.getLocator("dose1Question"));
	}
	
	
	@BeforeMethod
	public void beforeMethod() {
		vaccine = new myVaccinationPage(driver);
		uimap = new UIMap(workingDir + "/Configs/locators.properties");
		
	}

}
