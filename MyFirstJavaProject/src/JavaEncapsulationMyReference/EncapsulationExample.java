package JavaEncapsulationMyReference;

public class EncapsulationExample {
	
	//HIDING THE DATA USING PRIVATE KEY WORD IS CALLED ENCAPSULATION
	
	 // Step 1 = Declaring the variable as private
	
	private String name; //If you change this from private to public, anyone can access this through obj instance. so keep it private
	private int empNum; //If you change this from private to public, anyone can access this through obj instance, so keep it private
	private int age;
	private int mobNum;
	
	//Step 2 - Right click and then go to source and then click genetate getter and setter method. Then select all and then click generate

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobNum() {
		return mobNum;
	}
	public void setMobNum(int mobNum) {
		this.mobNum = mobNum;
	}
	
	
}
