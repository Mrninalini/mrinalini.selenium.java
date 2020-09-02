//Types of defining array 
//int x[]={};
//int[] x ={};
//int [] =y;
//int [] y;
//y = new int [5];
//y[0] = 10;
//y[1] = 20;
//y[2] = 30;
//y[3] = 40;
//y[4] = 50;
//pattern print, search a number in array(if statement), largest value in an array.

package coreJava;

public class Ex14c_Array {

	public static void main(String[] args) {
		String  xyz[] ={"qwerty","asdfghjkl","zxcvbnm"};
		int len = xyz.length;
		for (int i =0; i<len; i++)			
		{
			System.out.println(xyz[i]);
		}
		System.out.println("***");
		
		for (int i =0; i<=len-1; i++)	//same a above
		{
			System.out.println(xyz[i]);
		}
	}

}
