package JavaInheritanceMyRefrence;

public class CurrentAccount extends Account {
	
	//2.Second Step
	
	public float getRateOfInterest(float interest) {
		System.out.println("The rate of interest is " + interest);
		System.out.println("The Current Account Class is executed");
		return interest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrentAccount personThree = new CurrentAccount();
		
		//1.First Step
		personThree.deposit();
		personThree.withdrawal();
		//2.Second Step
		personThree.getRateOfInterest(4.5f);

	}

}
