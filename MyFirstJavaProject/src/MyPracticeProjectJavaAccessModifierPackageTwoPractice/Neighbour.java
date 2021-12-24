package MyPracticeProjectJavaAccessModifierPackageTwoPractice;

import MyPracticeProjectJavaAccessModifierPackageOnePractice.Self;

public class Neighbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. We have to create th object instance for Self class
		Self obj = new Self();
		
		//2.After creating the object instance, we have to import self clas by mouse hovering
		obj.bankName();
		//obj.loanDetails();
		//obj.atmPassword();
		//obj.internetBanking();
		
		
		//PUBLIC - ACCESS MODIFIER : IT is accessible everywhere. It has the widest scope among all other modifiers
		//obj.loanDetails(); :It can be only accessed throgh inheritance and not by creating object instance if at all we want to access this class
		//When we changed the code access from public to private in self class, the loanDetails started getting errors, saying loan details
		//cannot be accessed by neighbours
		//After removing the public from the code, the atmPassword cannot be accessed by neighbours
		//There is no code to change from public to default. Just delete the word public and it becomes automatically default
		//Once we change the code from public to private in self class, the internetBanking cannot be accessed by the neighbour class

	}

}
