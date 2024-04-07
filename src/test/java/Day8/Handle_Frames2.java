package Day8;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frames2 {

	public static void main(String[] args) {
ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		//driver.switchTo().frame(0);  //webelement
		
	//frame 1	
		driver.findElement(By.xpath("html/frameset/frame[1]")).sendKeys("12345");
		driver.findElement(By.name("mytext1")).sendKeys("1234");
		
		
		driver.findElement(By.xpath("//*[@id=\'id1\']/div/input")).sendKeys("12345");
		
		driver.switchTo().frame("Frame2"); //locating frame with id/name
		
		driver.switchTo().defaultContent(); 
		
		driver.findElement(By.xpath("//*[@id=\"id3\"]/div/input")).sendKeys("6582");
		
		driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//*[@id))
		
			}

}
