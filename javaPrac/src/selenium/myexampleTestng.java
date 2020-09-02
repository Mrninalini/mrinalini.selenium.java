package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import org.testng.annotations.Test;

public class myexampleTestng {
  @Test
  public void numbersort() {
	  ArrayList<Integer> arr =new ArrayList<Integer>();
	  arr.add(1);
	  arr.add(3);
	  arr.add(33);
	  arr.add(33);
	  arr.add(23);
	  
	  Collections.sort(arr);
	  System.out.println("we are sorting " +arr);
	  
	  HashSet arr1 = new HashSet(); //to remove duplicate values from the list
	  arr1.addAll(arr);				//passed the array list object in the  hashset object by using addAll()
	  System.out.println("we are sorting 1" +arr1);
			 
	  
	  HashMap arr2 =new HashMap();
	  arr2.put(1, "one");
	  arr2.put(21, "twentyone");
	  arr2.put(31, "thirtyone");
	  arr2.put(41, "fourtyone");
	  arr2.put(51, "fiftyone");
	  
	  System.out.println("Values " +arr2);
	  
  }
}
