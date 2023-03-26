package popUp;

import java.time.Duration;// skillray program

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement d = driver.findElement(By.id("course"));
		 Actions a= new Actions(driver);
		 a.moveToElement(d).perform();
		 driver.findElement(By.xpath("(//a[text()='munit testing '])[1]")).click();
		 driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-flat']")).click();
	
		 
		 //switch the control to the alert
	 Alert popup = driver.switchTo().alert();
	 
	 
	 
	popup.dismiss();
	
	
	

	
	
		 
		 
		 
		 
		 
		
		

	}

}
