package MyPracticeProject;

public class JavaBreakContinuePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int num = 1; num<=10; num++) { //First Step initializing the value
			if(num==6) { //Third Step = breaking the loop by using ==
			break; // fourth step = adding the break statement. Break Statment is used to jump out of the loop after the condition is met.
			}
			System.out.println(num); //Second Step 
		}
       System.out.println("******************************************************");
		
		//Continue Statement
		//It will SKIP the current iteration
		for(int num = 1; num<=10; num++) { //1. initializing the value
			if(num==6) {  //3. breaking the loop by using ==
			continue; //4. Adding continue statement and this will execute fully until 10 but skipping the number 6 	
			}
			System.out.println(num); // 2. second step = printing the value
		}
		
	}

}
