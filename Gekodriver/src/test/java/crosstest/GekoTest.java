package crosstest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GekoTest {
	
  @Test
  public void myTest() {

		//System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();

		WebDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/login/");
		String Title = driver.getTitle();
		System.out.println("my title "+Title);
		
		/*
		driver.get(" https://en-gb.facebook.com/login/");
		driver.manage().window().maximize();
		//driver.get("https://www.myntra.com/");
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); 
		//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("habib.190@gmail.com");
		//explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass"))).sendKeys("test123t");   

		//driver.findElement(By.id("pass")).sendKeys("test123t");
		driver.findElement(By.id("loginbutton")).click();
		//driver.close();
		 
		 */
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//=======================================================
		
		//String title ="Log in to Facebook | Facebook";
		String title ="Log in to Facebook ";
		//System.out.println("title");
		String getTitle = driver.getTitle();
		Assert.assertEquals(title, getTitle);
		
		
		
  }
}
