package MyPracticeProjectJavaInterfaces;

public class TestingInternetBankingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.st Step: we have to declare the object for the internet banking, because we will be executing and testing the code after
		//adding InternetBanking to the HDFCBank
		
		InternetBanking obj;
		
		//Step 2: We are creating the object instance for RBI
		//While we were adding objects to RBI, it asked us to implement the internetBanking to RBI. 
		//We did that step by implementing InternetBanking to RBI. I have updated the RBI as well.
		obj = new RBI();
		obj.deposit();
		obj.withdrawal();
		obj.balance();
		obj.pinChange();
		
		//Step 3: We are creating the object instance for HDFCBank
		obj = new HDFCBank();
		obj.mobileRegistration();
		obj.moneyTransfer();

	}

}
