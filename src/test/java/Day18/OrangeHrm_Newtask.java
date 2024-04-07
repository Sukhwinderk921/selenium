package Day18;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm_Newtask {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(5000);
		
		String act_value= driver.getTitle();

		String exp_value="Human Resources Management Software | OrangeHRM";

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
