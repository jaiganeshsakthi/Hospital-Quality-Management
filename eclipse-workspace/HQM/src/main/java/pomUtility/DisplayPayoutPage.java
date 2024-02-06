package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayPayoutPage {
	
	WebDriver driver;
	public DisplayPayoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()=' Display Payout ']")
	private WebElement displayPayoutlink;
	
	@FindBy(xpath ="//select[@name='year']")
	private WebElement programyeardrobdown;
	
	@FindBy(xpath ="//select[@name='hospital_id']")
	private WebElement hospitaldrobdown;
	
	@FindBy(xpath ="//select[@name='batchName']")
	private WebElement batchdrobdown;
	
	@FindBy(xpath ="//button[@class='btn btn-secondary']")
	private WebElement deletebtn;
	
	@FindBy(xpath ="//button[@class='btn btn-danger']")
	private WebElement popupdeletebtn;
	
	@FindBy(xpath ="//button[@class='btn btn-secondary']")
	private WebElement popupcancelbtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getDisplayPayoutlink() {
		return displayPayoutlink;
	}

	public WebElement getProgramyeardrobdown() {
		return programyeardrobdown;
	}

	public WebElement getHospitaldrobdown() {
		return hospitaldrobdown;
	}

	public WebElement getBatchdrobdown() {
		return batchdrobdown;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getPopupdeletebtn() {
		return popupdeletebtn;
	}

	public WebElement getPopupcancelbtn() {
		return popupcancelbtn;
	}
	
	


}
