package TestNG_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	ChromeDriver driver;
	
	@Test
	void setup()
	{
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	void TestLogin(String email, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
		
		String exp= "nopCommerce demo store";
		String act= driver.getTitle();
		
		Assert.assertEquals(exp, act);
		
	}
	@Test
	void tearup() 
	{
		driver.close();
	}
	
	@DataProvider(name="dp", indices= {0,3})
	String[][] loginData()
	{
		String [][] data= {
				{"abc@gmail.com", "test"},
				{"mk@gmail.com","test123"},
				{"david@gmail.com", "hello"},
				{"johnwick@gmail.com", "john@123"}
				};		
		
		return data;
		}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
