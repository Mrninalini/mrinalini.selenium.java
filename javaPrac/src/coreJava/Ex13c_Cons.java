//this is used to call constructor
//constructor calling should be always first statement
package coreJava;

public class Ex13c_Cons {
	Ex13c_Cons()
	{
		this(2, 3);
		System.out.println("0 no of argument const");
	}
	Ex13c_Cons(int a)
	{
		this(20,30);
		System.out.println("1 arguments const");
	}
	Ex13c_Cons(int a, int b)
	{
	System.out.println("2 arguments const: " +a +b);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex13c_Cons obj= new Ex13c_Cons(); //object creation
		
		
	}

}
