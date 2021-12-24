package MyPracticeProjectJavaInterfaces;


//1. We are doing 'extends' keyword here to add BankAtmScreen
//2. We added InternetBanking to this as well.
//3. All three(mobile banking, bankAtmScreen and InternetBanking) are interfaces
//4. So we can call other methods which are interface also to this without any problem

public interface MobileBanking extends BankAtmScreen, InternetBanking{

}
