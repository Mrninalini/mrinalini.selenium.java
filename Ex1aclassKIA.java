//Inheritence 
//class parent
//class child
//class c extend class p
package oopsConcept;

public class Ex1aclassKIA extends Ex1Class1 {

	public void honk()
	{
		
		System.out.println("TEE TEE TEE");
	}
	public static void main(String[] args) {
		Ex1aclassKIA Kiaobj = new Ex1aclassKIA();
		Kiaobj.honk();	
		Kiaobj.CarmethodColor();	//kia object with car method

	}

}
