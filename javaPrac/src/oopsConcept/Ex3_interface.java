/*Abstraction- process of highlighting the set of services and hiding the implementation 


 * abstract void M1();
 * hiding internal details and describing things in simple terms
 * use abstract keyword and does not have method body

Abstract class; keyword at class level +one or more abstract method

Abstract class test{
void m1();
void m2();
abstract void m3();
}


*Encapsulation: wrapping of data(code+methods+variable+constructor+blocks) in a single unit
this is used to implement abstraction

 * Interface - eg:calculator
type of class and it contains only abstract method(un-implemented methods)
Interface call
{
add(); guarav
sub(); mrinalini
mul(); sachin
div(); tina
}
Each an every interface by is Abstract, hence it is not possible to create the object of class
all method are abstract class is called interface
contains only abstract methods
it gives functionality but does not give internal implementation.
by default methods are public
by default variables are public
*we use interface and implement keyword 
*we can create reference variable of type interface class
*
Interface reference variable - Interface is able to hold implementation of class object
  Interface Obj = new ClassName();
= if a class has not implemented all the methods of interface then we have to either create that class as abstarct class 
  or have to implement all the methods of interface.
  Inheritance concept is also applicable to interface
  
Interface -----> abstract Class1 (implement -m1) ----> Class2 extends Class 1--->Class 2 Obj

= inheritance concept is also applicable to interface

Interface t = new Interface(); ---> NOT allowed
Interface t = new class() --> Allowed
//Class t = new class(); --> Allowed

WebDriver d = new chromeDriver();

NOTE: We cannot initiate /create object of an interface
*/

package oopsConcept;

interface Ex3_interface {

	void m1();
	void m2();
	void m3();
	
}
