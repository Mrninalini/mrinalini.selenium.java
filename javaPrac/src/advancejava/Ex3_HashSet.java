/*
A HashSet is a collection of items where every item is unique, 
and it is found in the java.util package:
-no sequence maintained
-null values allowed
-use hash table for storing data that is why no ordered maintained
- randomness is there
Maintain  and order is not maintained
 */
package advancejava;

import java.util.HashSet;

public class Ex3_HashSet {

	public static void main(String[] args) {
		
		HashSet<String> Games = new HashSet<String>();	//define and create hash set
		Games.add("Cricket");	//Hash set add()
		Games.add("Carrom");
		Games.add("Badminton");
		Games.add("Tennis");		//checking duplicacy
		Games.add("Swimming");
		Games.add("table Tennis");
		Games.add("LawnTennis");
		Games.add(null);
		System.out.println(Games);
		
		System.out.println(Games.size()); //size
		
		System.out.println("Details :" +Games.contains("volleyball")); //to verify the hashset object using contains() ->False
		System.out.println("Details :" +Games.contains("LawnTennis")); //to verify the hashset object using contains() ->True
		
		System.out.println("We have removed the values :" +Games.remove("LawnTennis")); //to remove the hashset values using remove()
		
		Games.clear();		//clear
		System.out.println(Games);
	
	}

}
