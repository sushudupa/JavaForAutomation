package MyPracticeProjectJavaInheritancePractice;

public class Account {
	
	public void deposit() {
		System.out.println("Money is deposited");
		System.out.println("Account class is executed");
	}
	
	public void withdrawal() {
		System.out.println("Money is withdrawn");
		System.out.println("Account class is executed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//OOPS concept - OOps, concepts in java is to improve code readability and reusability by defining a Java program efficiently
		//The main principles of object-oriented programming are abstraction, encapsulation, inheritance, and polymorphism.
		//OOPS = object oriented programing structure
		//1. Inheritance - When one object accquires all the properties(methods, variables) and behaviour of parent object
		//Inheritance represents Is-A relationship, known as parent child relationship
		//Inheritance uses 'Extends' key words to call the super or parent class
		//Uses of inheritance in Java = code reusablility and method overriding(so run time polymorphism can be achieved)
		//Types of Inheritance A. Single level (Account and Saving account(parent and child))
		//This Single level inheritance method is a user defined method. So we have to create the method above main method so it is accessible to anyone
		//Creating a method just using 'public void' means no return type (no values are returned)
		//The above code is instance or non-static method, so to call them to the main method, we have to create the object constructor
		
		//Creating the object constructor
		//ClassName object = new ClassName();
		Account parent = new Account();
		
		parent.deposit();
		parent.withdrawal();
	
		
		
		
		
		
 
	}

}
