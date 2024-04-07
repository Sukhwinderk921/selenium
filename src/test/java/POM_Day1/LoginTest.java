package POM_Day1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest {
	
	WebDriver driver;
	LoginPage lp;
	
	//LoginPage2 lp;  //from page factory 
	@BeforeClass
	void setUp() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		
	}
	@Test(priority=2)
	
	void TestLogin()
	{
		
		lp.setUserName("Admin");
		
		lp.setPasswordName("admin123");
		
		lp.clicksubmit();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority=1)
	
	void Logo_Check()
	{
		lp= new LoginPage(driver);  //object
		Assert.assertEquals(lp.checkLogo(), true);
	}
	
	@AfterClass
		
	void TearDown()
	{
		driver.close();	
		}

}
