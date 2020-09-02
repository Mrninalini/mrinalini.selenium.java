package advancejava;

import java.util.ArrayList;

public class myexampleJava {
	public void mytesting(int a){
		
		 ArrayList<Integer> arr = new ArrayList<Integer>();
		  arr.add(1);
		  arr.add(51);
		  arr.add(71);
		  arr.add(16);
		  arr.add(15);
		  
		  System.out.println("Print" +arr);
		  
		  if(arr.contains(a)){ 	//to check the value is present in array list object or not with contains()
			  
			  System.out.println("number is present" +a);
		  }
		  else{
			  System.out.println("number is not present");
		  }
	}

	public static void main(String[] args) {
		myexampleJava obj = new myexampleJava();
		obj.mytesting(2);
		

	}

}
