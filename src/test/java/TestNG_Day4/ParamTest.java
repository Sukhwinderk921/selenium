package TestNG_Day4;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

//parallel testing/cross browser testing
public class ParamTest {

	WebDriver driver;
	@BeforeClass
	@Parameters({"browser", "url"})
	void setup(String br, String appUrl) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		
//		else
//		{
//			driver= new FirefoxDriver();
//		}
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(appUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	void testLogo()
	{
		try
		{
			boolean status= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")).isDisplayed();
			Assert.assertEquals(status, true);
		}
		
		catch (Exception e)
		{
			Assert.fail();
		}
	}
	
	void testlogin() 
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@Test(priority=1)
	void testHomepageTitle()
	{
		Assert.assertEquals(driver.getTitle(), "OrangeHRM","Titles are not matched...");
	}
	
	
	void tearUp()
	{
		driver.close();
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub

}

}
