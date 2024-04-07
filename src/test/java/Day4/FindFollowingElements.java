package Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class FindFollowingElements {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		 
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		List <WebElement> items= driver.findElements(By.xpath("//*[@name=\"email\"]//following::*"));
				System.out.println(items.size());
	}

}
