package day1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelectionScript {
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("1. Chrome \n 2. Firefox");
		System.out.println("Select Browser - ");
		int ch = sc.nextInt();
		WebDriver wd = null;
		switch (ch) {
		case 1: {
			System.setProperty("webdriver.chrome.driver", "C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/chromedriver_win32/chromedriver.exe");		
    	    wd = new ChromeDriver();
		}
		break;
		case 2: {
			System.setProperty("webdriver.gecko.driver","C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/geckodriver-v0.31.0-win64/geckodriver.exe");			
		    wd = new FirefoxDriver();		
			
		}
		break;
		default:
			System.out.println("Invalid input");
			break;
		}
//		if(wd!=null) {
//		wd.get("http://demo.frontaccounting.eu/");
//		Thread.sleep(7000);
//		wd.close();
//	    }
//		else {
//			System.out.println("Browser is null");
//		}
		
		try 
		{
			wd.get("http://demo.frontaccounting.eu/");
			Thread.sleep(7000);
			wd.close();
		} catch (Exception e)
		{
		    System.out.println("Browser is null");    	
		}
		

}
}