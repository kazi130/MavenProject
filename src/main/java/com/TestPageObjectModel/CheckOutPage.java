package com.TestPageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

	private WebDriver driver;

	public CheckOutPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void checkout() throws InterruptedException {
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("kazijewel7@yahoo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("kj2122008");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		Thread.sleep(2000);
		
		
	}
//	SubmitLogin
	//(//button[@type='submit'])[2]
}
