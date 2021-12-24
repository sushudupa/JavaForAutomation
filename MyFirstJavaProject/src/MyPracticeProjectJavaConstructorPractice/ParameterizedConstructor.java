package MyPracticeProjectJavaConstructorPractice;

public class ParameterizedConstructor {
	
	//If the color printed in blue, it means instance variable
	//If the color printed in brown, it means local variable
	//Sometimes we have to pass the value in the constructor, that is called parameterized constructor
	//ParameterizedConstructor name is exactly the same name for class(ParameterizedConstructor)
	//Here, 'n' represents empName and 'i' represents empID
	//If we do not create the constructor during runtime, the default constructor will be created
	//If we want a specific values to the constructor means, then we have to create the constructor
	
	//Step one:Assigning the values
	//Instance variable
	String empName;
	int empID;
	
	ParameterizedConstructor(String n, int i){
		empName = n;
		empID = i;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 2: after assigning all the values, that is string and int, we will write the object constructor
		//Once we write the object constructor, we will get red color underline in = new ParameterizedConstructor()
		//It asks us to enter the arguments, that is string and int inside the bracket
		//Then we have to enter the values in the brackets. that is ()
		
		ParameterizedConstructor obj = new ParameterizedConstructor("Sushma", 12345);
		System.out.println(obj.empName);
		System.out.println(obj.empID);

	}

}
