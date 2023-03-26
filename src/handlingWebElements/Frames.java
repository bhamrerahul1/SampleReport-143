package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");//url
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// default statement 
		        WebElement signin = driver.findElement(By.xpath("(//span[text ()='Sign In'])"));//mousehovering
		        Thread.sleep(3000);
		        Actions a= new Actions(driver);// create object for action class 
		        a.moveToElement(signin).perform();// mousehovering
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//a[text ()='login']")).click();// click on login button 
		        Thread.sleep(3000);
		        driver.switchTo().frame(0);// travels from parent to child
		        Thread.sleep(3000);
		        driver.findElement(By.id("userName")).sendKeys("1236541230");//type phone number in phone filed in child frame
		        Thread.sleep(3000);
		        driver.findElement(By.id("close-pop")).click();//close to child frame
		        Thread.sleep(3000);
		         driver.switchTo().defaultContent();//travels from child frame to parent frame
		         Thread.sleep(3000);
		         driver.findElement(By.id("inputValEnter")).sendKeys("phone");//type phone in search text field
		         Thread.sleep(3000);
		         driver.close();
		         
		         
		        
		        
		        
		        

	}

}
