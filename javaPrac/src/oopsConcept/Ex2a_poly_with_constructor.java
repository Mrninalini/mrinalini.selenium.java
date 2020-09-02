//to do with constructor

package oopsConcept;

public class Ex2a_poly_with_constructor {

	Ex2a_poly_with_constructor(int a, int b)	//method m1 with 2 arguments
	{
		System.out.println(a+b);
	}
	
	Ex2a_poly_with_constructor(int a) ////method m1 with 1 arguments
	{
		System.out.println(a);
	}
	
	Ex2a_poly_with_constructor(char z)		//////method m1 with different data type
	{
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Ex2a_poly_with_constructor obj = new Ex2a_poly_with_constructor('A');	//Constructor calling through object creation
		Ex2a_poly_with_constructor obj1 = new Ex2a_poly_with_constructor(10,50);
		Ex2a_poly_with_constructor obj2 = new Ex2a_poly_with_constructor(1);

	}

}
