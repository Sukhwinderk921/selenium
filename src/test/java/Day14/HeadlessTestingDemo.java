package Day14;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class HeadlessTestingDemo {

	public static void main(String[] args) {
		
	//Approach 1	
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--headless=new");
		WebDriver driver= new ChromeDriver(option);  //open the browser
		
	//Approach 2
//		ChromeOptions option= new ChromeOptions();
//		//option.setHeadless(true);
//		option.addArguments("--Headless=new");
//		WebDriver driver= WebDriverManager.chromedriver().capabilities(option).create();
		
	//ChromeDriver driver= new ChromeDriver();  //object of chrome class
		// WebDriver driver= new ChromeDriver();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //driver.get("https://demo.nopcommerce.com/");
		 //driver.manage().window().maximize();
		
	}

}
