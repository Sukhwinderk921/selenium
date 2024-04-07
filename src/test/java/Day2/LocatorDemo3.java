package Day2;
// css selector
//1. Tag and ID
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
	//1. Tag and ID	
		driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("Tops");
	
	//2. Tag and class	
		//driver.findElement(By.cssSelector(".search_query")).sendKeys("Tops");
		
  //3. Tag and atrribute	
		//driver.findElement(By.cssSelector("input[placeholder=\'Search']")).sendKeys("Tops");
	
  //4. Tag, class and Attributes		
		driver.findElement(By.cssSelector("input.search_query[name=\'search_query']")).sendKeys("Tops");
		
	}

}
