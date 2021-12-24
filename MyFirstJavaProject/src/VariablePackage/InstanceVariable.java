package VariablePackage;

  public class InstanceVariable {

		//1. Instance Variable
		//2. Static Variable
		//3. Local Variable

		//1. Instance Variable

		//Employee details - instance
		String empNameOne = "Sushma";
		int empIDOne = 12345;
		float empSalaryOne = 123.45f;
		int empMobileOne;
		String empAddressOne;

		public static void main(String[] args) {

			//Create the instance of the object
			//ClassName objectName = new ClassNameCostructor();
			InstanceVariable empOne = new InstanceVariable();
			System.out.println("Emplyoee Name is " + empOne.empNameOne);
			System.out.println("Employee ID is " + empOne.empIDOne);
			System.out.println("Employee Salary is " + empOne.empSalaryOne);
			System.out.println("Employee Mobile Number is " + empOne.empMobileOne);
			System.out.println("Employee Address is " + empOne.empAddressOne);


		}

	}
