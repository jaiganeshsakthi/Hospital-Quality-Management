package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HospitalPage {
	
	WebDriver driver;
	public HospitalPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//p[text()=' Hospital ']")
	private WebElement hospitallink;
	
	@FindBy(xpath ="//select[@formcontrolname='Group_Name']")
	private WebElement measuregroupfield;
	
	@FindBy(xpath ="//input[@placeholder='Hospital ID']")
	private WebElement hospitalidfield;
	
	@FindBy(xpath ="//input[@placeholder='Hospital Name']")
	private WebElement hospitalnamefield;
	
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

	public WebElement getHospitallink() {
		return hospitallink;
	}

	public WebElement getMeasuregroupfield() {
		return measuregroupfield;
	}

	public WebElement getHospitalidfield() {
		return hospitalidfield;
	}

	public WebElement getHospitalnamefield() {
		return hospitalnamefield;
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
