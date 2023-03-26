package handlingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrops {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
		WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
		WebElement block4 = driver.findElement(By.xpath("//h1[text()='Block 4']"));
		
		
	       Actions a= new Actions(driver);
	       Thread.sleep(3000);
	      
	       a.dragAndDrop(block1, block3).perform();
	       Thread.sleep(3000); 
	       
	       a.dragAndDrop(block2, block4).perform();
	       
		

	}

}
