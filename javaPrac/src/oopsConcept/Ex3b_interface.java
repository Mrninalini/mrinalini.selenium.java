package oopsConcept;

public class Ex3b_interface extends Ex3a_interface_implement { //Inheritance concept is also applicable to interface
	public void m2()
	{
		System.out.println("Printing m2 method");
	}
	public void m3()
	{
		System.out.println("Printing m3 method");
	}
	public static void main(String[] args) {
		Ex3b_interface obj1= new Ex3b_interface();
		obj1.m1();
		obj1.m2();
		obj1.m3();

	}

}
