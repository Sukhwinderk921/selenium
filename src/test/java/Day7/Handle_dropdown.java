package Day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Handle_dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");

		WebElement dd= driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		
	Select drp= new Select(dd);	//dropdown
	
//selecting an option from drop down
	drp.selectByVisibleText("India");
	
	drp.selectByIndex(4);  // select by index
	
	drp.selectByValue("5"); //select by attribute/value
	
	Thread.sleep(3000);
	//driver.close();
	
	

	
//selecting state dropdown from url	
	WebElement st= driver.findElement(By.id("state-list"));
		
	Select drp1= new Select(st);	//dropdown
	
 //selecting an option from drop down
	//drp1.selectByVisibleText("Delhi");
	
	drp1.selectByIndex(3);  // select by index
	
	drp1.selectByValue("23"); //select by attribute/value
	
	List <WebElement> options=drp1.getOptions();
	
	System.out.println(options.size());
	
	for (int i=0; i<options.size(); i++)
	{
		System.out.println(options.get(i).getText());
	}
	
	
}

}
