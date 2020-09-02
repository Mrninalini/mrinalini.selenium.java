//static block-Instance -constructor-method(irrespective its sequence while creating a method)

package coreJava;

public class Ex16a_StaticBlock {

	 {
		 System.out.println("Instance block");	//Instance block
	 }
	 
	static {
		System.out.println("Static block");	//static block
	}
	void method1()
	 {
		System.out.println("Method 1");
	 }
	 
	 void method2()
	 {
		 System.out.println("Method 2"); 
	 } 
	 
	 Ex16a_StaticBlock()
	 {
		 System.out.println("Constructor"); //Constructor
	 }
	public static void main(String[] args) {
		Ex16a_StaticBlock obj = new Ex16a_StaticBlock();	//constructor call
		obj.method2();						// method call
		obj.method1();	

	}

}
