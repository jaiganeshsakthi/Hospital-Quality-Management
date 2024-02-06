package testScript;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class logtest extends BaseClass {
	
	@Test
	public void updatingWithoutModificationGroupSystemAndGroupSystemId() throws Throwable {
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
	    String actualsystemname = hgroup.getGroupsystemfield().getAttribute("ng-reflect-model");
	    String actualsystemid = hgroup.getGroupsystemidfield().getAttribute("ng-reflect-model");
	    
	    hgroup.getUpdatebtn().click();
	    String expectedsystemid = hgroup.getgroupsystemidfirstcolumn().getText();
	    String expectedsystemname = hgroup.getGroupsystemfirstcolumn().getText();
	  
	 if(actualsystemname.equals(expectedsystemname)&&actualsystemid.equals(expectedsystemid)) {
		 System.out.println("----same data present in the table----");
	 }
	 else {
		 System.out.println("----same data is not present in the table----");
	 }
	

}
}