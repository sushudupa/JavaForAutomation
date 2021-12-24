package MyPracticeProjectThisKeyWordPractice;

public class ThisKeywordMethod {

	//1. Creating the method here.
	//Show and Display are methods
	//If we dont put public infront of void, it becomes default. SO it is always advised to put public void
	
	public void show() {
		System.out.println("Show method is displayed");
	}
	
	//setp 2: here We have to call show method after writing both show and display methods
	public void dispaly() {
		this.show();
		System.out.println("Display method is displayed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 3: WE have to call ThisKeywordMethod method here. This is a static(Default contructor), so no need to call the parameter.
		//Default contructor: no parameters(arguments) - Type of constructor : ClassName object = new ClassName();
		
		//When we enter obj.display, this obj.display will call the =  public void display() method, and this display method calls public void show() method
		//Then again it calls the display method from show method, because we have entered the obj.display
		//So whatever it is mentioned in the obj.dispaly, that message will also show along with the "show" message when we execute the program
		//Even if we forget to add 'this' next to 'show' in the above coding line, the compiler will add it on its own. but, we are adding here
		
		//"StaleElementException" is the error name we get in Selenium when this code is not executing properly
		
		//We are calling two methods here, one is display and display method is calling show method
		
		//If instance variable and parameters have the same name. then we use "thiskeyword" program or code
		
		ThisKeywordMethod obj = new ThisKeywordMethod();
		obj.dispaly();

		
		
		
		
	}

}
