package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");	
	    WebDriver wd = new ChromeDriver();	
	    wd.get("https://demo.guru99.com/test/newtours/");
	    Thread.sleep(3000);
	    wd.findElement(By.name("userName")).sendKeys("test1");
	    wd.findElement(By.name("password")).sendKeys("test1");
	    wd.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/input[1]")).click();
	    Thread.sleep(5000);
	    wd.findElement(By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/a[1]")).click();
	    Thread.sleep(5000);
	    wd.close();
	}

}
