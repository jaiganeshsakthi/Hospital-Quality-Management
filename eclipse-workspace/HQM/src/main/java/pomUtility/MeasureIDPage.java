package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MeasureIDPage {
	
	WebDriver driver;
	public MeasureIDPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()=' Measure ID ']")
   	private WebElement measureIDlink;
	
	@FindBy(xpath ="//select[@formcontrolname='Measure_Group_List_ID']")
   	private WebElement measuregroupdropdown;
	
	@FindBy(xpath ="//input[@placeholder='Measure ID']")
   	private WebElement measureidfield;
	
	@FindBy(xpath ="//input[@placeholder='Measure Name']")
   	private WebElement measurenamefield;
	
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

	public WebElement getMeasureIDlink() {
		return measureIDlink;
	}

	public WebElement getMeasuregroupfield() {
		return measuregroupdropdown;
	}

	public WebElement getMeasureidfield() {
		return measureidfield;
	}

	public WebElement getMeasurenamefield() {
		return measurenamefield;
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
