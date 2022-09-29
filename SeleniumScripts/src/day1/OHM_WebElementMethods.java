package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHM_WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");	
	    WebDriver wd = new ChromeDriver();	
	    wd.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(5000);
	    
	  //username - by id locator
 	    wd.findElement(By.name("username")).sendKeys("Admin");
//	    //password - by name locator
	    wd.findElement(By.name("password")).sendKeys("admin123");
	    Thread.sleep(3000);
	    wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
	    Thread.sleep(3000);
	    wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]")).click();
	    Thread.sleep(3000);
	    wd.findElement(By.xpath("//header/div[2]/nav[1]/ul[1]/li[3]/span[1]")).click();
	    Thread.sleep(2000);
	    wd.findElement(By.xpath("//a[contains(text(),'Add Entitlements')]")).click();
	    Thread.sleep(2000);
	   
	    //wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]")).click();
	    Thread.sleep(2000);
	    boolean st=wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).isDisplayed();
//	    if(st==true)
//	    	System.out.println("Element is visible");
//	    else
//	    	System.out.println("Element is not visible");
//	    
	    
	    System.out.println(st);
	    

	}

}
