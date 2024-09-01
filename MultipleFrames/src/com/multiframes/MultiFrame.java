package com.multiframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiFrame {
	WebDriver driver;
	@Test
	public void multif() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("C:\\Users\\Administrator\\Documents\\Testing course\\Frames selenium\\frame.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	int tot=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Number of frames: "+tot);
}
}
