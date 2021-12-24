package MyPracticeProjectJavaConstructorPractice;



public class DefaultConstructor {
	
	//Instance Variable
	//Step 1: Assigning the values
	
	String name;
	int empID;
	
	//If we have to write the constructor means, the name should be exact same as the class name, i.e., DefaultConstructor
	//This step is done after creating the : DefaultConstructor obj = new DefaultConstructor() below and assinging the values to the sysout below
	
	DefaultConstructor(){
		System.out.println("Constructor is executed first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Java Constructor: Its a special type of method that is used to initialize the object
		//Every time an object is created using the new() keyword, at least one constructor is called
		//Memory for the object is allocated in the RAM is called constructor or memory allocation is done by the constructor
		//Till now we were doing default constructor
		//1.Default contructor: no parameters(arguments) - Type of constructor : ClassName object = new ClassName();
		//2.Parameterized construcor: Have parameters- means passing the value inside the bracket : Actions action = new Actions(driver);
		//Rules of declaring constructor:
		//a.constructor must be the same name as the class name
		//b. constructor must have no expicit return type
		//c. constructor cannot be abstract, final, static and synchronized
		
		
		//Step 1: Creating the object constructor
		//To access the above value, we should create the instance of the object
		//The result we get after running the program is null and 0. The result is given by the constructor(programmer)(which was already there)
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println(obj.name);
		System.out.println(obj.empID);
		
		
		

	}

}
