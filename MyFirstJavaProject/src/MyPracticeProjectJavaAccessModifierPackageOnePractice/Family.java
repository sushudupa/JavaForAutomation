package MyPracticeProjectJavaAccessModifierPackageOnePractice;

public class Family {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Access Modifier method is within the package outside the class
		//We can access the 'self' class through inheritance concept or we can access through object instance fot the class
		
		Self obj = new Self();
		obj.bankName();
		obj.loanDetails();
		obj.atmPassword();
		//obj.internetBanking();
		
		//DEFAULT = ACCESS MODIFIER - It is accessible only within package. It cannot be accessed from outside the package
		//Once we change the code from public to private in self class, the internetBanking cannot be accessed by the family class
		
	}

}
