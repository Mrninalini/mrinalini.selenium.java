//Error handling - exception handling
//try - error code
// catch -handle error
//finally - must execute
//throw- throw exception from any method
//throws- indicate what which  exception can possibly be throw by this method 
//throws in automation
//checked exception , unchecked exception, runtime exception(arithmetic and array out)

package oopsConcept;

public class Ex4ExceptionHandling {
	
	static int [] arr = {1,2,3,4};
	
	public static void main(String[] args) {
		
		try{
		System.out.println(arr[10]); //to print the index of arr at 10th position
		//System.out.println(arr[0]); //to print the value at 0th place for arr
		}
		catch (Exception e){
			System.out.println("Please enter correct array");
		}
		finally
		{
			System.out.println(arr[0]);
		}
	}

}
