package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class MouseHovering_OHM {

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
	    
	    Actions act = new Actions(wd);
	    
	   // act.moveToElement(wd.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[4]"))).perform();
	    List<WebElement> menus=wd.findElements(By.className("oxd-main-menu-item-wrapper"));
	    System.out.println("Size of list -"+menus.size());
	    
	    WebElement fe = menus.get(0);
	    System.out.println("First Menu : "+fe.getText());
	    System.out.println("Last Menu : "+menus.get(menus.size()-1).getText());
	    
	    for(int i=0;i<=menus.size()-1;i++) {
	    	Thread.sleep(1000);
	    	System.out.println(menus.get(i).getText());
	    	act.moveToElement(menus.get(i)).perform();
	    }
	    }
	    
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	

}
