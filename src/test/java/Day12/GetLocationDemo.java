package Day12;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationDemo {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement logo= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
		System.out.println("the value of element before max: " + logo.getLocation());
		
		driver.manage().window().maximize();
		System.out.println("the value of element after max: " + logo.getLocation());
		
		driver.manage().window().minimize();
		System.out.println("the value of element after minimize: " + logo.getLocation());
		
		driver.manage().window().fullscreen();
		System.out.println("the value of element after fullscreen: " + logo.getLocation());
		
		Point p= new Point(100,35);
		driver.manage().window().setPosition(p);
		System.out.println("The value of element after setting the position of webpage : " + logo.getLocation());
		
		p= new Point(100,200);
		driver.manage().window().setPosition(p);
		System.out.println("The value of element after setting the position of webpage : " + logo.getLocation());

	}

}
