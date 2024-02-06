package pomUtility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.WebDriverUtility;

public class HospitalGroupSystemPage {
	
		WebDriver driver;
		WebDriverUtility wlib=new WebDriverUtility();
		public HospitalGroupSystemPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		
		
		
    @FindBy(xpath ="//p[text()=' Hospital Group System ']")
	private WebElement hospitalgroupsystemlink;
       
    @FindBy(xpath ="//input[@placeholder='Group System ID']")
	private WebElement groupsystemidfield;
       
    @FindBy(xpath ="//input[@placeholder='Group System']")
	private WebElement groupsystemfield;
       
    @FindBy(xpath ="//button[@class='btn btn-primary add_btn']")
   	private WebElement addbtn;
   	
   	@FindBy(xpath ="//button[@class='btn btn-secondary']")
   	private WebElement cancelbtn;
   	
   	
    @FindBy(xpath ="//button[@class='btn btn-sm btn-primary btn_edit']")
   	private WebElement editbtn;
   	
   	@FindBy(xpath ="//button[@class='btn btn-primary add_btn']")
   	private WebElement updatebtn;
   	
   	@FindBy(xpath ="//label[@class='custom-control-label']")
   	private WebElement activeslide;
   	
   	@FindBy(xpath ="/html/body/app-root/sb-add-group-system/sb-layout-dashboard/span/div/div[2]/main/div/sb-card/div/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[1]")
   	private WebElement groupsystemidfirstcolumn;
   	
   	@FindBy(xpath ="/html/body/app-root/sb-add-group-system/sb-layout-dashboard/span/div/div[2]/main/div/sb-card/div/div[2]/div[2]/div[4]/div[2]/table/tbody/tr[1]/td[2]")
   	private WebElement groupsystemfirstcolumn;
   	
   	@FindBy(xpath ="//select[@aria-controls='DataTables_Table_0']")
   	private WebElement paginationdrobdown;
   	
   	@FindBy(xpath ="//div[@role='alert']")
   	private WebElement successmessage;
   	
   	@FindBy(xpath ="//span[text()='Group System ID is Required']")
   	private WebElement groupsystemiderror;

   	@FindBy(xpath ="//span[text()='Group System Name is Required']")
   	private WebElement groupsystemerror;

   	@FindBy(xpath ="//div[@class='alert alert-success alert-dismissible fade show']")
   	private WebElement updatedsuccessmessage;
   	
   	@FindBy(xpath ="//a[text()='Previous']")
   	private WebElement previousbtn;
   	
   	@FindBy(xpath ="//a[text()='Next']")
   	private WebElement nextbtn;
   	
   	@FindBy(xpath ="//a[text()='First']")
   	private WebElement firstbtn;
   	
   	@FindBy(xpath ="//a[text()='Last']")
   	private WebElement lastbtn;

   	@FindBy(xpath ="//*[@id='DataTables_Table_8_paginate']/span/a[4]")
   	private WebElement sixthpagination;
   	
	

	

	

public WebDriver getDriver() {
		return driver;
	}
public WebElement getSixthpagination() {
	return sixthpagination;
}

public WebElement getPreviousbtn() {
	return previousbtn;
}

public WebElement getNextbtn() {
	return nextbtn;
}

public WebElement getFirstbtn() {
	return firstbtn;
}

public WebElement getLastbtn() {
	return lastbtn;
}
public WebElement getGroupsystemfirstcolumn() {
	return groupsystemfirstcolumn;
}
public WebElement getUpdatedsuccessmessage() {
	return updatedsuccessmessage;
}

public WebElement getGroupsystemiderror() {
	return groupsystemiderror;
}



public WebElement getGroupsystemerror() {
	return groupsystemerror;
}

public WebElement getsuccessmessage() {
	return successmessage;
}
	public WebElement getPaginationdrobdown() {
		return paginationdrobdown;
	}
	
	
	
	public WebElement getgroupsystemidfirstcolumn() {
		return  groupsystemidfirstcolumn;
	}

	public WebElement getHospitalgroupsystemlink() {
		return hospitalgroupsystemlink;
	}

	public WebElement getGroupsystemidfield() {
		return groupsystemidfield;
	}

	public WebElement getGroupsystemfield() {
		return groupsystemfield;
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
	
	public void getSystemId(String systemid) {
		List<WebElement> namesElements = driver.findElements(By.cssSelector("#DataTables_Table_0>tbody>tr>td:nth-child(1)"));
		 List<String> names=new ArrayList<String>();
		 
		 for(WebElement namesElement:namesElements) {
			 names.add(namesElement.getText());
			 
		 }
		 String nextbuttonclassname=driver.findElement(By.id("DataTables_Table_0_next")).getAttribute("class");
		 while(!nextbuttonclassname.contains("disabled")) {
			 try {
				 driver.findElement(By.id("DataTables_Table_0_next")).click();
			 }
			 catch(StaleElementReferenceException ri) {
				 driver.findElement(By.id("DataTables_Table_0_next")).click();
			 }
			 
			 namesElements = driver.findElements(By.cssSelector("#DataTables_Table_0>tbody>tr>td:nth-child(1)"));

			 for(WebElement namesElement:namesElements) {
				 names.add(namesElement.getText());
				 
			 }
			 nextbuttonclassname=driver.findElement(By.id("DataTables_Table_0_next")).getAttribute("class");
		 }
		 for(String name:names) {
			 if(name.equals(systemid)) {
					System.out.println("----GroupsystemID is  successfully displayed------");
				}
			 
		 }
	}
		 public void getSystemName(String systemname) {
				List<WebElement> namesElements = driver.findElements(By.cssSelector("#DataTables_Table_0>tbody>tr>td:nth-child(2)"));
				 List<String> names=new ArrayList<String>();
				 
				 for(WebElement namesElement:namesElements) {
					 names.add(namesElement.getText());
					 
				 }
				 String nextbuttonclassname=driver.findElement(By.id("DataTables_Table_0_next")).getAttribute("class");
				 while(!nextbuttonclassname.contains("disabled")) {
					 try {
						 driver.findElement(By.id("DataTables_Table_0_next")).click();
					 }
					 catch(StaleElementReferenceException ri) {
						 driver.findElement(By.id("DataTables_Table_0_next")).click();
					 }
					 
					 namesElements = driver.findElements(By.cssSelector("#DataTables_Table_0>tbody>tr>td:nth-child(2)"));

					 for(WebElement namesElement:namesElements) {
						 names.add(namesElement.getText());
						 
					 }
					 nextbuttonclassname=driver.findElement(By.id("DataTables_Table_0_next")).getAttribute("class");
				 }
				 for(String name:names) {
					  if(name.equals(systemname)) {
							System.out.println("----Groupsystemname successfully displayed------");
						}
					 
				 }
		
	}


}
