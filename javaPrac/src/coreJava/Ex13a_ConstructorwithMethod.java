package coreJava;

public class Ex13a_ConstructorwithMethod {
	Ex13a_ConstructorwithMethod()
	{
		System.out.println("i am inside argument constructor");
	}
	void method1()
	{
		System.out.println("i am inside method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex13a_ConstructorwithMethod c = new Ex13a_ConstructorwithMethod(); //constructor auto call
		c.method1(); //calling method

	}

}
