package src.test.LoginTest;

import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import pomUtility.LoginPage;

public class LoginScenario extends BaseClass {
	
	@Test
	public void loginTest() throws Throwable {
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp();
		System.out.println("------login is successfull------");
	}
	
	@Test
	public void loginWithInvalidEmail() throws Throwable {
		
				           
		LoginPage lip=new LoginPage(driver);
		lip.loginUnsuccessfullWithInvalidEmail();
		String errormessage = lip.getError().getText();
		String message = elib.getDataFromExcel("Sheet1" , 0, 0);
		if(errormessage.equals(message)) {
	    	
	    	System.out.println("------login is unsuccessfull-------");
	    }
	    else {
	    	System.out.println("--------login is successfull-------");
	    }
		}
	


    @Test
    public void loginWithInvalidPassword() throws Throwable {
	
	LoginPage lip=new LoginPage(driver);
	lip.loginUnsuccessfullWithInvalidPassword();
	String errormessage = lip.getError().getText();
	String message = elib.getDataFromExcel("Sheet1" , 0, 0);
	if(errormessage.equals(message)) {
    	
    	System.out.println("------login is unsuccessfull-------");
    }
    else {
    	System.out.println("--------login is successfull-------");
    }
	}

    @Test
	public void loginWithInvalidEmailiAndInvalidPassword() throws Throwable {
		
	LoginPage lip=new LoginPage(driver);
	lip.loginUnsuccessfullWithInvalidCredentials();
	String errormessage = lip.getError().getText();
	String message = elib.getDataFromExcel("Sheet1" , 0, 0);
	if(errormessage.equals(message)) {
	    	
	   	System.out.println("------login is unsuccessfull-------");
	 }
	 else {
	    	System.out.println("--------login is successfull-------");
	 }
    }
    
    @Test
	public void loginWithBlankEmailidAndPassword() throws Throwable {
		
		LoginPage lip=new LoginPage(driver);
		lip.loginUnsuccessfullWithBlankCredentials();
		String emailerrormessage = lip.getEmailrequirederror().getText();
		String passworderrormessage = lip.getPasswordrequirederror().getText();
		String emailmessage = elib.getDataFromExcel("Sheet1" , 1, 0);
		String passwordmessagee = elib.getDataFromExcel("Sheet1" , 2, 0);
		if(emailerrormessage.equalsIgnoreCase(emailmessage)&& passworderrormessage.equalsIgnoreCase(passwordmessagee)) {
	    	
	    	System.out.println("------login is unsuccessfull-------");
	    }
	    else {
	    	System.out.println("--------login is successfull-------");
	    }

	}
}
