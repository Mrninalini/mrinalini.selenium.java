//final keyword is used to prevent inheritance(values can not be modified in the future).
//this keyword is used to access the values initialize in child class(this class)
//super keyword is used to access the values initialize in Parent class(super class)
//parent class constructor
//parent class -> methods,blocks,constructor,variables

package oopsConcept;
		
    //final class Ex_child extends Ex_parent{
	public class Ex1b_child extends Ex1_Inheritence_parent{
		
		int Rupee = 100 ;
		int coins = 10;
		
		Ex1b_child()		//constructor
		{
		System.out.println("Child metro ticket after 5 years");	
		}
		
	public void job()
	{
	System.out.println("slenium java class");	
	}
	
	{
		System.out.println("This is child class Block"); //Block
	}
	public void method1()
	{
		System.out.println(this.coins);		//Child class
		System.out.println(this.Rupee);		//Child class
		System.out.println(super.coins);	//Parent class
		System.out.println(super.Rupee);	//Parent class
	}
	
	public static void main(String[] args) {
		Ex1b_child childobj = new Ex1b_child();
		childobj.job();	
		childobj.property();
		childobj.cash();
		childobj.Car();
		childobj.jwellery();
		childobj.method1();
	}

}
