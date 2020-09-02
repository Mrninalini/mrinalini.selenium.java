package testing.examples;

import java.util.ArrayList;

public class test1 {
	
	public void jvaClassTest() {
		
		String a = "green";
		
		ArrayList<Object> ar = new ArrayList<Object>();
		ar.add("seven");
		ar.add("que");
		ar.add("green");
		ar.add("four");
		ar.add("myCode");
		
		
		if(ar.contains(a)) {
			System.out.println("Number is found at index"  +ar.indexOf(a));

		} else {
			System.out.println("Number is not found");
		}
	}

	public static void main(String[] args) {
		
		test1 obj = new test1();
		obj.jvaClassTest();
		
	}

}
