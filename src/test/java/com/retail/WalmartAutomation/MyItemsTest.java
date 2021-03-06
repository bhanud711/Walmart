package com.retail.WalmartAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyItemsTest {

	@Test
	public void myItems() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		System.out.println("Page Title is:"+driver.getTitle());
		System.out.println("Current URL:"+driver.getCurrentUrl());
		WebElement account = driver.findElement(By.xpath("//span[text()='Account']"));
		account.click();
		WebElement signIN = driver.findElement(By.xpath("//div[text()='Sign In']"));
		signIN.click();
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("");
		WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
		loginButton.click();
		Thread.sleep(10000);
		WebElement items = driver.findElement(By.xpath("//span[text()='My Items']"));
		items.click();
	}
}
