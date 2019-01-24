package com.soph.selenMercury;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class AppTest {
	
	public
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;
	
//	@BeforeClass
//	public void start() {
//		extent = new ExtentReports("\"C:\\\\Users\\\\Admin\\\\Documents\\\\Automated Testing\\\\mercuryreports.html\", true);");
//		
//	}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	
	@Test
	public void test() {
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		Register page = PageFactory.initElements(driver, Register.class);
		page.firstname("soph");
		
		
		
	}
	
	
	
	
	
	
}
 
