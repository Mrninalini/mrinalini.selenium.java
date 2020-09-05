/*In same class multiple methods and set the priority.
Driver is local variable in method() for now this will not work as its scope is local variable,
so we have moved driver declaration in class (global variable).
*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class webdrivertest {
	
	WebDriver driver; 
	
	  @Test(priority = 1)
	  public void fbLuanch() throws InterruptedException {
		 String driverpath = "D:\\Selenium Drivers\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver",driverpath);
		 
	//WebDriver: It is an interface(What is interface)we are defining refrence variable "driver" whoose type is WebDriver.
	//now any object we assign to it must be an instance of class(ChromeDriver) that implements the interface.	 
		 WebDriver driver = new ChromeDriver();
		 //Interface obj = new class();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/r.php");
		 Thread.sleep(3000); //wait
		 
	  }	 
	  
	  @Test(priority = 2)
	  public void fbSignup() throws InterruptedException{
		//locators
			
			//driver.findElement(By.name("firstname")).sendKeys("Mrinalini");     //firstname
			 //Step 1: Enter first name
			 driver.findElement(By.xpath("//input[@id='u_0_n']")).sendKeys("Mrinalini");
			 Thread.sleep(3000);
			 
			 //Step 2: enter last name
			 //driver.findElement(By.name("lastname")).sendKeys("Chandola");  //lastname
			 driver.findElement(By.xpath("//input[@id='u_0_p']")).sendKeys("Chandola");
			 Thread.sleep(3000);
			 
			 //Step 3: Enter email id
			 //driver.findElement(By.name("reg_email__")).sendKeys("mrinalini@gmail.com"); //email
			 driver.findElement(By.xpath("//input[@id='u_0_s']")).sendKeys("mrinalini@gmail.com");
			 
			 //Step 4: Wait and Re-enter email id
			 WebDriverWait wait = new WebDriverWait(driver,20);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='u_0_v']")));	//Explicit wait
			 driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("mrinalini@gmail.com");
			 			
			 //Step 5:Enter password
			 driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("Test"); //Password
			 Thread.sleep(3000);
				  
			 
			 //driver.close();	//current or recent window close
			 //driver.quit();  	//close all windows
				 

		  
	  }
}
