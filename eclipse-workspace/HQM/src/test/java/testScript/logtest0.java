package testScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtest0  extends BaseClass {
	@Test
	public void cancelGroupSystemAndGroupSystemIdData() throws Throwable {
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
		 String  systemname= elib.getDataFromExcel("Sheet1" , 4, 0)+jlib.generateRandomString();
		 hgroup.getGroupsystemidfield().sendKeys(systemid);
		 hgroup.getGroupsystemfield().sendKeys(systemname);
		 hgroup.getCancelbtn().click();
		 String groupid = hgroup.getGroupsystemidfield().getText();
		 String groupname=hgroup.getGroupsystemfield().getText();
		 
		 if(groupid.equals("")&&groupname.equals("")) {
			 System.out.println("----data is removed successfully");
		 }
		 else {
			 System.out.println("----data is not removed successfully");
		 }
	}

}
