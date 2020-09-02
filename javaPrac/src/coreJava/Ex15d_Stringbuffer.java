package coreJava;

public class Ex15d_Stringbuffer {
	
	public static void main(String[] args) {
		StringBuffer ab = new StringBuffer("India");	//string buffer
		System.out.println(ab);
		System.out.println(ab.reverse()); //string buffer method to reverse a string
		System.out.println(ab.length());
		System.out.println(ab.capacity());
		
		System.out.println("*******");
		
		/*StringBuilder ab2 = new StringBuilder("India");  //String builder
		System.out.println(ab2);
		System.out.println(ab2.reverse());  //string buffer method to reverse a string
		System.out.println(ab2.length());	//Length of string
		System.out.println(ab2.capacity()); //Capacity of string*/
		
		String s1 = "Hello mam";
		String xyz [] = {s1};
		
		for(int i=0; i<=xyz.length; i++)
		{
			System.out.println("String :" +xyz);
		}
		// have to use array + loop+ reverse
		//char[] xyz = s1.toCharArray();
	}
}