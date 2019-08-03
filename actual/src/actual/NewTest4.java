package actual;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test
  public void test4() {
	  
	  System.out.println("In 4 test " +Thread.currentThread().getId());
	   WebDriver driver =null; 
		  
		  String location = "C:\\Program Files\\Java\\browser_drivers\\chrome_driver\\chromedriver.exe";
		  
		  System.setProperty("webdriver.chrome.driver",location);
		  
		  driver = new ChromeDriver();
		  
		  driver.get("https://www.facebook.com");
		  
		  File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  
		  
		  
		  
		  try {
		   // now copy the  screenshot to desired location using copyFile //method
			  
		  FileUtils.copyFile(SrcFile, new File("C:\\Users\\Aditya Pulluru\\Desktop\\Eclipse screenshots\\test4.png"));
		  
		  
		  }
		   
		  catch (IOException e)
		   {
		    System.out.println(e.getMessage());
		   
		   }
		  
		  driver.close();
 }
  }

