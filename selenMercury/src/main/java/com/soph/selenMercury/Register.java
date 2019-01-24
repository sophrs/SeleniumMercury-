package com.soph.selenMercury;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Register {
	
	@FindBy(xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input")
	WebElement fill;
	
	public void firstname(String firstname) {
		fill.click();
		fill.sendKeys(firstname, Keys.TAB);
		
		public void lastname(String lastname) {
			fill.sendKeys(lastname, Keys.TAB);
		}
		
		fill.sendKeys(phone, Keys.TAB);
	
		
		
	}
	
	

}
