package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myexample {
	Myexample(){
		String driverpath = "D:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver dr= new ChromeDriver();
	}
	
	   public static void main(String[] args) throws InterruptedException {
		   Myexample obj = new Myexample();
		   
        //String driverpath = "D:\\Selenium Drivers\\chromedriver.exe";
       // String driverpath2 = "D:\\Selenium Drivers\\geckodriver.exe";
	    //System.setProperty("webdriver.chrome.driver",driverpath);
	   // System.setProperty("webdriver.gecko.driver",driverpath2);
	   // WebDriver dr= new ChromeDriver();
	   // WebDriver dr2 = new FirefoxDriver();
	    
        //dr.get("https://www.google.com");
	   // Thread.sleep(5);
       // dr2.get("https://www.google.com/?gws_rd=ssl");
        
       // dr.findElement(By.name("q")).sendKeys("AtosSyntel"); //enter-input in textbox
       // dr.findElement(By.name("q")).sendKeys(Keys.ENTER);	//Keyboard action
        
        //WebElement Search_input = dr.findElement(By.name("q")); //identify the web element 
       //  Search_input.sendKeys("AtoSyntel");
       // Search_input.sendKeys(Keys.ENTER);
        
  }
}
