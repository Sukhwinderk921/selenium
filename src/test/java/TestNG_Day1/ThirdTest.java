package TestNG_Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ThirdTest {
	ChromeDriver driver;  //global variable
	
	@Test(priority=10)
	public void OpenApp()
	{
		driver= new ChromeDriver();  //local variable
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, 0));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=20)
	public void Login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	
	@Test(priority=30)
	public void CloseApp()
	{
		
	}
	
	
	

}
