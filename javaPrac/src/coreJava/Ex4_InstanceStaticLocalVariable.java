package coreJava;

public class Ex4_InstanceStaticLocalVariable {

	int b = 20; //instance variable
	static int c =30; //static variable
	void M1()
	{
		int a =10; //local variable
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(b);
		System.out.println(c);
//		System.out.println(a);
	
		//class object = new class()
		Ex4_InstanceStaticLocalVariable obj = new Ex4_InstanceStaticLocalVariable();
	
		obj.M1();
		System.out.println(obj.b);
		
	}

}
