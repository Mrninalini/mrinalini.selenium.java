//Polymorphism- Poly(many)+ morphism(form) = the ability to appear in more than one form
//Mrinalini --> methodduaghter(),methodwife(),methodmom().
//method Overloading - Same method name , with diff no of arguments or diff data type ,in same class
//method Overriding - Same method name , same parameter ,in 2 diff class

package oopsConcept;

public class Ex2_polymorphism {

	void m1(int a, int b)	//method m1 with 2 arguments
	{
		System.out.println("a+b");
	}
	
	void m1(int a) ////method m1 with 1 arguments
	{
		System.out.println(a);
	}
	
	void m1(char c)		//////method m1 with different data type
	{
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		Ex2_polymorphism obj = new Ex2_polymorphism();
		obj.m1(10,20);
		obj.m1(50);
		obj.m1('m');

	}

}
