package advancejava;

public class myexampleclass1 implements myexampleInterface1 {
	@Override
	public void sub() {
		System.out.println("add");
		
	}
	@Override
	public void mul() {
		System.out.println("multiply");		
	}

	@Override
	public void add() {
		System.out.println("sub");
		
	}

	public static void main(String[] args) {
		
		myexampleclass1 obj =new myexampleclass1();
		obj.add();
		obj.sub();

	}

	

	
}
