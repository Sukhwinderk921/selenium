package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_events {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://text-compare.com/");
		
		driver.findElement(By.xpath("//*[@id=\"inputText1\"]")).sendKeys("Hello, today we are learning keyboard events.");
		
		Actions act= new Actions(driver);
		
	//ctrl+a	
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		
//		act.keyDown(Keys.CONTROL)
//		.sendKeys("a")
//		.keyUp(Keys.CONTROL)
//		.perform();
		
		//ctrl+c	
			act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
			
	//tab
		act.sendKeys(Keys.TAB);
		
		//ctrl+v	
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();*/
		
		
		driver.get("https://the-internet.herokuapp.com/key_presses?");
		
		driver.findElement(By.xpath("//*[@id=\"target\"]")).click();
		
		Actions act= new Actions(driver);
		act.sendKeys(Keys.CONTROL).perform();
		
		String text= driver.findElement(By.id("result")).getText();
		
		if(text.equals("you entered s"))
			System.out.println("Test passed");
			else
			{
				System.out.println("test fsiled");
			}
		}
		
	
		
		//act.sendKeys(Keys.TAB).perform();
		

	}


