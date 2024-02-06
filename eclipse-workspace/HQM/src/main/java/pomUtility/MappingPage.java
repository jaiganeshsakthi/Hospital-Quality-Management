package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MappingPage {
	
	WebDriver driver;
	public MappingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()=' Mapping ']")
   	private WebElement mappinglink;
	
	@FindBy(xpath ="//select[@formcontrolname='Facility_List_ID']")
   	private WebElement hospitalnamedropdown;
	
	@FindBy(xpath ="//select[@formcontrolname='Year']")
   	private WebElement programyeardropdown;
	
	@FindBy(xpath ="//select[@formcontrolname='Measure_Group_List_ID'")
   	private WebElement measuregroupdropdown;
	
	@FindBy(xpath ="//button[@class='btn btn-primary add_btn']")
   	private WebElement addbtn;
   	
   	@FindBy(xpath ="//button[@class='btn btn-secondary ']")
   	private WebElement cancelbtn;
   	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMappinglink() {
		return mappinglink;
	}

	public WebElement getHospitalnamedropdown() {
		return hospitalnamedropdown;
	}

	public WebElement getProgramyeardropdown() {
		return programyeardropdown;
	}

	public WebElement getMeasuregroupdropdown() {
		return measuregroupdropdown;
	}

	public WebElement getAddbtn() {
		return addbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
   	
   	

}
