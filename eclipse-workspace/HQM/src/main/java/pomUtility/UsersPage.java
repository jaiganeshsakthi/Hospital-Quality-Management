package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	WebDriver driver;
	public UsersPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//p[text()='Users']")
    private WebElement userslink;
		
	@FindBy(xpath ="//input[@placeholder='First Name']")
	private WebElement firstnamefileld;
	
	@FindBy(xpath ="//input[@placeholder='Last Name']")
	private WebElement lastnamefileld;
	
	@FindBy(xpath ="//input[@placeholder='Email ']")
	private WebElement emailfileld;
	
	@FindBy(xpath ="//select[@formcontrolname='Role']")
	private WebElement rolefileld;
	

	@FindBy(xpath ="//button[@class='btn btn-primary add_btn']")
	private WebElement addbtn;
	
	@FindBy(xpath ="//button[@class='btn btn-secondary ']")
	private WebElement cancelbtn;
	
	@FindBy(xpath ="//button[@class='btn btn-sm btn-primary btn_edit']")
	private WebElement editbtn;
	
	@FindBy(xpath ="//button[@class='btn btn-primary add_btn']")
	private WebElement updatebtn;
	
	@FindBy(xpath ="//label[@class='custom-control-label']")
	private WebElement activeslide;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUserslink() {
		return userslink;
	}

	public WebElement getFirstnamefileld() {
		return firstnamefileld;
	}

	public WebElement getLastnamefileld() {
		return lastnamefileld;
	}

	public WebElement getEmailfileld() {
		return emailfileld;
	}

	public WebElement getRolefileld() {
		return rolefileld;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

	public WebElement getUpdatebtn() {
		return updatebtn;
	}

	public WebElement getActiveslide() {
		return activeslide;
	}
	
	

}
