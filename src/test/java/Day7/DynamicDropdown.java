package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
				
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("selenium");

		List <WebElement> drp = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]//span"));
		
		Thread.sleep(3000);
		
		System.out.println("The no. of elements in dropdown is :" + drp.size());
		
		//for (int i=0; i<drp.size(); i++)
		//{
			//System.out.println(drp.get(i).getText());
		//}
		
//		for (int i=0; i<drp.size(); i++)
//		{
//			if(drp.g)
			//System.out.println(drp.)
		
		//}
		
		driver.findElement(By.name("q")).sendKeys("java");
		List <WebElement> drp1 = driver.findElements(By.xpath(""));
		
		Thread.sleep(4000);
		System.out.println("The no. of elements in dropdown is :" + drp1.size());
		
	}
}
