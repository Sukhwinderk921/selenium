package Day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bing.com/");
		
		driver.findElement(By.name("q")).sendKeys("java");
		List <WebElement> drp = driver.findElements(By.xpath("//*[@id=\"sw_as\"]"));
		
		Thread.sleep(3000);
		
		System.out.println("The no. of elements in dropdown is :" + drp.size());
		
		for (int i=0; i<drp.size(); i++)
		{
			System.out.println(drp.get(i).getText());
		}

	}

}
