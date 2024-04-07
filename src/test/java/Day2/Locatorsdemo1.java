package Day2;
/*id,
name
linkedtext,Partiallinkedtext
ClassName
TagName*/

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorsdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//1. id	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirt");  //locator-id
		
		//WebElement button = driver.findElement(By.name("submit_search")).click(); //locating the element
		
		driver.findElement(By.name("submit_search")).click();

	//2. linkedtext
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
		
	//3. partiallinkedtext
		driver.findElement(By.partialLinkText("faded short")).click();  //in partial linktext- no full text is required
		
		System.out.println("script passed");
		
	
		
		
		//4.
		
		
	//driver.findElement(null);  //return one element
	//List <WebElement> element= driver.findElements(null); //return multiple element
		
		
	}

}
