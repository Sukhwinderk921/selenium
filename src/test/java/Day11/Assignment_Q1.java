package Day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_Q1 {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //pass the url
		
		//driver.get("http://www.automationpractice.pl/index.php");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		WebElement dd= driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		
		Select drp= new Select(dd);	//dropdown
		drp.selectByVisibleText("India");
				
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
		//driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

//		String act_value= driver.getTitle();
//		String exp_value="OrangeHRM";
//		
//		if(act_value.equals(exp_value))
//		{
//			System.out.println("the title of the page is OrangeHRM");
//		}
//		else
//			{
//				System.out.println("the test is failed");
//			}
		
		// getTitle() to obtain page title
	      //System.out.println("Page title is : " + driver.getTitle());
		
		//driver.findElement(By.name("UserName")).sendKeys("user123");
		//driver.findElement(By.name("Password")).sendKeys("password456");
		
		
		//total no. links
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("The total no. of links are " + links.size());	
		
		
		
	    //  driver.close();
		
	
	}

}
