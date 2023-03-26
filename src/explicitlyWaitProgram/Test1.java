package explicitlyWaitProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-2nsib7r/login.do");
	WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
	       WebElement username = driver.findElement(By.name("username"));
	 w.until(ExpectedConditions.visibilityOf(username)).sendKeys("admin");
	   WebElement password = driver.findElement(By.name("pwd"));
		 w.until(ExpectedConditions.visibilityOf( password)).sendKeys("manager");
	 WebElement login = driver.findElement(By.id("loginButton"));
		 w.until(ExpectedConditions.elementToBeClickable( login)).click();
		 String pagetitle = driver.getTitle();
		 w.until(ExpectedConditions.titleContains(pagetitle ));
     	System.out.println( pagetitle);
     String url = driver.getCurrentUrl();
     System.out.println( url);
     if( pagetitle.equals("actiTIME - login"))
     {
    	   	System.out.println("pass:home page is displayed");
    	 
     }
     else
     {
    		System.out.println("pass:home page is not  displayed");
    	 
     }
     driver.close();
		
	}

}
