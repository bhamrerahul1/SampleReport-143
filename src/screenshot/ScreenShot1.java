package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// Step 01: typecasting
          TakesScreenshot st= (  TakesScreenshot)driver;
          // Step 02: we can access the method and photo will be stored in RAM
       File scr = st.getScreenshotAs(OutputType.FILE);
       // Step 03: specify the location where photo should be stored
       File des= new File("./amazon.png");
       //copy paste from RAM to your location
       FileUtils.copyFile(scr,des);
       driver.close();

	}

}
