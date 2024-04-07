package Day13;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;

public class InteractwithElementswithJS {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();  //object of chrome class
			
		//WebDriver driver= new ChromeDriver();  //object of chrome class
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;  //javascriptexecutor is an interface
		
		WebElement inputbox= driver.findElement(By.id("name"));
    	js.executeScript("arguments[0].setAttribute('value', 'John')",inputbox);  //javascript
    	
    	WebElement emailbox= driver.findElement(By.id("email"));
    	js.executeScript("arguments[0].setAttribute('value', 'john@gmail.com')",emailbox);  //javascript
    	
    	WebElement phone= driver.findElement(By.id("phone"));
    	js.executeScript("arguments[0].setAttribute('value', '1234567890')",phone);  //javascript
		
    	WebElement textarea= driver.findElement(By.id("textarea"));
    	js.executeScript("arguments[0].setAttribute('value', 'Rajpura,Punjab, India')",textarea);  //javascript	
    	
    //radio buttons
    	WebElement male_rd= driver.findElement(By.id("male"));
    	js.executeScript("arguments[0].click()", male_rd);
    	
    	//checkboxes
    	WebElement days= driver.findElement(By.id("wednesday"));
    	js.executeScript("arguments[0].click()", days);
    	
    //submit button
//    	WebElement btn= driver.findElement(By.name("Submit"));
//    	js.executeScript("arguments[0].click()", btn);

    //drop down
    	WebElement dd= driver.findElement(By.xpath("//*[@id=\"country\"]"));
    	js.executeScript("arguments[0].click()", dd);
    	
    //use of JavaScript Executor to select an option from the dropdown	
    	String optionvalue= "germany";
    	String script= "arguments[0].value='" + optionvalue + "'; ";
    	
    	driver.executeScript(script, dd);
    	
    //verify selection if needed
    	String selectedOption=(String) js.executeScript("return arguments[0].value;", dd);
    	System.out.println("Selected option is " + selectedOption);
    
    	
  
	}

}
