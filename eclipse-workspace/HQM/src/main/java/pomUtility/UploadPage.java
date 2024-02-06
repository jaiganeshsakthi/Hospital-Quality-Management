package pomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {
	
	WebDriver driver;
	public UploadPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//p[text()=' Upload ']")
    private WebElement uploadlink;
	
	@FindBy(xpath ="//select[@name='year']")
    private WebElement programfinalyearscoredrobdown;
	
	@FindBy(xpath ="//select[@name='file_type']")
    private WebElement filecategorydrobdown;
	
	@FindBy(xpath ="//input[@type='file']")
    private WebElement file;
	
	@FindBy(xpath ="(//button[@type='button'])[2]")
    private WebElement uploadbutton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUploadlink() {
		return uploadlink;
	}

	public WebElement getProgramfinalyearscoredrobdown() {
		return programfinalyearscoredrobdown;
	}

	public WebElement getFilecategorydrobdown() {
		return filecategorydrobdown;
	}

	public WebElement getFile() {
		return file;
	}

	public WebElement getUploadbutton() {
		return uploadbutton;
	}
	
	

}
