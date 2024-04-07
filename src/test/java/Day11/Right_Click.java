package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement button= driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		Actions act= new Actions(driver);
		act.contextClick(button).build().perform();  // context click for right click
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();	

	}

}
