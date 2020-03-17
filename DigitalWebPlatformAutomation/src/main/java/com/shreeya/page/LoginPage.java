package com.shreeya.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.shreeya.util.SeleniumCoder;

public class LoginPage extends SeleniumCoder{
	
	WebElement popupButton; 
	WebElement loginButton;
	WebElement buyAndSellButton;
	WebElement userIdTextField;
	WebElement proceedButton;
	WebElement passwordTextField;
	WebElement yobTextField;
	WebElement continueButton;
	WebElement notNowButton;
	WebDriver driver;
	WebElement popupOkButton;
	
	
	static Logger log = Logger.getLogger(LoginPage.class.getName());
	public LoginPage() {
		
	}
	
	public WebDriver loginExecution() throws InterruptedException {
		driver=browserLaunch();
		popupButton=driver.findElement(By.xpath("//button[text()='No thanks']"));
		clickElement(popupButton);
		loginButton=driver.findElement(By.xpath("//span[text()='Login']"));
		clickElement(loginButton);
		buyAndSellButton=driver.findElement(By.xpath("//a[text()='Buy/Sell']"));
		clickElement(buyAndSellButton);
		Thread.sleep(3000);
		userIdTextField=driver.findElement(By.id("userID"));
		sendKey(userIdTextField,"60003800");
		proceedButton=driver.findElement(By.xpath("//button[text()='Proceed']"));
		clickElement(proceedButton);
		Thread.sleep(3000);
		passwordTextField=driver.findElement(By.id("password"));
		sendKey(passwordTextField, "abc123");
		proceedButton=driver.findElement(By.xpath("//button[text()='Proceed']"));
		clickElement(proceedButton);
		Thread.sleep(2000);
		yobTextField=driver.findElement(By.id("ans"));
		sendKey(yobTextField, "2000");
		continueButton=driver.findElement(By.xpath("//button[text()='Continue']"));
		clickElement(continueButton);
		Thread.sleep(3500);
		notNowButton=driver.findElement(By.xpath("//a[text()='Not now']"));
		clickElement(notNowButton);
		Thread.sleep(2000);
		popupOkButton=driver.findElement(By.xpath("//button[text()='Ok']"));
		clickElement(popupOkButton);
		return driver;
	}
	
	
}
