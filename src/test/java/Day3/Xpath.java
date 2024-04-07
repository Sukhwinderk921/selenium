package Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();  //maximize the window
	
		//absolute path	
		driver.findElement(By.xpath("//*[@id=\"main-product-img-4\"]")).click();
		
	//relative path
		String text=driver.findElement(By.xpath("//a[text()='Apple MacBook Pro 13-inch']")).getText();
		System.out.println(text);

	}

}
