package day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioChkbox_rs {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
		WebDriver wd = new ChromeDriver();
		wd.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(4000);
		
		//wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).click();
		
//		 List<WebElement> radio = wd.findElements(By.name("radioButton"));
//		 
//		 for(WebElement r:radio) {
//			 r.click();
//			 Thread.sleep(2000);
//		 }
//		
		
//		 List<WebElement> chk = wd.findElements(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label/input"));
//		 
//		 for(WebElement c:chk) {
//			 c.click();
//			 Thread.sleep(2000);
//		 }
//		 Thread.sleep(1000);
//		 wd.quit();
		
//		boolean st = wd.findElement(By.id("checkBoxOption1")).isDisplayed();
//		System.out.println("Status - "+st);
//		
//		if(st=true) {
//			wd.findElement(By.id("checkBoxOption1")).click();
//			System.out.println("Element is visible");
//		}
//		else {
//			System.out.println("Element is not visible");
//		}
		
//		boolean b = wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).isSelected();
//		System.out.println(b);
//		if(b==true) {
//			System.out.println("Radio button is selected");
//		}else {
//			System.out.println("Radio button is not selected");
//			wd.findElement(By.xpath("//body/div[1]/div[1]/fieldset[1]/label[1]/input[1]")).click();
//			
//		}
		
		boolean st=wd.findElement(By.xpath("//body[1]/div[1]/div[4]/fieldset[1]/label[1]/input[1]")).isEnabled();
		
		if(st==true) {
			System.out.println("Element is enabled");
		}else
			System.out.println("Element is not enabled");
			
		
		
		Thread.sleep(2000);
		wd.quit();
		
	
		
		
		
		 }
	
	     
		 
		 
		 
	}


