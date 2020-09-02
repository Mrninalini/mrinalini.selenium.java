package oopsConcept;

public class Ex2b_girl_forParent_polymorphism extends Ex2b_polymorphism_parent{
	
	void marriage()
	{
		System.out.println("Girl-love marriage");
	}
	public static void main(String[] args) {
		Ex2b_girl_forParent_polymorphism obj = new Ex2b_girl_forParent_polymorphism();
		obj.marriage();
	}

}
