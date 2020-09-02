package coreJava;

public class Ex14a_Array {

	public static void main(String[] args) {
		char xyz[] = {'a', 'b'}; 	//Char
		System.out.println(xyz[0]);
		System.out.println(xyz[1]);
		
		int number[] = {9 , 99 , 999 ,9999}; //Integer 
		System.out.println(number[2]);		//fetching
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[3]);
		
		System.out.println(xyz.length);
		System.out.println("length of number array = " +number.length);
	}
	

}
