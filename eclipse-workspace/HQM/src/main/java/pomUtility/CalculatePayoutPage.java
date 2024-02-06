package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatePayoutPage {
	
	WebDriver driver;
	public CalculatePayoutPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//p[text()=' Calculate Payout ']")
	private WebElement CalculatePayoutlink;
	
	@FindBy(xpath ="//i[@class='float-right fa fa-plus-circle']")
	private WebElement addbtn;
	
	@FindBy(xpath ="//i[@class='cancelBatch float-right fa fa-times-circle']")
	private WebElement cancelbtn;
	
	@FindBy(xpath ="//select[@name='year']")
	private WebElement programyeardrobdown;
	
	@FindBy(xpath ="//select[@name='hospital_id']")
	private WebElement hospitaldrobdown;
	
	@FindBy(xpath ="//select[@name='measure_group_id']")
	private WebElement measuregroupdrobdown;
	
	@FindBy(xpath ="//input[@name='allocation'")
	private WebElement allocationfield;
	
	@FindBy(xpath ="//button[@class='form-control  btn-sm edit btn btn-primary btn_edit']")
	private WebElement editbtn;
	
	@FindBy(xpath ="//button[@class='form-control  btn-sm edit btn btn-primary btn_delete']")
	private WebElement tablecancelbtn;
	
	@FindBy(xpath ="//button[@class='form-control  btn-sm edit btn btn-success btn_edit']")
	private WebElement updatebtn;
	
	

}
