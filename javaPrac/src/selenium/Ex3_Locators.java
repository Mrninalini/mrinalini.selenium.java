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
  
 */

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex3_Locators {
  @Test
  public void fb() throws InterruptedException {
	  String driverpath = "D:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		
		  Thread.sleep(3000); //wait
		  //locators
		  driver.findElement(By.name("firstname")).sendKeys("AchinTest");     //firstname
		  Thread.sleep(3000);
		  driver.findElement(By.name("lastname")).sendKeys("RorTest");  //lastname
		  Thread.sleep(3000);
		  driver.findElement(By.name("reg_email__")).sendKeys("Test@gmail.com"); //email
		  driver.findElement(By.xpath("//input[@id = 'password_step_input']")).sendKeys("Test"); //Password
		  Thread.sleep(3000);
		  
		  driver.close();	//current or recent window close
		  driver.quit();  	//close all windows
		 
  }
}
