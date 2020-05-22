package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	
TestUtil testUtil;
LoginPage loginPage;
HomePage homePage;
ContactsPage contactsPage;
	
	@BeforeMethod
	public void setUp(){
		initialization();
		testUtil=new TestUtil();
		contactsPage =new ContactsPage();
		loginPage=new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		//contactsPage = homePage.clickOnContactsLink();
		}
	
	@Test
	public void validateCreateNewContact() throws InterruptedException{
		//homePage.clickOnContactsLink();
		//Thread.sleep(10000);
		contactsPage.createNewContact("Sai", "Baba", "First Contact created");
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
