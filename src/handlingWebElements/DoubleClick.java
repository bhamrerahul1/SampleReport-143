package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		             WebElement ele2 = driver.findElement(By.id("course"));//mousehovering
		             Actions a= new Actions(driver);//create object for action class
		             a.moveToElement(ele2).perform();//mousehovering
		             Thread.sleep(3000);
		               driver.findElement(By.xpath("(//a[text ()='Selenium Training'])[1]")).click();//click 
		              WebElement ele3 = driver.findElement(By.xpath("//i[@class='fa fa-plus']"));//double click
		              a.doubleClick(ele3).perform();
		              
		               
		               
		           
		             
		             
		             
		

	}

}
