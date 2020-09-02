//length(),concat(), toupperCase(),toupperCase, Indexof()
//charAt-return char at index
//startWithS
//endsWith
//equals --address same
//compare to
//== : compare value
//= : assign
//string buffer

package coreJava;

public class Ex15c_String {

	public static void main(String[] args) {
		int a =10;
		int b = 20;
		int sum = a+b;
		System.out.println("Sum: " +sum);
		
		System.out.println("******1");
		
		String x = "10";	//way of writing string
		String y = "20";
		System.out.println("String :" +x+y);
	
		System.out.println("******2");
		
		String t = "Hello";	//way of writing string
		String v = "Hello";
		System.out.println(t==v);
		System.out.println(t.equals(v));
		System.out.println(t.compareTo(v));
		System.out.println(v.charAt(0)); //shows char of a string at 0th index:H
		
		System.out.println("******3");
		
		String k = "Hello";	
		String l = "Namaste";
		System.out.println(k==l);
		System.out.println(k.equals(l));
		System.out.println(k.compareTo(l)); 
		
		String str = "Hello world, welcome to the universe.";
		Boolean n = str.endsWith("universe.");	//ends with particular suffix
		Boolean tf = str.startsWith("Hello");	//Starts with particular suffix
		System.out.println(n);
		System.out.println(tf);
	}

}
