package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.FileUtility;

public class LoginPage {
	
	WebDriver driver;
	/*Rule-03: Create the constructor to initialize the all web elements while creation of an object*/
	 public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='email']")
    private WebElement emailEdit;
		
	@FindBy(name="apassword")
	private WebElement passwordEdit;
	
	@FindBy(xpath = "//button[text()='Submit']")
	 private WebElement submitbtn;
	
	@FindBy(xpath = "//div[@role='alert']")
	 private WebElement error;
	
	@FindBy(xpath = "//span[text()='Email is required!']")
	 private WebElement emailrequirederror;
	
	@FindBy(xpath = "//span[text()='Password is required!']")
	 private WebElement passwordrequirederror;
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmailEdit() {
		return emailEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getError() {
		return error;
	}

	public WebElement getEmailrequirederror() {
		return emailrequirederror;
	}

	public WebElement getPasswordrequirederror() {
		return passwordrequirederror;
	}

	public void loginToApp() throws Throwable
	{  FileUtility flib = new FileUtility();
	   String url = flib.getKeyValueFromProperty("url");
	   String email = flib.getKeyValueFromProperty("email");
	   String password = flib.getKeyValueFromProperty("password");
	   driver.get(url);
	   emailEdit.sendKeys(email);
	   passwordEdit.sendKeys(password);
	   submitbtn.click();
	}
	
	public void loginUnsuccessfullWithInvalidEmail() throws Throwable
	{  FileUtility flib = new FileUtility();
	   String url = flib.getKeyValueFromProperty("url");
	   String email = flib.getKeyValueFromProperty("invalidemail");
	   String password = flib.getKeyValueFromProperty("password");
	   driver.get(url);
	   emailEdit.sendKeys(email);
	   passwordEdit.sendKeys(password);
	   submitbtn.click();
	}
	
	public void loginUnsuccessfullWithInvalidPassword() throws Throwable
	{  FileUtility flib = new FileUtility();
	   String url = flib.getKeyValueFromProperty("url");
	   String email = flib.getKeyValueFromProperty("email");
	   String password = flib.getKeyValueFromProperty("invalidpassword");
	   driver.get(url);
	   emailEdit.sendKeys(email);
	   passwordEdit.sendKeys(password);
	   submitbtn.click();
	}
	
	public void loginUnsuccessfullWithInvalidCredentials() throws Throwable
	{  FileUtility flib = new FileUtility();
	   String url = flib.getKeyValueFromProperty("url");
	   String email = flib.getKeyValueFromProperty("invalidemail");
	   String password = flib.getKeyValueFromProperty("invalidpassword");
	   driver.get(url);
	   emailEdit.sendKeys(email);
	   passwordEdit.sendKeys(password);
	   submitbtn.click();
	}
	
	public void loginUnsuccessfullWithBlankCredentials() throws Throwable
	{  FileUtility flib = new FileUtility();
	   String url = flib.getKeyValueFromProperty("url");
	   String email = flib.getKeyValueFromProperty("blankemail");
	   String password = flib.getKeyValueFromProperty("blankpassword");
	   driver.get(url);
	   emailEdit.sendKeys(email);
	   passwordEdit.sendKeys(password);
	   submitbtn.click();
	}

	

	
	

}
