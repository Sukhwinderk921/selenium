package TestNG_Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Annotation2 {

ChromeDriver driver;  //global variable

//@BeforeMethod	
//@BeforeTest
public void Book()
{
	System.out.println("This is test1");
}
@Test
public void ReadBook()
{
	System.out.println("Reading Book...");
}

@AfterMethod
@AfterTest
public void CloseBook()
{
	System.out.println("Closing Book...");
}
}
