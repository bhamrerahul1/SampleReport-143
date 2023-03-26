package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream fis= new FileInputStream ("./excelData.xlsx");
		             Workbook wb = WorkbookFactory.create(fis);
		           String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		            String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		            String pass = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		            WebDriver driver = new ChromeDriver();
		    		driver.manage().window().maximize();
		    		driver.get(url);
		    		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    		driver.findElement(By.name("username")).sendKeys(username);
		    		Thread.sleep(3000);
		    		driver.findElement(By.name("pwd")).sendKeys(pass);
		    		driver.close();
		    		
		    		
		    		
		    		
		             
		
		

	}

}
