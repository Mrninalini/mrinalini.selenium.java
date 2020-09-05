/*
Locators: identify or locate a webelement using locator

Types of locators:
 
name*, id*, class*, 
 
link text, partial linktext ,  
 
css,
Xpath-> way of locating element -> (house no, society name etc)
  		   ex: driver.findElement(By.xpath("//input[@name='q']"));
		  							   //tag [@attribute ='value']
  		  //xpath = //input[@name ='firstname']
  		  //xpath = //input[@class = "inputtext _58mg _5dba _2ph-"]
  		  //xpath = //input[@id ='u_0_r']
Xpath types: 
Absolute:1>2>3>4>5 (it start searching from begning)
 ex: /header/div[1]/div[2]/div[3] (it starts from stairs
 Single slash-> look at immediate child	

Relative: it start searching from recent tag.
 ex: //input[@name='firstname'] (it navigates like lift)
  double slash -> looks anywhere for all nested children

xpath:		 //*[@id="tsf"]/div[2]/div[1]/div[1]/div/div[2]/input
Full xpath: /html/body/div/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input
chro path : //input[@name='q']

//tag[@contains (text(),'value')
//tag [starts-with (attribute, 'value')]

tagname-> types
input, a ,div
attribute: name, class, id 

Anchor tag :
<a href = "http://abc.com"> (Links)
  findElement by id
  findElement by name
  findElement by class
  
Different types of inputs?
  text feild
  button
  link
  radio button
  checkbox
  select dropdown
  
  waits:
  thread.wait(with exception handling)
  driver.close()->current or recent window close
  driver.quit() ->close all windows
  
Waits: delay,hold,lag
 Implicit Wait: Wait at every location(Ex:Passenger train wait at every station->performance issue)
 	driver.manage().timeouts().implicitlyWait(500, sec)
 	
 Explicit Wait: Wait at particular location(Ex:Express train-> preferred method)
 	WebDriverWait w = new WebDriverWait(driver,timeout in sec);
 	WebDriverWait w = new WebDriverWait(driver,10);
 	w.until(ExpectedCondition.visibilityofElementlocated(By.xpathexpression)
 	
 Threads.sleep() (performance degrdation)
 */

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Ex3_Locators {
  @Test
  public void fb() throws InterruptedException {
	 String driverpath = "D:\\Selenium Drivers\\chromedriver.exe";
	 System.setProperty("webdriver.chrome.driver",driverpath);
	 
//WebDriver: It is an interface(What is interface)we are defining refrence variable "driver" whoose type is WebDriver.
//now any object we assign to it must be an instance of class(ChromeDriver) that implements the interface.	 
	 WebDriver driver = new ChromeDriver();
	 //Interface obj = new class();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/r.php");
		
	 Thread.sleep(3000); //wait
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
