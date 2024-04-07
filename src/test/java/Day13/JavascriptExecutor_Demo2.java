package Day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutor_Demo2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();  //object of chrome class
		
		//WebDriver driver= new ChromeDriver();  //object of chrome class
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		
		//JavascriptExecutor js= (JavascriptExecutor) driver;  //javascriptexecutor is an interface
		
		JavascriptExecutor js= driver;
		
	//scroll the page by pixel
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,300)", " ");
		System.out.println(js.executeScript("return window.pageYOffset;",""));
		Thread.sleep(5000);
		
	//Scroll down to specific element
		WebElement India= driver.findElement(By.xpath("/html/body/div[3]/div/div/section[2]/div[1]/div/div[1]/div/h3"));
		js.executeScript("arguments[0].scrollintoview();", India);
		System.out.println(js.executeScript("return window.pagepageYOffset;"));
		
	//scroll to the end of the page
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		System.out.println(js.executeScript("return window.pagepageYOffset;"));
		
		
	}

}
