//5= factorial of 5 = 5*4*3*2*1 (factorial of a number)
package coreJava;

public class Ex12b_Factorialnumber {

	Ex12b_Factorialnumber(int a)			//Constructor
	//public void factorial(int a) //Function
	{
		int fact = 1;				//local variable
		for(int i = 1; i<=a; i++)	//loop
		{
			fact = fact*i;
			System.out.print(" * " +fact);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12b_Factorialnumber obj =new Ex12b_Factorialnumber(5); //class calling and constructor itself called
		//obj.factorial(7); //method calling
		
	}
	
}