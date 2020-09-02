//if else
package coreJava;

public class Ex9_IfElse {
	public static void main(String[] args) 
	{
		int n = 10;
		if(n%2==0)
		{ 
			System.out.println("the number is even");
			System.out.println(n/2); //division 
			System.out.println(n%2); //remainder
		}
		else{
			System.out.println("the number is odd");
		}
	} 
	
}