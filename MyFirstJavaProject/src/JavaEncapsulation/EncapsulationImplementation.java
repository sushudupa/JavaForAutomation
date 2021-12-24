package JavaEncapsulation;

/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Encapsulation = Encapsulation Implementation
 * Date    - 10/19/2021
 *========================================================================*/


public class EncapsulationImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EncapsulationExample obj = new EncapsulationExample();
		obj.setName("Pranav");
		obj.setEmpNum(2343);
		obj.setAge(30);
		obj.setMobNum(232343223);
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpNum());
		System.out.println(obj.getAge());
		System.out.println(obj.getMobNum());

	}

}
