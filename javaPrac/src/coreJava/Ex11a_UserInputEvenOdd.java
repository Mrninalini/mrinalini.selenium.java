package coreJava;

import java.util.Scanner;

public class Ex11a_UserInputEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("User please enter a number");
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		//to check the user entered number using conditional statements number %2
		if(n%2==0)
		{
			System.out.println("number is even: " +n);
		}
		else{
			System.out.println("number is odd: " +n);
		}
	}
	

}
