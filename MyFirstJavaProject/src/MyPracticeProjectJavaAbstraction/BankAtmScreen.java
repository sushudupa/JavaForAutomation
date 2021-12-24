package MyPracticeProjectJavaAbstraction;

public abstract class BankAtmScreen {
	
	//Abstraction: Its a process of hiding the internal implementation details and highlighting/showing only functionality to the user
	//Ways to achieve abstraction class are:
	//1. Abstract class(0-100%)
	//2. Interface(100%)

	//What is abstract class? - A class is declared with the abstract keyword is called abstract class in Java
	//Abstract class can have abstract and non abstract methods
	//Abstract Method: A method which is declared as abstract and does not have implementation is known as an abstract method
	
	//In this program, the code will be in the backend. No one can see the code, so no hackers can hack the bank ATM scree
	
	//In abstract method, there is no code implementation in the class(i removed curly braces after public void deposit(){)
	//method without code implementation is called abstract method
	//We cannot access the code when we add abstract to the method
	
	abstract  void deposit();
	
	abstract void withdrawal();
	
	abstract void balance();
	
	abstract void pinChange();
	
	abstract void mobileRegistration();
		
	//In a class, if atleast one method is abstract means, the entire class should be abstract
	//So we will add the word 'abstract' infront of the "public class abstract BankAtmScreen"
	
	//Now we are adding the normal method, not abstract method. This abstract class can have 0-100% implementation
	//Normal method means =  A method with code implementation(using curly braces { })

	void mimimumStatement() {
		System.out.println("Minimum statement method is displayed");
	}

}
