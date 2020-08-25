package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
        WebDriver ldriver;
	
 public Loginpage(WebDriver rdriver ){
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver, this);	
		
		}
	
	@FindBy(xpath="//input[@id='health-city']")
	@CacheLookup
    WebElement selectcity;
	
	@FindBy(id="health_name")
	@CacheLookup
	WebElement entername;
	
	
	@FindBy(xpath="//*[@id=\"health_form\"]/div[1]/div[2]/div/div")
	@CacheLookup
	WebElement selectage;

	
	@FindBy(id="health-mobile")
	@CacheLookup
	WebElement entermobilenumber;
	
	@FindBy(xpath=("//*[@id=\"health_form\"]/div[3]/div/button"))
	@CacheLookup
	WebElement clicksubmit;
	
	
     public void SetcityName(String city) {		
     selectcity.sendKeys(city);

}
	 public void SetuserName(String testing) {
	 entername.sendKeys(testing);
		
	}

	 public void SetAge(String age) {
	 selectage.sendKeys("40");
		
	}
	
	public void Setmobilenumber(String mobile) {
		entermobilenumber.sendKeys("9999999999");
		
	}	
	
	
	public void clicksubmitbutton(){
		
		clicksubmit.click();
	}
	
	

}
