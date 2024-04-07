package Day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
	// min slider element	
		//WebElement el= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/div"));
		
		//System.out.println("location of element before slider" + el.getLocation());  //pixel value of the element
		
		//Actions act= new Actions(driver);
		
		//act.dragAndDropBy(el, 100, 0).perform();
		//System.out.println("location of element after slider" + el.getLocation());
		
	// max slider element	
		WebElement e2= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println("location of element before slider" + e2.getLocation()); 
         Actions act1= new Actions(driver);
		
		act1.dragAndDropBy(e2, -120, 0).perform();
		System.out.println("location of element after slider" + e2.getLocation());
		

	}

}
