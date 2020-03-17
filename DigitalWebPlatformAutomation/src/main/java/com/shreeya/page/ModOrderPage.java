package com.shreeya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.shreeya.util.SeleniumCoder;

public class ModOrderPage extends SeleniumCoder {
	
	WebElement modifyLink;
	WebElement noOfSharesTextField;
	private WebElement placeOrderButton;
	private WebElement confirmButton;
	
	public WebDriver modExecution(WebDriver driver) throws InterruptedException {
		Thread.sleep(16000);
		modifyLink=driver.findElement(By.xpath("//*[@id=\"rightScroll1\"]/div[6]/div[1]/div[2]/div[6]/div/ul/li[1]/a"));
		clickElement(modifyLink);
		Thread.sleep(3000);
		noOfSharesTextField=driver.findElement(By.xpath("//input[@placeholder='No. of Shares']"));
		clearAndSendKey(noOfSharesTextField, "2");
		placeOrderButton=driver.findElement(By.xpath("//input[@value ='Place Order']"));
		clickElement(placeOrderButton);
		Thread.sleep(2000);
		confirmButton=driver.findElement(By.xpath("//input[@value='Confirm']"));
		clickElement(confirmButton);
		return driver;
	}

}
