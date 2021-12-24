package MyPracticeProject;

public class JavaStringBuiltInMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String msg = "Welcome to Java Class";

		//1. Length() Method
		System.out.println(msg.length());

		System.out.println("******************************************************************");

		//2. toLowerCase() Method
		System.out.println(msg.toLowerCase()); //Email id is the only thing in web that accepts lower case only. No upper case is allowed

		System.out.println("******************************************************************");

		//3. toUpperCase() Method
		System.out.println(msg.toUpperCase());

		System.out.println("******************************************************************");

		//4. Trim() Method
		String emailID = "sushma.udupa@gmail.com ";
		System.out.println(emailID); //This one is printing email id as it is typed along with the space at the end
		System.out.println(emailID.trim());//This one is printing email id by trimming the space at the end.

		//Disadvantage of this trim is = Trim will not remove the space if it is given in the middle of email id. it only
		// removes the starting and end space in the email id

		System.out.println("******************************************************************");

		//5.Concatenate the string Method

		//Declare the value
		String val1 = "Sushma ";
		String val2 = "Sihi ";
		String val3 = "Saahasi ";
		String val4 = "Prasad ";

		System.out.println(val1 + val2); //+ is one way of ding concatenate, but it is not advisable as people will get confused
		System.out.println(val3 + val4);
		System.out.println(val1 + val2 + val3 + val4);

		//Concatenate
		System.out.println(val1.concat(val4));
		System.out.println(val2.concat(val3).concat(val1));
		System.out.println(val4.concat(val2).concat(val3).concat(val1));

		//Adding message along with concat
		System.out.println("Welcome " + val2);
		System.out.println("Good Morning " + val1);

		System.out.println("******************************************************************");

		//6.Equals

		/*
		 * ANSI
		 * A to Z = 65 to 90
		 * a to z = 97 to 122 
		 */

		//String comparision
		
		//Two way comparision = true or false

		//6. equals() Method - This method returns true if the String are equal; false otherwise

		String val5 = "Rashmi";
		String val6 = "rashmi";

		System.out.println(val5 == val6);
		System.out.println(val5.equals(val6));
		System.out.println(val5.equalsIgnoreCase(val6)); //In this case, it doesnt matter if the value is differnt(val5 and val6)
		
		System.out.println("**********************************************************************");

		// Three Way Comparison
		
		// 7. compareTo() Method- It compares the given string with current string index 
		//based(order). It returns positive number, negative number or 0

		/*
		 * String 1 = String 2 -> 0
		 * String 1 > String 2 -> +ve value
		 * String 1 < String 2 -> -ve value
		 * 
		 */
      
		String val7 = "Sihi";
		String val8 = "sihi";
		
		System.out.println(val7.compareTo(val8));
		System.out.println(val8.compareTo(val7));
		System.out.println(val7.compareToIgnoreCase(val8));
		
		System.out.println("************************************************************************");

		//Index number counting always starts with zero.
		// 8. charAt() Method - Return the character of the mentioned index value.
		
		String courseID = "Automation Course ID - 567654";
		
		System.out.println(courseID.charAt(9));
		System.out.println(courseID.charAt(14));
		
		System.out.println("*********************************************");
		
		//9. IndexOf() Method
		System.out.println(courseID.indexOf('A'));
		System.out.println(courseID.indexOf('a'));
		System.out.println(courseID.indexOf('C'));
		System.out.println(courseID.indexOf('t', 5));
		System.out.println(courseID.indexOf('o', 7));
		
		System.out.println("*******************************************************");
		
		//10. contains() - Return true if the string contains specific characters
		System.out.println(courseID.contains("567654"));//The course id number is same as the above id number. output is true
		System.out.println(courseID.contains("567655"));//This course id value is different from the original one. so output is false
		
		System.out.println("***************************************************************");
		
		// 11. substring() - It returns a part of the string.
		
		String Transaction = "Transaction of Sushma is 2345-1234-5678";
		
		System.out.println(Transaction.indexOf('S'));
		System.out.println(Transaction.substring(15)); //Here the counting always starts with zero, so the output starts at #15 i,e S
		System.out.println(Transaction.substring(15, 20)); //Here 'a' is not included in the end of my name because we gave #20 instead of 21.
		//It counts all the way upto the space to retreive full value. 
		System.out.println(Transaction.substring(15, 21)); //We included #21 count including space after name Sushma. 
		//It is also called as n-1(minus) ending index.
		System.out.println(Transaction.substring(25));
		
		System.out.println("*******************************************************************");
		
		// 12. replace() - A string replacing all the old character/word
		String wcmsg = "Welcome to HFCU";
		String updateMsg = wcmsg.replace("HFCU", "ICICI");
		
		System.out.println(wcmsg);
		System.out.println(updateMsg);
		
		System.out.println("*********************************************************************");
		
		// 13 . Handling Special Characters
		//Put a \ in front of the quote(special character) then Java will consider it as a character or else it will think it as a string
		
		//String text =  "Welcome to Selenium Class"; //Case 1 = no changes
		String text = "Welcome to \"Selenium Class\""; //put \ in front of special character(" - special character)
		System.out.println(text);
		
		System.out.println("*****************************************************************************");
		
		
		
		
		
		
		
		
	}

}
