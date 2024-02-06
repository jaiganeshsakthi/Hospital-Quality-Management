package testScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtest2 extends BaseClass {
	
	@Test
	public void groupSystemBlank() throws Throwable {
		
				           
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
			System.out.println("----Groupsystemid and Groupsystem is  present----");
		}
		else {
			System.out.println("----Groupsystemid and Groupsystem is not present----");
		}
		
		String systemid = elib.getDataFromExcel("Sheet1" , 3, 0)+jlib.getRandomNum();
		hgroup.getGroupsystemidfield().sendKeys(systemid);
		 hgroup.getAddbtn().click();
		String groupsystemerror = hgroup.getGroupsystemerror().getText();
		System.out.println(groupsystemerror);
		String groupsystemmessagee = elib.getDataFromExcel("Sheet1" , 6, 0);
         if(groupsystemerror.equalsIgnoreCase(groupsystemmessagee)) {
	    	
	    	System.out.println("------user is not able to add groupsystem with blank groupsystem -------");
	    }
	    else {
	    	System.out.println("--------user is  able to add groupsystem  -------");
	    }		
		
		
	}

}
