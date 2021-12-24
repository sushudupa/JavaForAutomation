package MyPracticeProjectJavaPolymorphismPractice;

//Parent class
public class RBI {
	
	//We are not clicking public void main as it is a parent class
	//If we have a decimal number in the integer, the variable name should be always float
	//We have to write return interest; here.
	
	float interest = 7.60f;
	public float getHomeLoan(float interest) {
		System.out.println("Home Loan interst is " + interest);
		System.out.println("RBI class(parent class) is executed");
		return interest;
	}
	

}
