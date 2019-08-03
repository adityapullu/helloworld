package actual;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void test2() throws InterruptedException {
	  
	  System.out.println("In Second test " +Thread.currentThread().getId());
	   WebDriver driver =null; 
		  
		  String location = "C:\\Program Files\\Java\\browser_drivers\\chrome_driver\\chromedriver.exe";
		  
		  System.setProperty("webdriver.chrome.driver",location);
		  
		  driver = new ChromeDriver();
		  
		  driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		  
		  Thread.sleep(5000);
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("usernameOrEmail")).sendKeys("aditya2");
		  driver.findElement(By.id("usernameOrEmail")).sendKeys(Keys.ENTER);
		  
		  File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  
		  
		  
		  
		  try {
		   // now copy the  screenshot to desired location using copyFile //method
			  
		  FileUtils.copyFile(SrcFile, new File("C:\\Users\\Aditya Pulluru\\Desktop\\Eclipse screenshots\\test2.png"));
		  
		  
		  }
		   
		  catch (IOException e)
		   {
		    System.out.println(e.getMessage());
		   
		   }
		  
		  driver.close();
	  
  }
}
