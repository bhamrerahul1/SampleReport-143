package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase4 {
	public WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
         driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void tc4()
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("man123");
		driver.findElement(By.name("login")).click();
	String title = driver.getTitle();
	//syntax for assert(hard)
	//Assert.assertEquals(actual,Expected);
	//Assert.assertEquals(title,"sjfhggjg5555");
    SoftAssert s= new SoftAssert();
	s.assertEquals(title,"Facebook – log in or sign up");
	
	
	Reporter.log(title,true);
	    String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		s.assertAll();
		
		
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close(); 
	}
	

}
