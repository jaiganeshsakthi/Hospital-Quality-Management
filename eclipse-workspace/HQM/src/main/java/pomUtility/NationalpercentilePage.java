package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NationalpercentilePage {
	
	WebDriver driver;
	public NationalpercentilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()=' National Percentile ']")
   	private WebElement nationalpercentilelink;
	
	@FindBy(xpath ="//select[@name='year']")
   	private WebElement programyeardrobdown;
	
	@FindBy(xpath ="(//select[@class='form-control ng-valid ng-dirty ng-touched'])[2]")
   	private WebElement measuregroupdrobdown;
	
	@FindBy(xpath ="//select[@name='measure_ID']")
   	private WebElement measureiddrobdown;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getNationalpercentilelink() {
		return nationalpercentilelink;
	}

	public WebElement getProgramyeardrobdown() {
		return programyeardrobdown;
	}

	public WebElement getMeasuregroupdrobdown() {
		return measuregroupdrobdown;
	}

	public WebElement getMeasureiddrobdown() {
		return measureiddrobdown;
	}
	
	

}
