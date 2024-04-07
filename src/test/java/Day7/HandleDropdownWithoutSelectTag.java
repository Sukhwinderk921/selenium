package Day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdownWithoutSelectTag {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		
		WebElement dd= driver.findElement(By.xpath("//*[@class=\"multiselect-container dropdown-menu\"]/child::*"));
		
		driver.findElement(By.xpath("//button[@title='HTML,CSS']")).click();
		
		List <WebElement> list=driver.findElements(By.xpath("//*[contains@class,\"multiselect\")]//li//a//label"));
		
		//List <WebElement> list= driver.findElement(By.xpath("//*[contains@class,\"multiselect\")]//li//a//label\"));
		
				System.out.println("The no. of elements are " + list.size());
				
//				for(int i=0;i<list.size();i++)
//				{
//				System.out.println(list.get(i).getText());
//				}
				
//				for(WebElement List:all)
//				{
//				List.getText();
//				}
				
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getText().equals("Java"))
						list.get(i).click();
				break;
	}
				
				for (int i=0; i<list.size();i++)
				{
					String OptionName= list.get(i).getText();
					
					if(OptionName.equals("Java") || OptionName.equals("Python"))
					{
						list.get(i).click();
					}									
				}
	}
	}
