/*
LinkedList - 
LinkedList<String> abc = new LinkedList<String>();

*/

package advancejava;

import java.util.LinkedList;

public class Ex2_LinkedList {

	public static void main(String[] args) {
	
	LinkedList<String> Fruits = new LinkedList<String>();	//define and create LinkedList
		Fruits.add("Apple");	//list add()
		Fruits.add("Mango");
		Fruits.add("Kiwi");
		Fruits.add("Cherry");
		Fruits.add("Berry");
		System.out.println("Fruits :" +Fruits);
		
		
		Fruits.addFirst("Pineapple");	//Add at first
		System.out.println(Fruits);
		
		Fruits.addLast("Guavava");
		System.out.println(Fruits);
		
		Fruits.removeFirst();	//remove first value
		System.out.println("Removed first :" +Fruits);
		
		Fruits.removeLast();	//remove last value
		System.out.println("Removed Last :" +Fruits);
		
		System.out.println("Index value :" +Fruits.get(2));	//get the value using index
		
		System.out.println("Fruits :" +Fruits.contains("Strawberry"));	//verify the mentioned value is present or not
		
		System.out.println("Value size :" +Fruits.size());	//size of linked list
		
		System.out.println("First:" +Fruits.getFirst());	//get first element of linked list
		
		System.out.println("Last:" +Fruits.getLast());		//get Last element of linked list
		
		Fruits.set(3, "Ranjan");
		System.out.println(Fruits);
		
		//replace??????
	}

}
