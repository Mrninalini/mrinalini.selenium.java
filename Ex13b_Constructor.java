package coreJava;

public class Ex13b_Constructor {
	Ex13b_Constructor()
	{
		System.out.println("i am inside argument constructor");
	}
	
	Ex13b_Constructor(int a)
	{
		System.out.println("i am inside with one argument: " +a);
	}
	Ex13b_Constructor(int b, int c)
	{
		System.out.println("i am inside with two argument");
	}
	void method1()
	{
		System.out.println("i am inside method 1");
	}
	void method2(int d)
	{
		System.out.println("i am inside method 2: " +d);
	}
	void method3(int d, int e)
	{
		System.out.println("i am inside method 3: " +d +e);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex13b_Constructor c = new Ex13b_Constructor(); //constructor auto call
		Ex13b_Constructor d = new Ex13b_Constructor(10); 
		Ex13b_Constructor e = new Ex13b_Constructor(2,3); 
		
		c.method1(); //calling method
		d.method1();
		e.method1();
		
		d.method2(10); //method with one parameter
		d.method3(5, 6); //method with two parameters
	}
	

}
