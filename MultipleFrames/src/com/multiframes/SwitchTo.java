package com.multiframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchTo {
	
	WebDriver driver;
	@Test
	public void multiframe() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("C:\\Users\\Administrator\\Documents\\Testing course\\Frames selenium\\frame.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	int tot=driver.findElements(By.tagName("iframe")).size();
	System.out.println("Number of frames: "+tot);
	driver.get("https://auth.hollandandbarrett.com/u/login");
	driver.findElement(By.id("username")).sendKeys("raghu.astepahead@gmail.com"); //id
	driver.findElement(By.name("password")).sendKeys("raghuBN@123"); //name
	driver.findElement(By.xpath("/html/body/main/section/div/div/div/form/div[2]/button")).click();
	
	driver.navigate().to("C:\\\\Users\\\\Administrator\\\\Documents\\\\Testing course\\\\Frames selenium\\\\frame.html");
    Thread.sleep(2000);
    driver.navigate().to("https://selenium.dev/");
    driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a")).click();
    Thread.sleep(2000);
    driver.navigate().to("C:\\\\Users\\\\Administrator\\\\Documents\\\\Testing course\\\\Frames selenium\\\\frame.html");
//    driver.switchTo().frame("My Store");
//    Thread.sleep(5000);
    driver.navigate().to("https://demo.opencart.com/");
    driver.findElement(By.name("search")).sendKeys("products");
    driver.findElement(By.xpath("//*[@id=\"search\"]/button/i")).click();
    Thread.sleep(2000);
    driver.quit();
	
	}
	
	

}
