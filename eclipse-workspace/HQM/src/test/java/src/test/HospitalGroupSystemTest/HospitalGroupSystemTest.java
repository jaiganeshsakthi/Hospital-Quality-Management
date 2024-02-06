package src.test.HospitalGroupSystemTest;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.JavaUtility;
import GenericUtility.WebDriverUtility;
import pomUtility.HomePage;
import pomUtility.HospitalGroupSystemPage;
import pomUtility.LoginPage;

public class HospitalGroupSystemTest extends BaseClass{
	
	

	@Test
	public void loginWithBlankEmailidAndPassword() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp();
		System.out.println("------login is successfull------");
		HomePage hp=new HomePage(driver);
		hp.getSupersetslink().click();
		WebDriverUtility wlip=new WebDriverUtility();
		 wlip.waitUntilPageLoad(driver);
		HospitalGroupSystemPage hgroup=new HospitalGroupSystemPage(driver);
		hgroup.getHospitalgroupsystemlink().click();
		String systemid = elib.getDataFromExcel("Sheet1" , 3, 0)+jlib.getRandomNum();
		String  systemname= elib.getDataFromExcel("Sheet1" , 4, 0)+jlib.generateRandomString();
		System.out.println(systemid);
		System.out.println(systemname);
	   hgroup.getGroupsystemidfield().sendKeys(systemid);
	   hgroup.getGroupsystemfield().sendKeys(systemname);
	   hgroup.getAddbtn().click();
	  wlip.waitUntilPageLoad(driver);
	 WebElement s = hgroup.getsuccessmessage();
	 wlib.waitUntilElementLoad(driver,s);
	 String hospitalsmessage = elib.getDataFromExcel("Sheet1" , 9, 0);
	 String succesmessage = hgroup.getsuccessmessage().getText(); 
	 if(succesmessage.equals(hospitalsmessage)) {
		 System.out.println("hospital group creaated succesfully");
	 }
	 else {
		 System.out.println("hospital group  not creaated succesfully");
	 }
	 hgroup.getSystemId(systemid);
	 hgroup.getSystemName(systemname);
			    }
	
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
			System.out.println("----Groupsystemid and Groupsystem is  present ----");
		}
		else {
			System.out.println("----Groupsystemid and Groupsystem is not present----");
		}
		
		String  systemname= elib.getDataFromExcel("Sheet1" , 4, 0)+jlib.generateRandomString();
		hgroup.getGroupsystemfield().sendKeys(systemname);
		 hgroup.getAddbtn().click();
		String groupsystemerror = hgroup.getGroupsystemiderror().getText();
		String systemidmessagee = elib.getDataFromExcel("Sheet1" , 5, 0);
         if(groupsystemerror.equalsIgnoreCase(systemidmessagee)) {
	    	
	    	System.out.println("------user is not able to add groupsystemid with blank groupsystemid -------");
	    }
	    else {
	    	System.out.println("--------user is  able to add groupsystemid  -------");
	    }		
	}
	
	
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
		String groupsystemmessagee = elib.getDataFromExcel("Sheet1" , 6, 0);
         if(groupsystemerror.equalsIgnoreCase(groupsystemmessagee)) {
	    	
	    	System.out.println("------user is not able to add groupsystem with blank groupsystem -------");
	    }
	    else {
	    	System.out.println("--------user is  able to add groupsystem  -------");
	    }		
		}
	
	
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
	 
	
	 
	
	 


		
                             
                           
	


