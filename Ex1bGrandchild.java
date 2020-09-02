//class a 
//class b extends a
//class c extends b

package oopsConcept;

public class Ex1bGrandchild extends Ex1b_child {
	
	public void toys()
	{
		System.out.println("car toys");
	}

	public static void main(String[] args) {
		Ex1bGrandchild gcobj = new Ex1bGrandchild();
		gcobj.job();
		gcobj.cash();
		gcobj.Car();
		gcobj.toys();
	}

}
