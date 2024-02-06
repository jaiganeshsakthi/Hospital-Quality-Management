package testScript;

import org.openqa.selenium.StaleElementReferenceException;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtes extends BaseClass {
	@Test
	public void pagination() throws Throwable {
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp();
		System.out.println("------login is successfull------");
		HomePage hp=new HomePage(driver);
		hp.getSupersetslink().click();
		WebDriverUtility wlip=new WebDriverUtility();
		wlip.waitUntilPageLoad(driver);
		HospitalGroupSystemPage hgroup=new HospitalGroupSystemPage(driver);
		hgroup.getHospitalgroupsystemlink().click();
		hgroup.getNextbtn().click();
		wlip.waitUntilPageLoad(driver);
		try {
			hgroup.getPreviousbtn().click();
		}
		catch(StaleElementReferenceException ri) {
		hgroup.getPreviousbtn().click();
		}
		try {
		hgroup.getLastbtn().click();
		}
		catch(StaleElementReferenceException we) {
			hgroup.getLastbtn().click();
		}
		try {
		hgroup.getFirstbtn().click();
		}
		catch(StaleElementReferenceException we) {
			hgroup.getFirstbtn().click();
			
		}
		System.out.println("----All pagination button is accessed---- ");
	}

}
