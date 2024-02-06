package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeasureGroupsPage {
	

	WebDriver driver;
	public MeasureGroupsPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()=' Measure Groups ']")
   	private WebElement measuregroupslink;
	
	@FindBy(xpath ="//input[@placeholder='Enter Measure Group Name']")
   	private WebElement measuregroupfield;
	
	@FindBy(xpath ="//button[@class='btn btn-primary add_btn ']")
   	private WebElement addbtn;
   	
   	@FindBy(xpath ="//button[@class='btn btn-secondary ']")
   	private WebElement cancelbtn;
   	
   	
    @FindBy(xpath ="//button[@class='btn btn-sm btn-primary btn_edit']")
   	private WebElement editbtn;
   	
   	@FindBy(xpath ="//button[@class='btn btn-primary add_btn ']")
   	private WebElement updatebtn;
   	
   	@FindBy(xpath ="//label[@class='custom-control-label']")
   	private WebElement activeslide;
   	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMeasuregroupslink() {
		return measuregroupslink;
	}

	public WebElement getMeasuregroupfield() {
		return measuregroupfield;
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
