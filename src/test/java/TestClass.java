 import org.testng.annotations.*;
 import org.openqa.selenium.chrome.ChromeDriver;

 import org.openqa.selenium.*;

public class TestClass {
	
	
	@Test
	public void Test1()
	{
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("http://localhost:8888/");
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
        driver.findElement(By.id("submitButton")).click();
			
		System.out.println("Login Successful");
		
	}
	

}
