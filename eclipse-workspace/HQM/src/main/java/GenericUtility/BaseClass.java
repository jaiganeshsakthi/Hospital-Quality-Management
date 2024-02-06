package GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import pomUtility.HomePage;
import pomUtility.LoginPage;



public class BaseClass 
{
	public WebDriver driver=null;
	public static WebDriver sdriver=null;
	public WebDriverUtility wlib=new WebDriverUtility();
	public FileUtility flib=new FileUtility();
	public ExcelUtility elib=new ExcelUtility();
	public JavaUtility jlib=new JavaUtility();
	public int rannum = JavaUtility.getRandomNum();
	
	
	
	
	
	@BeforeClass
	public void bcConfig() throws Throwable
	{
		
		
		/*while parallel execution we need to comment all these steps*/
		String browser  = flib.getKeyValueFromProperty("browser");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		wlib.waitUntilPageLoad(driver);
		System.out.println("------browser is launched------");
		sdriver=driver;
	}
	
	
	
		
	@AfterClass
	public void acConfig()
	{
		driver.quit();
		System.out.println("------browser is closed------");
	}
	

	
	
	
}
