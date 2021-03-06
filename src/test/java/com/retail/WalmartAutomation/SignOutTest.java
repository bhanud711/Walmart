package com.retail.WalmartAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignOutTest {
	@Test()
	public void logout()
	{
		System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("chrome://settings/clearBrowserData");
		driver.findElement(By.xpath("//settings-ui")).sendKeys(Keys.ENTER);
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		WebElement homePageAccount = driver.findElement(By.xpath("//span[text()='Account']"));
		homePageAccount.click();
		WebElement signOut = driver.findElement(By.xpath("//div[text()='Sign Out']"));
		signOut.click();
	}

}
