package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.crm.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		try{
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:/Selenium/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
			prop.load(fis);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}catch(EncryptedDocumentException e){
			e.printStackTrace();
		}
		}	
	


public static void initialization(){
	String browserName = prop.getProperty("browser");
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Docs\\drivers\\chromedriver.exe");
		 // Initialize browser
		driver=new ChromeDriver();
	}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "C:/Selenium Docs/drivers/geckodriver");
		 // Initialize browser
		driver=new FirefoxDriver();
	}
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	
}




}


