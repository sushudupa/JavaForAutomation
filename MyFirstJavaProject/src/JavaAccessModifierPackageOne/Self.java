package JavaAccessModifierPackageOne;
/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Access Modifier Package One - Self
 * Date    - 10/19/2021
 *========================================================================*/


public class Self {

	// Public - Access to all of them 
	public void bankName() {
		System.out.println("Having account in HDFC Bank");
	}
	// Protected - Access within package and outside package using inheritance
	protected void loanDetails() {
		System.out.println("50 Lakhs Home Loan in HDFC Bank");
	}
	// Default - Access to only within the package 
	void atmPassword() {
		System.out.println("1234 is ATM Passowrd");
	}
	// Private - Access only within the class
	private void internetBanking() {
		System.out.println("xyz is Internet Banking Password");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Self obj = new Self();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		obj.internetBanking();


	}

}
