package JavaEncapsulationMyReference;


public class EncapsulationImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1. Create the object instance
		
		EncapsulationExample obj = new EncapsulationExample();
		
		//Step 2 = We just did "get" method through getter and setter, so in this step we will be doing "Set" method(calling all variable)
		
		obj.setName("Pranav");
		obj.setEmpNum(12324);
		obj.setAge(30);
		obj.setMobNum(233234345);
		
		//Step 3 = These values(name, empNum, age, mobNum) will go the encapsulation example code and do some more coding in the backhand and 
		//return the value. we have to write the sysout message by using "get" method and the display message will be success
		
		System.out.println(obj.getName());
		System.out.println(obj.getEmpNum());
		System.out.println(obj.getAge());
		System.out.println(obj.getMobNum());

	}


}
