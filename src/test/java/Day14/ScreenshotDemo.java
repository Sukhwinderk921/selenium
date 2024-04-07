package Day14;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {
	//ChromeDriver driver= new ChromeDriver();  //object of chrome class
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
	//TakesScreenshot ts= driver;
		TakesScreenshot ts= (TakesScreenshot) driver;
		
//		File src=ts.getScreenshotAs(OutputType.FILE);  //take the screenshot
//		File trg=new File("C:\\Users\\91896\\eclipse-workspace\\Selenium_Maven\\screenshot\\fullpage.png");
	//FileUtils.copyfile(src, trg);
		
	//capture screenshot for specific area of page
		WebElement featureProduct= driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]"));
		File src= featureProduct.getScreenshotAs(OutputType.FILE);
		File trg1= new File("C:\\Users\\91896\\eclipse-workspace\\Selenium_Maven\\screenshot\\featureProduct.png");
		FileUtils.copyFile(src, trg1);
		System.out.println("Screenshot taken");
		
		
	//capture screenshot for specific element
		WebElement logo= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		File scc= logo.getScreenshotAs(OutputType.FILE);
		File tgt= new File("C:\\Users\\91896\\eclipse-workspace\\Selenium_Maven\\screenshot\\logo.png");
		FileUtils.copyFile(scc, tgt);
		System.out.println("Screenshot taken");
		
		

		
		
	}

}
