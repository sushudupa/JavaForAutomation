package MyFirstPackage;

public class JavaNestForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.println(i + "," + j);
				if(j==3) {
				//System.out.println(i + "," + j);
					break; */
				
		
		
	
            outerloop:
            	for(int i =1; i<=5; i++) {
            		for(int j=1; j<=5; j++) {
            			System.out.println(i + " ," + j);
            			if(j==3) {
            				break outerloop;
            			}
            		}
            	}
		
		
		
	}
}
