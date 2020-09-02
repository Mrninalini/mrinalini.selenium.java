//user input using scanner class 
//Scanner class
package coreJava;

import java.util.Scanner;

public class Ex11_UserInput { //user defined class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter number: "); //message for user
		Scanner s = new Scanner(System.in); //java defined class- scanner class object
		
		int num = s.nextInt(); 
		System.out.println("user enetered number is:" +num);
	}

}
