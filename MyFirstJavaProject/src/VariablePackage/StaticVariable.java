package VariablePackage;

public class StaticVariable {

	//Employee details - instance
			String empNameOne = "Sushma";
			int empIDOne = 12345;
			float empSalaryOne = 123.45f;
			int empMobileOne;
			String empAddressOne;

					
		//Static Variable
		static String companyName = "Google";
		
		public static void main(String[] args) {
		
			//Create the static of the object
			//ClassName objectName = new ClassNameCostructor();
			StaticVariable empOne = new StaticVariable();
			System.out.println("Emplyoee Name is " + empOne.empNameOne);
			System.out.println("Employee ID is " + empOne.empIDOne);
			System.out.println("Employee Salary is " + empOne.empSalaryOne);
			System.out.println("Employee Mobile Number is " + empOne.empMobileOne);
			System.out.println("Employee Address is " + empOne.empAddressOne);
			
			System.out.println("Company Name is " + companyName);
			
				
	}

}
