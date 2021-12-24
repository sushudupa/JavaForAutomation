package JavaEncapsulation;
/*========================================================================
 * Author - Sushma Prasad
 * Project - NxtGen AI Academy
 * Purpose - Encapsulation = Encapsulation Example
 * Date    - 10/19/2021
 *========================================================================*/


public class EncapsulationExample {
	
	 // Declaring the variable as private
	
	private String name;
	private int empNum;
	private int age;
	private int mobNum;
	
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
