package JavaInheritanceMyRefrence;

public class Account {
	
	//Parent Class
	
	public void deposit() {
		System.out.println("Money is deposited");
		System.out.println("Account Class is executed");
	}
   
	public void withdrawal() {
		System.out.println("Money is withdrawn");
		System.out.println("Account class is executed");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account parent = new Account();
		parent.deposit();
		parent.withdrawal();
				

	}

}
