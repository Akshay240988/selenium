package day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DBTesting {

	public static void main(String[] args) throws SQLException, InterruptedException {

		//		System.setProperty("webdriver.gecko.driver","C:/Users/Akshay Patil/Desktop/Automation/Browser drivers/geckodriver-v0.31.0-win64/geckodriver.exe");			
		//	    WebDriver wd = new FirefoxDriver();	
		//	    Thread.sleep(2000);
		//		
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost", "system", "password");

		Statement st=con.createStatement();
		ResultSet rs;
		rs=st.executeQuery("select * from CREDENTIALS2");
		String un;
		String pwd;
		while (rs.next())
		{
			un = rs.getString(1);
			pwd = rs.getString(2);

			System.out.println(un+"\t"+pwd);
			Thread.sleep(2000);
			//			wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			//			Thread.sleep(2000);
			//			wd.findElement(By.name("username")).sendKeys(un);
			//			wd.findElement(By.name("password")).sendKeys(pwd);
			//			wd.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			//			
			//			try {
			//			wd.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
			//			wd.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			//			System.out.println("Valid Credentials");
			//			}
			//			catch(Exception e) {
			//				System.out.println("Invalid Credentials");
			//			}
		}
		///inserting record
		int s=st.executeUpdate("insert into CREDENTIALS2 values('Admin56','admin123')");
		System.out.println("No.of row/s - "+s);

		//display table
		System.out.println("\nAfter inserting the record \n");
		rs=st.executeQuery("select * from CREDENTIALS2");

		while (rs.next())
		{
			un = rs.getString(1);
			pwd = rs.getString(2);

			System.out.println(un+"\t"+pwd);
		}
		
		int u=st.executeUpdate("update CREDENTIALS2 set password='admin56' where username='Admin56'");
		
		System.out.println("\nAfter updating the record \n");
		rs=st.executeQuery("select * from CREDENTIALS2");

		while (rs.next())
		{
			un = rs.getString(1);
			pwd = rs.getString(2);

			System.out.println(un+"\t"+pwd);
		}
		
		
		//		wd.quit();

	}

}
