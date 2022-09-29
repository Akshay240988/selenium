package day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ReadWrite_FA {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akshay Patil\\Desktop\\Automation\\Browser drivers\\chromedriver_win32 (1)/chromedriver.exe");		
		WebDriver wd = new ChromeDriver();
		//used to maximize opened single browser instance
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


		FileInputStream fi = new FileInputStream("./LoginData_FA.xlsx");

		XSSFWorkbook wk = new XSSFWorkbook(fi);//to access workbook
		XSSFSheet sh =wk.getSheet("FA_Credentials");//to access sheet by name

		for(int i=1;i<=sh.getLastRowNum();i++) 
		{
			XSSFRow rw = sh.getRow(i);//to access row by index
			//XSSFCell un = rw.getCell(0);//to access column by index
			String un = rw.getCell(0).toString();
			XSSFCell pwd = rw.getCell(1);
			XSSFCell res =rw.createCell(3);//used to create cell on specified index

			System.out.println(un+"\t"+pwd);
			// wd.get("http://demo.frontaccounting.eu/");
			wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//Thread.sleep(3000);
			//uname
			//wd.findElement(By.name("username")).clear();
			wd.findElement(By.name("username")).sendKeys(un);
			//password
			//wd.findElement(By.name("password")).clear();
			wd.findElement(By.name("password")).sendKeys(pwd.toString());//because of type mismatch

			wd.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
			
			try {
				wd.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
				wd.findElement(By.linkText("Logout")).click();	
				System.out.println("Valid Credentials");
				res.setCellValue("PASS");
			} catch (Exception e) {
				System.out.println("Invalid Credentials");
				TakesScreenshot ts = (TakesScreenshot) wd;
				   File fs = ts.getScreenshotAs(OutputType.FILE);
				   File df = new File("./"+un+".png");
				   FileHandler.copy(fs, df);
				   res.setCellValue("FAIL");
			}
			
			//wd.findElement(By.xpath("//header/div[1]/div[2]/ul[1]/li[1]/span[1]/i[1]")).click();
			//wd.findElement(By.linkText("Logout")).click();
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("./LoginData_FA.xlsx");
		wk.write(fo);
		
		
//		Thread.sleep(2000);
  //  	wd.close();

}

}
