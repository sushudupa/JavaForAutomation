package JavaConstructoryReference;

public class ParameterizedConstructor {
	
	//Step 1: Assingning the values
	//Instance Variable
	String empName;
	int empID;
	
	ParameterizedConstructor(String n, int i){
		empName = n;
		empID = i;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParameterizedConstructor obj = new ParameterizedConstructor("Sushma", 12345);
		System.out.println(obj.empName);
		System.out.println(obj.empID);
		
		
		
	}

}
