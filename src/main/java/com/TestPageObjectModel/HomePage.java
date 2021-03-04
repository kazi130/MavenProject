package com.TestPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void url() throws InterruptedException {
		
		driver.get("http://automationpractice.com/index.php");	
		Thread.sleep(2000);
	}
	public void product() throws InterruptedException {
		
		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
        Thread.sleep(2000);
	}

}
