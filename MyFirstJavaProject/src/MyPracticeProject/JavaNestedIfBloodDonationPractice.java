package MyPracticeProject;

public class JavaNestedIfBloodDonationPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int age = 25;
		int weight = 55;
		
		if(age>18) {
			if(weight>50) {
				System.out.println("You are eligible to donate blood");
			}
			else 
			{
				System.out.println("You are not eligible to donate blood");
			}
		}
		else
		{
			System.out.println("Age must be greater than 18");
		}
	}
	

}
