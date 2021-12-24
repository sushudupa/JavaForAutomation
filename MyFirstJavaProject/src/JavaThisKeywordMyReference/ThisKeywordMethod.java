package JavaThisKeywordMyReference;

public class ThisKeywordMethod {
	
	//Step 1 = We are using show method
	
	public void show() {
		System.out.println("Show Method is executed");
	}

	//Step 2 = Diplay method is used //Step 3 - then bring 'show()' below 'display()' after typing step 1 and 2 //Step 5 = in the back, the compiler
	//automatically add 'this' word to the 'show' word making it this.show
	
	public void display() {
		this.show();
		System.out.println("Display Method is executed");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Step 4 : Creating the access to 'ThisKeywordMethod'
		ThisKeywordMethod obj = new ThisKeywordMethod();
		obj.display();
		
	}

}
