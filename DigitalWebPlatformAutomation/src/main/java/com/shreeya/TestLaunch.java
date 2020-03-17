package com.shreeya;

import org.openqa.selenium.WebDriver;

import com.shreeya.page.CxlOrderPage;
import com.shreeya.page.LoginPage;
import com.shreeya.page.ModOrderPage;
import com.shreeya.page.NewOrderPage;
import com.shreeya.util.SeleniumCoder;

public class TestLaunch {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		TestLaunch launch=new TestLaunch();
		
		LoginPage login=new LoginPage();
		driver=login.loginExecution();
		NewOrderPage newOrder=new NewOrderPage();
		newOrder.newOrderExecution(driver);
		ModOrderPage modOrder=new ModOrderPage();
		modOrder.modExecution(driver);
		CxlOrderPage cxlOrder=new CxlOrderPage();
		cxlOrder.cxlExecution(driver);
	}
	
}
