package com.spacejet.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream("C:\\Users\\josep\\OneDrive\\Desktop\\QA Training\\Selenium Practice Programs\\EliasGitPull\\Elias_Joseph_Practice_POM_SpaceJet\\src\\main\\java\\com\\spacejet\\qa\\config\\config.properties");
		prop.load(ip);
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		

	public static void initialization() {
		
		String browserName = prop.getProperty("browser");
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\josep\\OneDrive\\Desktop\\QA Training\\Selenium Practice Programs\\EliasGitPull\\Elias_Joseph_Practice_POM_SpaceJet\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} 
		
		else { 
			
			System.out.println("No browser is available");
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
