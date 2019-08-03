package actual;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
	
	
  @Test
  public void tes() throws InterruptedException {
	  
	  
	  System.out.println("In First Method " + Thread.currentThread().getId());
	  
       WebDriver driver =null; 
	  
	  String location = "C:\\Program Files\\Java\\browser_drivers\\chrome_driver\\chromedriver.exe";
	  
	  System.setProperty("webdriver.chrome.driver",location);
	  
	  driver = new ChromeDriver();
	  
	  Reporter.log("driver initialized");
	  
	  driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	  
	  Reporter.log("AUT launched");
	  
	  Thread.sleep(5000);
	  
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.id("usernameOrEmail")).sendKeys("aditya1");
	  driver.findElement(By.id("usernameOrEmail")).sendKeys(Keys.ENTER); 
	  
	  Reporter.log("Uname Entered");
	  
	  
	  File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  
	  
	  
	  try {
	   // now copy the  screenshot to desired location using copyFile //method
		  
	  FileUtils.copyFile(SrcFile, new File("C:\\Users\\Aditya Pulluru\\Desktop\\Eclipse screenshots\\test1.png"));
	  
	  Reporter.log("ScreenShot taken and placed in folder");
	  
	  }
	   
	  catch (IOException e)
	   {
	    System.out.println(e.getMessage());
	   
	   }
	  
	  driver.close();
	  
	  Reporter.log("Test Completed");
	 
	  
  }
}
