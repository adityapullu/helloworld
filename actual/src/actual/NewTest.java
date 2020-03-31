package actual;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
	
	
	
	
	
  @Test
  public void tes() throws InterruptedException {
	  
	  String location = "C:\\Users\\Aditya Pulluru\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe";
	  System.setProperty("webdriver.chrome.driver",location);
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  

	  
	  driver.findElement(By.linkText("Log in")).click();
	  //driver.findElement(By.xpath("//button[@class='button form-button is-primary']"));
	  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("ravali.thota@yyy.com");
	  driver.findElement(By.id("Password")).sendKeys("Adira@123");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  Thread.sleep(2000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  
	  
	  /*
	  System.out.println("In First Method " + Thread.currentThread().getId());
	  /////kjkjhgj
	  
	  
       WebDriver driver =null; 
	  
       String location = "C:\\Users\\Aditya Pulluru\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe";
		  
	  System.setProperty("webdriver.chrome.driver",location);
	  
	  driver = new ChromeDriver();
	  
	  Reporter.log("driver initialized");
	  
	  driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	  
	  Reporter.log("AUT launched");
	  
	  Thread.sleep(5000);
	  
	  driver.manage().window().maximize();
	  
	  
	  String a ="usernameOrEmail";
	  WebElement id = driver.findElement(By.id(a));
	  
	  id.sendKeys("aditya1");
	  driver.findElement(By.id("usernameOrEmail")).sendKeys(Keys.ARROW_UP);
	  driver.findElement(By.id("usernameOrEmail")).sendKeys(Keys.CLEAR);
	  
	  id.sendKeys("aditya1");
	  driver.findElement(By.id("usernameOrEmail")).sendKeys(Keys.ENTER);
	  
	  Reporter.log("Uname Entered");
	  
	  
	  File SrcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  
	  
	  
	  try {
	   // now copy the  screenshot to desired location using copyFile //method
		  
	  FileUtils.copyFile(SrcFile, new File("C:\\Users\\Aditya Pulluru\\Desktop\\Eclipse screenshots\\testhg1.png"));
	  
	  Reporter.log("ScreenShot taken and placed in folder");
	  
	  }
	   
	  catch (IOException e)
	   {
	    System.out.println(e.getMessage());
	   
	   }
	  
	  driver.close();
	  
	  Reporter.log("Test Completed");
	 
	*/  
  }
  
	  
}
