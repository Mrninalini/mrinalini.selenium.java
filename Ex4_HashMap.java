/*
 hash map:
 Key =value (all key value is unique)
 Maintain no insertion order
 Duplicate is not allowed
 one null key is allowed
 all key should be unique
 
 
 */


package advancejava;

import java.util.HashMap;

public class Ex4_HashMap {

	public static void main(String[] args) {
	
		HashMap<String, String> Capital = new HashMap<String , String>();	//define and create hash set
		Capital.put("India", "Delhi");	//Hash set add()
		Capital.put("USA", "Washington");
		Capital.put("UK", "London");
		Capital.put("Pakistan", "Lahore");
		Capital.put("USA", "Washington");
		Capital.put("Germany", "Berlin");
		Capital.put(null, null);
		Capital.put("", "");
		Capital.put("", "Goa");
		System.out.println("Data :" +Capital);
		
		System.out.println("Key :" +Capital.keySet());  //printing key 
		
		System.out.println("Values :" +Capital.values());  //printing values
		
		System.out.println("The Value is: " +Capital.get("India"));   //Get() to print the value for particular key
		
		Capital.remove("Germany", "Berlin");		//using remove()  to remove key and values
		System.out.println("removed :" +Capital);
		
		System.out.println("The size of the map is " + Capital.size());  //size() to know the size of hashmap
		
		Capital.clear();		//using clear() to clear set
		System.out.println("Hash map is cleared : " +Capital);

	}

}
