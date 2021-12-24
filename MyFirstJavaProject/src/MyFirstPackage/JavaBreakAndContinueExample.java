package MyFirstPackage;

public class JavaBreakAndContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//7. Difference between break and continue
		for (int i = 0; i < 10; i++) {
			if (i == 4) {break;}
			System.out.println(i);
			}
		for (int i = 0; i < 10; i++) {
			  if (i == 4) {continue;}
			  System.out.println(i);
			} 
	}

}
