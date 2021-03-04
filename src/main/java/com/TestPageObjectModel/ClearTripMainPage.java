package com.TestPageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClearTripMainPage {
	HomePageOfClearTrip hp;

	@BeforeClass
	public void setup() throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		hp=new HomePageOfClearTrip(driver);
		driver.manage().window().maximize();
	    Thread.sleep(3000);
	}
	
     @Test
     public void Test1() throws InterruptedException {
    	 hp.url();
	
}
}
