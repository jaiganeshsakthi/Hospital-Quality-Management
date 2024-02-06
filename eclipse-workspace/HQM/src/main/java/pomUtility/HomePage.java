package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="userDropdown")
	private WebElement userDropdownlink;
	
	

	@FindBy(xpath ="//a[text()='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath ="//p[text()='Administration']")
	private WebElement administrationlink;
	
	@FindBy(xpath ="//p[text()='Supersets']")
	private WebElement supersetslink;
	
	@FindBy(xpath ="//p[text()='Payout']")
	private WebElement Payoutlink;

	
	public WebDriver getDriver() {
		return driver;
	}


	public WebElement getUserDropdownlink() {
		return userDropdownlink;
	}


	public WebElement getLogoutbtn() {
		return logoutbtn;
	}


	public WebElement getAdministrationlink() {
		return administrationlink;
	}


	public WebElement getSupersetslink() {
		return supersetslink;
	}


	public WebElement getPayoutlink() {
		return Payoutlink;
	}


	public void logout() {
		userDropdownlink.click();
		logoutbtn.click();
		
	}
}
