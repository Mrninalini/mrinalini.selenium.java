//Blocks are two type of instance and static
//Instance is used to write a logic during object
//Instance -constructor-method(irrespective its sequence while creating a method)

package coreJava;

public class Ex16_Blocks {
	
	 void method1()
	 {
		System.out.println("Method 1");
	 }
	 
	 void method2()
	 {
		 System.out.println("Method 2"); 
	 }
	 
	 Ex16_Blocks()
	 {
		 System.out.println("Constructor"); 
	 }
	 
	 {
		System.out.println("Instance block");	//Instance block
	 }
	public static void main(String[] args) {
		Ex16_Blocks obj = new Ex16_Blocks(); //Constructor call
		obj.method2();						// method call
		obj.method1();						// method call
		
	}

}
