package oopsConcept;

abstract class Ex3a_interface_implement implements Ex3_interface {

	public void m1()
	{
		System.out.println("Printing m1 method");
	}
	
	public static void main(String[] args) {
	//	Interface t = new Interface(); ---> NOT allowed
		
		//Ex3a_interface_imelement obj = new Ex3a_interface_imelement();
		//Class t = new class(); --> allowed
		
		//Ex3_interface obj = new Ex3a_interface_imelement(); //interface reference variable
		//Interface t = new class(); --> Allowed
		//obj.m1();
		//obj.m2();
		//obj.m3();

	}

}
