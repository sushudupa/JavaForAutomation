package MyPracticeProject;

public class JavaStringMEthodPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String msg = "Welcome to Java Class";
		
		//1. Length String
		System.out.println(msg.length());
		//2. Lower String
		System.out.println(msg.toLowerCase());
		//3. Upper String
		System.out.println(msg.toUpperCase());
		//4. Trim
		String emailID = "sushma.udupa@gmail.com";
		System.out.println(emailID);
		System.out.println(emailID.trim());
		
		System.out.println("*****************************************************");
		
		//5.Concatenate the string
		
		//declare the value
		String Val1 = "Tia ";
		String Val2 = "Tamara ";
		String Val3 = "True ";
		
		System.out.println(Val1 + Val2);
		System.out.println(Val1 + Val2 + Val3);
		System.out.println("Welcome " + Val2 );
		System.out.println(Val1.concat(Val2));
		System.out.println(Val2.concat(Val1).concat(Val3));
		
		
		
		
		
		

	}

}
