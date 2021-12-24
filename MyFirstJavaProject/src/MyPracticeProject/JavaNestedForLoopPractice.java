package MyPracticeProject;

public class JavaNestedForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//syntax: for(initialization;conditon;increment/decrement)
		//When the execution will stop is, when both inner for loop and outer for loop comes to the false condition, then only
		//nested for loop execution will stop
		//When sysout will work in this case, if(j==3)? when j=3.The result will be (1,3 /2,3 /3,3/4,3/5,3)
		//When we use 'break'(j==3) condtion, it will come out of the inner for  loop and contiunes until the condtion is true.(5,3)
		//Sysout is outside the loop now here. it will print 1,1/1,2/1,3 and go to 2,1/2,2/2,3 until it reaches 5,3
		//It wont continue until 5,5 because we gave the condition break after 3
		 //When break condition is used, it will only come out of inner loop and not the outer loop
		//When you want to come out of the two loops (inner and outer loops) at once, we have to use 'outerloop:' on the top and
		//type break outerloop; on the bottom. That is called as labelling
		//When we use the labelling(outerloop), the results will be 1,1/1,2/1,3.
		//There are four levels in this concept:
		//a. Level 1 = Try to print both for loop, that is i and j value
		//b. Level 2 = j==3
		//c. Level 3 = adding break concept
		//d. Level 4 = adding break outerloop
		
		outerloop:
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++){
				System.out.println(i + "," + j);
				if(j==3) {
				//System.out.println(i + "," + j);
					break outerloop;
				}
			}
		
		
		}

	}

}
