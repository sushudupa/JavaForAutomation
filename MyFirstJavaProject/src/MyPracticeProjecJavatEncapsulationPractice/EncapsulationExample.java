package MyPracticeProjecJavatEncapsulationPractice;

public class EncapsulationExample {
	
	//HIDING THE DATA USING PRIVATE KEY WORD IS CALLED ENCAPSULATION
	//1.Declaring the variables as private
	
	
	//Here if we change from private to public anyone can access the information. 
	//Hackers can hack the information by creating the object instance and access the above private variables if we make it as public.
	//The way(method) to access the private variable is called encapsulation
	//Encapsulation can be done by using getter setter or setter getter method
	//Do right click - and go to source - then click on generate getter setter method
		
	
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
	
	//If we have to access the variables in encapsulation implementation, then we have to add obj.set key to the object instance we created there
    //We are creating object instance of this encapsulationExample in encapsulation implementation
}
