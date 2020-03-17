package com.shreeya.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.shreeya.util.SeleniumCoder;

public class CxlOrderPage extends SeleniumCoder{
	
	WebElement cxlLink;
	private WebElement confirmButton;
	
	public void cxlExecution(WebDriver driver) throws InterruptedException {
		Thread.sleep(16000);
		cxlLink=driver.findElement(By.xpath("//*[@id=\"rightScroll1\"]/div[6]/div[1]/div[2]/div[6]/div/ul/li[2]/a"));
		clickElement(cxlLink);
		Thread.sleep(2000);
		confirmButton=driver.findElement(By.xpath("//button[text()='Confirm']"));
		clickElement(confirmButton);
	}

}
