package coreJava;

public class practice {
	
	
	public void myTest() {
		int a =10;
		int b =20;
		int c =a+b;
         System.out.println("sum of two numbers" +c);	
	}
	
	public void myTest2() {
		int a =10;
		int b =20;
		int c =a-b;
         System.out.println("sum of two numbers" +c);	
	}
	
	public class practice2 {
		
		public void myTest2() {
			int a =10;
			int b =20;
			int c =a*b;
	         System.out.println("sum of two numbers" +c);	
		}
	}
	
	public static void main(String[] args) {
		
		practice obj = new practice();
		
		
		
		obj.new practice2();
		obj.myTest();
		obj.myTest2();
		 
		 
			
	}

}
