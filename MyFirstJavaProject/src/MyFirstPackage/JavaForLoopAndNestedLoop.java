package MyFirstPackage;

public class JavaForLoopAndNestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//5. Descending order for loop



		//program to print from 10-1

		//syntax : for(initialization;condition;increment/decrement)
		for(int num=10; num>=1; num--) {System.out.println(num);}
		System.out.println("*************************************");


		//nested for loop

		for(int num1=10; num1>=1; num1--) {
			for(int num2=10; num2>=1; num2--) {	System.out.println(num1 + "-" + num2);}
		}
	}

}
