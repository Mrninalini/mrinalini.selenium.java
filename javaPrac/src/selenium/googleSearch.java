package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class googleSearch {
  @Test
  public void f() throws InterruptedException {
	  String driverpath = "D:\\Selenium Drivers\\geckodriver.exe";
	  System.setProperty("webdriver.gecko.driver",driverpath);
	  WebDriver driver = new FirefoxDriver();
	Thread.sleep(3000);
	  driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenium hq");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div/div[2]/form/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).sendKeys(Keys.ENTER);	//keyboard enter
		 Thread.sleep(4000);
		 //browser navigation
		 driver.navigate().back();
		 Thread.sleep(4000);
		 driver.navigate().refresh();
		 Thread.sleep(4000);
		 driver.navigate().forward();
  }
}
