package com.automation.page;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	protected static WebDriver driver=null;
	public static void browseropen() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\BasicJavaWork\\TestNG Framework\\Automation My Work2\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //20000
												//either of (Duration.ofSeconds(20)) or (20, TimeUnit.SECONDS)
		driver.manage().window().maximize();
		driver.get(Utility.getPropertydata("url"));
		Thread.sleep(2000);
		
		//cookies clear code
	}
}