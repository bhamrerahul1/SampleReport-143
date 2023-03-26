package screenshot;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// Step 01: typecasting
          TakesScreenshot st= (  TakesScreenshot)driver;
          // Step 02: we can access the method and photo will be stored in RAM
          Thread.sleep(3000);
       File scr = st.getScreenshotAs(OutputType.FILE);
       Thread.sleep(3000);
       // Step 03: specify the location where photo should be stored
       File des= new File("./snapdeal.png");
       //copy paste from RAM to your location
       FileUtils.copyFile(scr,des);
       driver.close();
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
                   
	
		
		
	}
}

