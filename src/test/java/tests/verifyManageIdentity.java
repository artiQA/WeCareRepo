package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import pages.manageIdentityPage;


public class verifyManageIdentity extends setUpPage{
	public UIMap uimap;
	
@Test
	
	public void manageIdentity() throws Exception {

	uimap = new UIMap(workingDir + "/Configs/locators.properties");
		manageIdentityPage link = new manageIdentityPage(driver);
		
		link.clickManageIdentity(uimap.getLocator("clickManageIdentity"));
		link.clickInfoPopup(uimap.getLocator("clickInfoPopUp"));
		link.clickLinkNewId(uimap.getLocator("clickLinkNewIdentity"));
		//link.clickOnCorporate();
		
		
	}
	

}
