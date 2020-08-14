package com.spacejet.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.spacejet.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//Page Factory or Page Object or Page Repository
	 
	 @FindBy(xpath = "//a[contains(text(),'Login / Signup')]")
	 WebElement logindropdown;
	
	 
	 @FindBy(xpath = "//a[contains(text(),'SpiceClub Members')]")
	 WebElement spiceclubMember;
	 
	 @FindBy(xpath = "//li[@class='hide-mobile']//a[contains(text(),'Member Login')]")
	 WebElement memberLogin;
	 
	 @FindBy(xpath = "//li//a[contains(text(),'DEALS')]")
	 WebElement dealButton;
	 
	 // Constructor for initialize the page object
	 public LoginPage() {
		 PageFactory.initElements(driver, this);
	 }
	
	 // These are different actions or reusable methods
	 public String verifyTitle(){
		return driver.getTitle();
	 }
	 
	 public void clickDealButton(){
		 dealButton.click(); 
	 }
	 
	 public void loginNavigation() throws InterruptedException {
		 
		 Actions act = new Actions(driver);
		 act.moveToElement(logindropdown).build().perform();
		 Thread.sleep(1000);
		 act.moveToElement(spiceclubMember).build().perform();
		 Thread.sleep(1000);
		 memberLogin.click();
		 Thread.sleep(1000);
		//return new HomePage();	 	 
	 }
	 
	
	 

}
