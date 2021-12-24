package JavaInterfaces;

public interface MobileBanking extends BankAtmScreen, InternetBanking {

}
//Step 1 = After creating the internet banking interface, we called it to the HDFCBank through 'implements'
//Step 2 = Then it will ask us to add the implementation to the internet banking - money transfer
//Step 3 = when we do the Testing Internet Banking Interface, it asked us to implement internet banking in RBI class as well. It was alreadt there in HDFC Class
//Step 4 = We have to create the object instnace for HDFC Class and after implementing, create one for RBI Class
//Step 5 = After implementing the internet banking in the RBI Class, we dont need to code it at all.
//Step 6= Create Mobile Banking through, go to class and then click interface
//Step 7 = Add extends method to the mobilebanking and add bankAtmScreen and InternetBanking