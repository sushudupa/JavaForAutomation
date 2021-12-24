package MyFirstPackage;

public class JavaStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "Welcome to Java Class";

		//1. Length Method
		System.out.println(msg.length()); 

		System.out.println("*********************************************");

		//2. Lower Case
		System.out.println(msg.toLowerCase());

		System.out.println("*********************************************");

		//3. Upper Case
		System.out.println(msg.toUpperCase());

		System.out.println("*********************************************");

		//4. Trim     
		String emailID = "sushma.udupa@gmail.com ";
		System.out.println(emailID);
		System.out.println(emailID.trim());

		System.out.println("*********************************************");

		//5.Concatenate the string

		//Declare the value
		String Val1 = "Suma ";
		String Val2 = "Rashmi ";
		String Val3 = "Ramya ";

		System.out.println(Val1 + Val2);
		System.out.println(Val1 + Val2 + Val3);
		System.out.println("Welcome " + Val2);
		//Concat
		System.out.println(Val1.concat(Val3));
		System.out.println(Val2.concat(Val3).concat(Val1));

		System.out.println("*********************************************");

		//6.Equals

		/*
		 * ANSI
		 * A to Z = 65 to 90
		 * a to z = 97 to 122 
		 */

		//A. String Comparison

		//1. Two way comparision - True or False
		String Val4 = "Amy";
		String Val5 = "amy";

		System.out.println(Val4 == Val5); //OR
		System.out.println(Val4.equals(Val5));
		System.out.println(Val4.equalsIgnoreCase(Val5));

		System.out.println("*********************************************");

		//7. Three way comparison - It compares the given string with the current string index based.

		/*
		 * String 1 = String 2 -> 0
		 * String 1 = String 2 -> +ve
		 * String 2 = String 2 -> -ve
		 */

		String Val6 = "Anu";
		String Val7 = "anu";

		System.out.println(Val6.compareTo(Val7));
		System.out.println(Val7.compareTo(Val6));
		System.out.println(Val7.compareToIgnoreCase(Val7));

		System.out.println("*********************************************");

		//8.CharAt Method

		String CourseID = "Automatin course ID - 124321";

		System.out.println(CourseID.charAt(5));
		System.out.println(CourseID.charAt(8));

		System.out.println("*********************************************");

		//9. IndexOf Method

		System.out.println(CourseID.indexOf('m'));
		System.out.println(CourseID.indexOf('t'));
		System.out.println(CourseID.indexOf('t',5));

		System.out.println("*********************************************");

		//10. Contains

		System.out.println(CourseID.contains("124321"));
		System.out.println(CourseID.contains("124322")); // just changed last digit, answer is wrong

		System.out.println("*********************************************");

		//11. SubString

		String Transaction = "Transaction of Sushma is 2345-1234-5678";

		System.out.println(Transaction.indexOf('S'));
		System.out.println(Transaction.substring(15));
		System.out.println(Transaction.substring(15,20));
		System.out.println(Transaction.substring(15,21));

		System.out.println("*********************************************");

		//12. Replace Method

		String wcmsg = "Welcome to ICICI Bank";
		String updateMsg = wcmsg.replace("ICICI", "SBI");

		System.out.println(wcmsg);
		System.out.println(updateMsg);

		System.out.println("*********************************************");

		//Handling the Special Characters

		//String text = "Welcome to Selenium Class";
		String text = "Welcome to \"Selenium Class\"";
		System.out.println(text);

		System.out.println("*********************************************");





	}

}
