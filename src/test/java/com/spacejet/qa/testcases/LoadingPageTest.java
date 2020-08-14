package com.spacejet.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.spacejet.qa.base.TestBase;
import com.spacejet.qa.pages.LoginPage;

public class LoadingPageTest extends TestBase{
	LoginPage loginpage;
	
	
	public LoadingPageTest(){
		super();
	}
	
	@BeforeMethod
	public void mainPage(){
		initialization();
		loginpage = new LoginPage();		
	}

	@Test (priority = 1, enabled = false)
	public void titleTest(){
		String titlePrint= loginpage.verifyTitle();
		System.out.println(titlePrint);
		Assert.assertEquals(titlePrint,"SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");	  
	}
	
	@Test(priority = 2, enabled = false)
	public void clickDealButtonTest(){
		loginpage.clickDealButton();
	}
	
	@Test(priority = 3, enabled = true)
	public void navigationTest() throws InterruptedException{
		loginpage.loginNavigation();
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
