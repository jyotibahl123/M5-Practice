 import org.testng.annotations.*;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	
	
	@Test
	public void Test1()
	{
		 WebDriverManager.iedriver().setup();
		 
   	     WebDriver driver = new InternetExplorerDriver();
   	     
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.id("submitButton")).click();
			
		System.out.println("Login Successful");
		
	}
	

}
