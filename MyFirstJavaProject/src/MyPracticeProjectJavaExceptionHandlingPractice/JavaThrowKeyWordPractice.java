package MyPracticeProjectJavaExceptionHandlingPractice;

public class JavaThrowKeyWordPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//When we want to stop the execution, at that time we can create our own exception by using "THROW KEYWORD"
		//Use the word throw and add 'new' word next to that and type whatever the exception you want in it
		
		int age = 16;
		
		if(age<18) {
			throw new ArithmeticException("Not a valid age to vote");
		}
		else 
		{
			System.out.println("Valid age to vote");
		}
		
	}

}
