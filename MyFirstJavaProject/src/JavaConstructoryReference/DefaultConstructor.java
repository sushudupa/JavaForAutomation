package JavaConstructoryReference;

public class DefaultConstructor {
	
	//1. Step = Assingning the value
	
	String name;
	int empID;

	//2. Second Step : Constructor name should be same as its class name. Its written by the programmer. Its not visible to us. This is how it looks.
	//This is for our reference
	
	DefaultConstructor(){
	   System.out.println("Constructor is executed first");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1:
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println(obj.name);
		System.out.println(obj.empID);
	}

}
