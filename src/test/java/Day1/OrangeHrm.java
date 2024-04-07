package Day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver-win64");
				
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //pass the url
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")).click();
		//String title= driver.getTitle();
		
		String act_value= driver.getTitle();
		String exp_value="OrangeHRM";
		
		if(act_value.equals(exp_value))
		{
			System.out.println("the test is passed");
		}
		else
			{
				System.out.println("the test is failed");
			}

	}

}
