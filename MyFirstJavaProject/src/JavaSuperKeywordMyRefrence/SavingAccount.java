package JavaSuperKeywordMyRefrence;

//SUPER KEYWORD = Is a reference variable whish is used to refer immediate parent class object

//Step 3 - Add 'extends' to the savingaccount from account

public class SavingAccount extends Account {
 //Step one = Bring everything from the account class to this saving class
	
	String name = "Saving Account Class - Child";
	public void display() {
		System.out.println("Saving Account Class (child) is executed");
		System.out.println("The variable value is " + name);
		
		//5. Step 5 = Implementing the Super Keyword
		System.out.println("The Variable value is " + super.name);
	}

   //3. Step 3 - adding 'show'	to read a method and then add obj.show() as shown below
	public void show() {
		display();
	//4. Step 4 = here adding the word 'super' in front of display means direct access to the parent class(it refers to the immediate parent)
		super.display();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Step 2 -Create an object
		SavingAccount obj = new SavingAccount();
		obj.display();
		obj.show();
	}

}
