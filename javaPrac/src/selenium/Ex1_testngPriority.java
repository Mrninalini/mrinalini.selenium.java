/* 
what is TestNG
-it is framework which helps in providing annotations,code efficiency, easy to use/manage
it helps in adding descriptions, 
helps in grouping, 
helps in parallel execution,
helps in running test case based upon priority or dependency,
helps in generating reports, 
data parameterization is also possible.
----------------------------------------------------------------
we created TestNG class
we used annotations  and imported them.
we run it as TestNG test
-----------------------------------------------------------------
Hierarchy of the TestNG Annotations:
@BeforeSuite 
	The @BeforeSuite annotated method will run before the execution of all the test methods in the suite.
@BeforeTest
	The @BeforeTest annotated method will be executed before the execution of all the test methods of available classes
	 belonging to that folder.
@BeforeClass
@BeforeMethod :
	The @BeforeMethod annotated method will be invoked before the execution of each test method where the test method is nothing but a test case.
@BeforeGroups
	The @BeforeGroups annotated method run only once for a group before the execution of all test cases belonging to that group.
@Test
@AfterMethod
	The @AfterMethod annotated method will run after the execution of each test method.
@AfterClass
@AfterTest
 	The @AfterTest annotated method will be executed after the execution of all the test methods in the suite
@AfterSuite
	The @AfterSuite annotated method will run after the execution of all the test methods in the suite
@AfterGroups
	The @AfterGroups annotated method run only once for a group after the execution of all test cases belonging to that group.
------------------------------------------------------------------------------------------------------------------------------
Benefits of using TestNG Annotations:
TestNG Annotations made the life of testers very easy. Based on your requirements, you can access the test methods, 
i.e., it has no predefined pattern or format.
You can pass the additional parameters to TestNG annotations.
In the case of TestNG annotations, you do not need to extend any test classes.
TestNG Annotations are strongly typed, i.e., errors are detected at the compile time.
*/
package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Ex1_testngPriority {
	
  @Test(description = "verify user able to luanch the URL", priority = 1)	//Predefined annotation setting with priority 1 and putting description of the test case
  public void luanchURL() {
	  String driverpath = "D:\\Selenium Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver dr= new ChromeDriver();  
  }
  
  @Test(priority = 3)		//Predefined annotation setting with priority 3
  public void verifyhomePage()
  {
	  System.out.println("We are verifying home page");
  }
  
  @Test(priority = 2)		//Predefined annotation setting with priority 2
  public void loginPage()
  {
	  System.out.println("This is Login page");
  }
  
}
