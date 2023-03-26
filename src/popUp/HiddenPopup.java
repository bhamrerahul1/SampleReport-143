package popUp;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.findElement(By.xpath("//button[text()='Accept All']")).click();
		   driver.findElement(By.xpath(" //div[@class='date input-box ']")).click();
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-14em0t0-1 fxWHuy']")).click();
		   Thread.sleep(3000);
		   driver.close();
		   
		   
		   
		  
				   
		   
		   
		   
		   
		 

		
		
	
		
		
		

	}

}
