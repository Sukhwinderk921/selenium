package Day2;
//className
//tag

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//No. of requirements
//1. total no. sliders
//2. total no. images
//3. total no. links

public class LocatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
	
	//1. total no. sliders
		List <WebElement> slider = driver.findElements(By.className("homeslider-container"));
		System.out.println(" The slider have " + slider.size()+ " images");
		
	
	//2. total no. images
		List <WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("The total images are " + images.size());
	
	//3. total no. links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The total no. of links are " + links.size());	
		

	}

}
