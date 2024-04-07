package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nopcommerce {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");  //pass the url
		
		driver.findElement(By.cssSelector("search-box-text")).sendKeys("Search store");

	}

}
