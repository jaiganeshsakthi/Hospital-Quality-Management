package testScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtest3 extends BaseClass {
	
	@Test
	public void groupSystemidBlank() throws Throwable {
		
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
		
		String  systemname= elib.getDataFromExcel("Sheet1" , 4, 0)+jlib.generateRandomString();
		hgroup.getGroupsystemfield().sendKeys(systemname);
		 hgroup.getAddbtn().click();
		String groupsystemerror = hgroup.getGroupsystemiderror().getText();
		System.out.println(groupsystemerror);
		String systemidmessagee = elib.getDataFromExcel("Sheet1" , 5, 0);
         if(groupsystemerror.equalsIgnoreCase(systemidmessagee)) {
	    	
	    	System.out.println("------user is not able to add groupsystemid with blank groupsystemid -------");
	    }
	    else {
	    	System.out.println("--------user is  able to add groupsystemid  -------");
	    }		
	}

}
