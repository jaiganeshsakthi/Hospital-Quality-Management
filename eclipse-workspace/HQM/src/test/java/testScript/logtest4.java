package testScript;

import org.testng.annotations.Test;
import java.util.Random;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtest4 extends BaseClass {
	
	@Test
	
 public void  verifyingGroupSystemFields () throws Throwable {
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp();
		System.out.println("------login is successfull------");
		HomePage hp=new HomePage(driver);
		hp.getSupersetslink().click();
		WebDriverUtility wlip=new WebDriverUtility();
		 wlip.waitUntilPageLoad(driver);
		HospitalGroupSystemPage hgroup=new HospitalGroupSystemPage(driver);
		hgroup.getHospitalgroupsystemlink().click();
		boolean groupsystemid = hgroup.getGroupsystemidfield().isDisplayed();
		boolean groupsystem = hgroup.getGroupsystemfield().isDisplayed();
		if(groupsystemid==true&&groupsystem==true) {
			System.out.println("----Groupsystemid and Groupsystem is  dispalyed----");
		}
		else {
			System.out.println("----Groupsystemid and Groupsystem is not dispalyed----");
		}
		        
		    }
		

	}

