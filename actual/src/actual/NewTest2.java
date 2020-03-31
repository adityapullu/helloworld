package actual;

import java.io.File;
import java.io.IOException;

import javax.lang.model.element.ExecutableElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class NewTest2 {
  @Test
  public void test2() throws InterruptedException {
	  
	  System.out.println("In Second test " +Thread.currentThread().getId());
	   WebDriver driver =null; 
		  
		  String location = "C:\\Users\\Aditya Pulluru\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe";
		  
		  System.setProperty("webdriver.chrome.driver",location);
		  
		  driver = new ChromeDriver();
		  
		  driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
		  
		  Thread.sleep(5000);
		  
		  ExtentReports reports = new ExtentReports("D:\\phone",false);

		  ExtentTest test = reports.startTest("test1");
		  
		  test.log(LogStatus.INFO, "Start Page");
		  
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("usernameOrEmail")).sendKeys("aditya2");
		  test.log(LogStatus.INFO, "u name entered");
		  driver.findElement(By.id("usernameOrEmail")).sendKeys(Keys.ENTER);
		  test.log(LogStatus.INFO, "pw entered");
		  
		  File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  test.log(LogStatus.INFO, "Sc taken");
		  
		  
		  
		  try {
		   // now copy the  screenshot to desired location using copyFile //method
			  
		  FileUtils.copyFile(SrcFile, new File("C:\\Users\\Aditya Pulluru\\Desktop\\Eclipse screenshots\\test2.png"));
		  
		  
		  }
		   
		  catch (IOException e)
		   {
		    System.out.println(e.getMessage());
		   
		   }
		  test.log(LogStatus.INFO, "sc place in foldrer");
		  
		  test.log(LogStatus.INFO,test.addScreenCapture("C:\\\\Users\\\\Aditya Pulluru\\\\Desktop\\\\Eclipse screenshots\\\\test2.png") + "Start final");
		  test.log(LogStatus.INFO,test.addScreenCapture("C:\\\\Users\\\\Aditya Pulluru\\\\Desktop\\\\Eclipse screenshots\\\\test2.png") + "Start final2");
		  
		  driver.close();
	  
  }
}
