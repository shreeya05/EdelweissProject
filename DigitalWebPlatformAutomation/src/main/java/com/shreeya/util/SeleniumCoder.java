package com.shreeya.util;

import java.awt.RenderingHints.Key;
import java.awt.event.KeyEvent;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.shreeya.page.LoginPage;

public class SeleniumCoder {

	static Logger log = Logger.getLogger(SeleniumCoder.class.getName());
	public SeleniumCoder() {
		
	}
	
	public WebDriver browserLaunch() {
		System.setProperty("webdriver.chrome.driver","E:\\EdelweissProject\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ewuat.edelbusiness.in");
		
		log.info("Browser launch successfully.................");
		return driver;
	}
	
	public void sendKey(WebElement element,String msg) throws InterruptedException {
		Thread.sleep(2000);
		try {
		element.sendKeys(msg);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
	
	public void clickElement(WebElement element) throws InterruptedException {
		Thread.sleep(2000);
		element.click();
	}
	
	public void downErrorKeyEnter(WebElement element) {
		
		element.sendKeys(Keys.DOWN);
		element.sendKeys(Keys.ENTER);
	}
	
	public void clearAndSendKey(WebElement element,String msg) {
		try {
		element.clear();
		element.sendKeys(msg);
		}catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
