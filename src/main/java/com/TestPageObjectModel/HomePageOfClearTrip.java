package com.TestPageObjectModel;

import org.openqa.selenium.WebDriver;

public class HomePageOfClearTrip {
	public WebDriver driver;
	
	public HomePageOfClearTrip(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void url() throws InterruptedException {
		
		driver.get("https://www.cleartrip.com/");	
		Thread.sleep(2000);
	}

}
