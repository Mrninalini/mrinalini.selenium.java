package coreJava;

public class Ex15a_String {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		String name = "RohitSharma";	//String Literal-->String Constant pool-->[RS]=N1,N2
		String sobj = new String("ShikarDhawan");	//String Obj-->Heap Memory-->[P1-RS],[P2-RS]
		System.out.println(name);
		System.out.println(name.toLowerCase());	//Lower case
		System.out.println(sobj);
					
		//length of a string
		System.out.println(name.length());
		System.out.println(sobj.length());
				
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		System.out.println(alpha.length());
		System.out.println(alpha.toUpperCase());	//upper case
		System.out.println(alpha.equalsIgnoreCase(alpha));	//Compares this String to another String, ignoring case considerations. 
	}
}
