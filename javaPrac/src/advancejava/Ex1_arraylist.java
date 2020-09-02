/*Advance java

what is collection?
Collections-(interface)= List and Set

difference between list and set?
List= always cares about insertion order
List =135 +7+4+5+6+3
3 types:array list , linkedlist , vector**

Set = always cares about uniqueness
Set  =135 +7+4+5(no added)+6+3(no added)
set 3 types: hashset , linkedhashset**, treeset**

Map:
maps 3 types: hasmap ,linkedhashmap**, treemap**

1.Array list
can contain duplicate item.
Maintain insertion order.
allow random access
array list DS=> array
array is faster than array list

ArrayList L= new ArrayList();
Difference between  array and array list?
	-array cannot  be modified(add/delete
*/

package advancejava;
import java.util.ArrayList;
import java.util.Collections;

public class Ex1_arraylist {

	//ArrayList<String> Family = new ArrayList<String>();	//define and create array list
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> Family = new ArrayList<String>();	//define and create array list
		Family.add("ABC");	//array list add()
		Family.add("Ranjan");
		Family.add("Child");
		Family.add("Dog");
		Family.add("Friend");
		//System.out.println(Family);
		
		for (int start = 0; start< Family.size(); start++)	//using for loop
		{
			System.out.println(Family.get(start));
		}
		System.out.println(Family.get(1)); //using index printing array- array list get() method
		
		Family.set(2, "child2");
		System.out.println(Family);	//using index setting change set() method
		
		//Family.remove(3);
		System.out.println(Family.remove(3)); //to delete- remove() method
		
		System.out.println(Family); 
		
		System.out.println(Family.size()); //size method
		
		Collections.sort(Family);
		System.out.println("We are sorting data" +Family);	//Sort family - sorting array??????
		
		Family.clear();
		System.out.println(Family);	//clear method
		
	}
}
