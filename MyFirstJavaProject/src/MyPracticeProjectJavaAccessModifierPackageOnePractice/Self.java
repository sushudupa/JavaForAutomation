package MyPracticeProjectJavaAccessModifierPackageOnePractice;

//TYPES OF ACCESS MODIFIERS:
//a. Private - Self
//b. Defau;t - Family
//c. Protected - Relatives
//d. Public - Neighbours

public class Self {
	//1.We are making everything as a public
	
	public void bankName() {
		System.out.println("Having the account in Citi");
	}
	//After coding all classes(self, family, relative and neighbor), we took out public and added private.
	//So we got the error in neighbor class
	protected void loanDetails() {
		System.out.println("50 Lakhs Home Loan in Citi Bank");
	}
    //We are removing the word public for default access modifier. There is no key word for default
	 void atmPassword() {
		System.out.println("1234 is ATM password");
	}
	//Changing from public to private
	private void internetBanking() {
		System.out.println("xyz is Internet Banking Password");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Accessing all the information within the class. This 'self' is an instance method. so we have to create the object instance
		
		Self obj = new Self();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		obj.internetBanking();
		
		//TPRIVATE: - ACCESS MODIFIER - It is accessible only within the class
		
		

	}

}
