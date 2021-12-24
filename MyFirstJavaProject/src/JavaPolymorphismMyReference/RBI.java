package JavaPolymorphismMyReference;




public class RBI {
		float interest = 7.60f;
		
		public float getHomeLoan(float interest) {
			System.out.println("Home Loan Interest " + interest);
			System.out.println("RBI Class(parent) is executed");
			return interest;
		}
	}