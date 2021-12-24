package JavaThisKeyword;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Java This Keyword Method
 * Date    - 10/18/2021
 *========================================================================*/


public class ThisKeywordMethod {

	public void show() {
		System.out.println("Show Method is executed");
	}

	public void display() {
		this.show();
		System.out.println("Display Method is executed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordMethod obj = new ThisKeywordMethod();
		obj.display();

	}

}
