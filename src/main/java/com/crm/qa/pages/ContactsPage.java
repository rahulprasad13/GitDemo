package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//button[contains(text(),'New')]")
	WebElement newBtn;
	
	@FindBy(xpath="//i[@class='save icon']")
	WebElement saveBtn;
	
	@FindBy(name="first_name")
	WebElement firstname;
	
	@FindBy(name="last_name")
	WebElement lastname;
	
	@FindBy(name="description")
	WebElement description;
	
	
	@FindBy(xpath="//div[@name='category']")
	WebElement categoryDropDown;
	
	@FindBy(xpath="//div[contains(text(),'Contact')]")
	WebElement dropDownContact;
	
	
	
	
	public ContactsPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void createNewContact(String ftName, String ltName, String desc){
		
			contactsLink.click();
			newBtn.click();
		
		firstname.sendKeys(ftName);
		lastname.sendKeys(ltName);
		description.sendKeys(desc);
		categoryDropDown.click();
		dropDownContact.click();
		saveBtn.click();
		
	}
	
	
	
	
}
