package TASK2;
// QUESTION - 1
public class Person {
 String name;// instance Variable
 
 static int age = 30;// static variable initialization
 
 
 void display()// Instance method
 {
	 System.out.println(name + " "+ age);
 }
 
 public static void main(String[]args)
 {
	 Person A = new Person();// object Creation
	 A.name = "Saravana";// initializing the Object name
	
	 A.display();//Since the method is the Instance method, it has to be invoked via Object.
 }
}

/* OUTPUT */

/* Saravana 30 */