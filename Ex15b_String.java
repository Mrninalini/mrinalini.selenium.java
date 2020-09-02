package coreJava;

public class Ex15b_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FN ="Rohit Sharma is a good boy";
		//String LN = "Sharma";
		
		//System.out.println(FN +"" +LN); //way to print
		//System.out.println(FN.concat(LN));	//way to print with concat
	
		System.out.println(FN.indexOf("S")); //to find the place of value of char
		System.out.println(FN.indexOf("is")); //to find the place value of string
	}

}