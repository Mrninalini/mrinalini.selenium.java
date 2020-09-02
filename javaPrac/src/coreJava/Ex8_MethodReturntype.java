package coreJava;

public class Ex8_MethodReturntype{		//Function
void Add()
{
	int a = 10;
	int b = 20;
	int sum = a+b;
	System.out.println(sum);
}
void Subtract()
{
	int a = 40;
	int b = 20;
	int Sub = a-b;
	System.out.println(Sub);	
	}
void Multiply()
{
	int a = 10;
	int b = 20;
	int Mul = a*b;
	System.out.println(Mul);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//class object= new class
		Ex8_MethodReturntype Cal = new Ex8_MethodReturntype(); //object creation
		
		//objectname.methodname
		Cal.Multiply(); //calling method
		Cal.Add(); //calling method
		Cal.Subtract(); //calling method
	}

}
