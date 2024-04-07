package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		
	driver.switchTo().frame("iframeResult");
	
	WebElement f1= driver.findElement(By.xpath("//*[@id=\"field1\"]"));
	f1.clear();	
	f1.sendKeys("welcome");
	
	Actions act= new Actions(driver);
		
	act.doubleClick().perform();  //for doubleclick
	
	 //validation
	WebElement f2= driver.findElement(By.xpath("//*[@id=\"field2\"]"));
	
	//String text= f2.getText();
	
	String text= f2.getAttribute("value");
	System.out.println(text);
	
	if(text.equals("welcome"))
	{
		System.out.println("Test Passed");
	}
	else
	{
		System.out.println("test failed");
	}
	}
	}


