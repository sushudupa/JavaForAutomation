package MyPracticeProjectJavaSuperKeywordPractice;

//SUPER KEYWORD = Is a reference variable whish is used to refer immediate parent class object
//SUPER KEYWORD = Is used in subclasses to access superclass member(attributes, constructors and methods)
//USAGE OF SUPER KEYWORD
//A. To refer immediate parent class instance variable
//B. To invoke immediate parent class method
//C. To invoke immediate parent class constructor


//Step 3 - Add 'extends' to the savingaccount from account

public class SavingAccount extends AccountClass{
	
	//Coding wise its same as the account class.
	//Saving Account is a child class
	//Step 1 = Bring everything from the account class to this saving class
	
	String name = "Saving Account Class - Child";
	//We have to create a method
	public void display() {
		System.out.println("Saving Account Class(child) is executed");
		System.out.println("The variable value is " + name);
		//The above code refers to the child class = System.out.println("The variable value is " + name);
		
		//Step 6: Implementing the Super Keyword
		//USES OF SUPER KEYOWRD - REFRENCE FOR POINT A - To refer immediate parent class instance variable
		//Below code is in reference to the parent class because we added super keyword.
		
		System.out.println("The variable value is " + super.name);
	}
	
	//Step 3: we are creating one more method called public void show();. And call the method by adding display, it shows the child method only
	
	public void show() {
		display();
		
		//Step 5: If we just want to call the parent class and not the child class means, we have to use the word "Super" infront of display
		//here adding the word 'super' in front of display means direct access to the parent class(it refers to the immediate parent)
		super.display();
		//B. To invoke immediate parent class method = USES OF SUPER KEYWORD = super.display() = reference for point B
		
		//The result we get after the execution is: Account Class(parent) is executed and The variable value is Account Class - Parent
		//But we get both results: child and parent. Child account will be overrided by the parent class because we used "super" keyword
		//We will see child class and parent class results together. 1st. child class  2nd. parent class.
		//Child class result displayed is without super keyword - here overriding method used
		//Parent class result displayed is with super keyword - here no overrriding method. the result displayed is what we want.
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 2: create the object instance for saving account to call the method from the step 1
		//When we run the program by using obj.display, we get the result from the child class as:
		//Saving Account Class(child) is executed and The variable value is Saving Account Class - Child
		
		SavingAccount obj = new SavingAccount();
		obj.display();
		
		//Step 4: then we are calling show method by using object instance. Result displayed :Saving Account Class(child) is executed and
		//The variable value is Saving Account Class - Child
		//We are getting the same messages for both objects(display and show) because of overriding concept. 
		obj.show();
		
		
		//Just for the reference for the 3rd point in uses of super key word: //C. To invoke immediate parent class constructor
		//If we add 'super' keyword in front of the SavingAccount() while calling the constuctor, we get the parent class
		//SavingAccount obj = new Super.SavingAccount();
		//We are not using this in this program as it is too complicated
	}

}
