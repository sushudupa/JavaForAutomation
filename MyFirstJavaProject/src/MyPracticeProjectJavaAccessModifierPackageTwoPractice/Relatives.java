package MyPracticeProjectJavaAccessModifierPackageTwoPractice;

import MyPracticeProjectJavaAccessModifierPackageOnePractice.Self;

public class Relatives extends Self{

	//1.This is the inheritance concept, so we use 'extends' keyword next to relatives. We will be extending Self class here
	//After using key word extends, it asks us to import Self. We have to do mouse hover action on Self
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2.We have to create the object instance for relatives
		
		Relatives obj = new Relatives();
		obj.bankName();
		obj.loanDetails();
		//obj.atmPassword();
		//obj.internetBanking();
		
		//PROTECTED - ACCESS MODIFIER : It is accessible within the package and outside the package but through inheritance only
		//Even with the inheritance, we cant use the atmPassword, once we change the code from default in the Self Class
		//Once we change the code from public to private in self class, the internetBanking cannot be accessed by the relatives class

	}

}
