package selenium;

import org.testng.annotations.Test;

public class Ex2_parrallelRunning {

  @Test(description = "verify user able to luanch the URL", priority = 1)	//Predefined annotation setting with priority 1 and putting description of the test case
  public void websiteLuanch() {
	  System.out.println("We are flipkart");  
  }
  
  @Test(priority = 3)		//Predefined annotation setting with priority 3
  public void verifycartpage()
  {
	  System.out.println("This is cart page");
  }
  
  @Test(priority = 2)		//Predefined annotation setting with priority 2
  public void paymentpage()
  {
	  System.out.println("This is Payment page");
 
  }
}
