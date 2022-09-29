package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_OHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");	
	    WebDriver wd = new ChromeDriver();	
	    wd.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(3000);
	    //username - by id locator
//	    wd.findElement(By.id("txtUsername")).sendKeys("Admin");
//	    //password - by name locator
//	    wd.findElement(By.name("txtPassword")).sendKeys("admin123");
//	    Thread.sleep(3000);
//	    wd.findElement(By.className("button")).click();
//	    Thread.sleep(3000);
//	    
//	    wd.close();
	    //cssSelector Locator ways
	    //username -1)by tagname#id
	    wd.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
	    Thread.sleep(5000);
	    //password - 2)by tagname[attribute=value of attribute]
	    wd.findElement(By.cssSelector("input[type=password]")).sendKeys("admin123");
	    Thread.sleep(5000);
	    //LoginButton - 3)by tagname.className
	    
	    Thread.sleep(10000);
	    wd.findElement(By.cssSelector("input.button")).click();
	    Thread.sleep(10000);
	    
	    // Select Admin by Absolute xpath
	    wd.findElement(By.xpath("/html/body/div[1]/div[2]/ul/li[1]/a/b")).click();
	    Thread.sleep(20000);
	     wd.close();

	    
	}

}
