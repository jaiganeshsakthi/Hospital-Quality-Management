package testScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtest1 extends BaseClass {
	@Test
	public void updatingGroupSystemAndGroupSystemId() throws Throwable {
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
		hgroup.getEditbtn().click();
	 hgroup.getGroupsystemfield().click();
	 JavaUtility jlip=new JavaUtility();
	 ExcelUtility elip=new ExcelUtility();
	 String  systemname= elip.getDataFromExcel("Sheet1" , 7, 0)+jlip.generateRandomString();
	 hgroup.getGroupsystemfield().sendKeys(systemname);
	 hgroup.getUpdatebtn().click();
	 String  message= elip.getDataFromExcel("Sheet1" , 8, 0);
	 String updatemessage = hgroup.getUpdatedsuccessmessage().getText();
	 if(updatemessage.equals(message)) {
		 System.out.println("----updated succesfully----");
	 }
	 else {
		 System.out.println("----updated is not succesfull");
	 }
	 
	}

}
