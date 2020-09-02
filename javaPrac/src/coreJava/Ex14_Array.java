//Array
//Integers number[]
//Noida GaurCity[] = {D01"Sachin", A03"Gaurav" ,B07"Aditi"}
//Array address starts from 0th
//String name[] = {"Sachin" , "Gaurav" , "Saurav"};
//address starts from 0 while length from 1
package coreJava;

public class Ex14_Array {

	public static void main(String[] args) {
		
		//String[] name = {"Sachin" , "Gaurav" , "Saurav"};	//String Defining
		String name[] = {"Sachin" , "Gaurav" , "Saurav"};	// String Defining
		System.out.println(name[2]);		//fetching
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		name[1]= "Aditi";			  //updated array value
		System.out.println(name[2]); //fetching array
		System.out.println(name[0]);
		System.out.println(name[1]);
		
		System.out.println(name.length);
		
	}
	
}
