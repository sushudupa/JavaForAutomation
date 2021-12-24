package MyFirstPackage;

public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Types Of Java Operators");
 
 /*1. Arithmetic Operator
   *A. Addition Operator
   *B. Subtraction Operator
   *C. Multiplication Operator
   *D. Division Operator
   *E. Remainder Operator*/
		
//2. Equality and Relational Operator

/*3. Conditional Operator
   *A. And Operator
   *B. Or Operator*/
		
/*4. Unary Operator
   *A. Pre-increment Operator
   *B. Post-increment Operator*/
		
	System.out.println("******************************************************************");	

// Assignment Operator - Assigning the numbers
		
		int num1 = 20;
		int num2 = 40;
		int num3 = 10;
		int num4 = 7;

	System.out.println("******************************************************************");		
		
//1. Arithmetic Operator
		//A. Additon
		 
		  System.out.println("Addition of 2 numbers(20 and 40) = " + (num1+num2));
		
		 //B. Subtraction
		 
		   System.out.println("Subtraction of 2 numbers(40 and 20) = " + (num2-num1));
		 
 
         //C. Multiplication
		    
		   System.out.println("Multiplication of 2 numbers(20 and 40) = " + (num1*num2));
		     
  
	     //D. Division
		     
 	      System.out.println("Division of two numbers (40 divided by 10) = " + (num2/num3));	
 	      
 	     //E. Remainder
 	      
 	      System.out.println("Remainder of 40 divided by 7 = " + (num2 % num4));
		
    System.out.println("******************************************************************");	      
 	      
//2. Equality and Relational Operator
 	      
 	     int num5 = 100;
 		 int num6 = 400;
 		 int num7 = 100;
 	      
 	          
 	      
 	      //A. Equality Operator
 		 
            System.out.println(num5 == num7); 
            
          //B. Greater than or equal to
            
            System.out.println(num5 >= num6);
            
          //C. Less than or equal to 
            
             System.out.println(num5 <= num6);
             
          //D. Not equal to
             
             System.out.println(num4 != num5);
             
          //E. Greater than
             
             System.out.println(num6 > num7);
             
          //F. Less than
             
             System.out.println(num5 < num6);
             
 
  System.out.println("******************************************************************");           
             
  //3. Conditional Operator
             
          //A. And Operator
             
             System.out.println(num5<num6 && num5 == num7);
             
             System.out.println(num5>num6 && num5 == num7);
             
             System.out.println(num5>num6 && num6 == num7);
             
             System.out.println(num7>num6 && num5 == num7);
             
          //B. OR Operator
             
             System.out.println(num5<num6 || num5 == num7);
             
             System.out.println(num5>num6 || num5 == num7);
             
             System.out.println(num6>num5 || num5 == num7);
             
             System.out.println(num5 == num7 || num5<num6);
             
     System.out.println("******************************************************************");             
             
   //4. Unary Operator
             
        //A. Pre Increment   
     
        int num8 = 100;

        //increments first and then copies over data
        //num8 = num8 +1;
        //num9 = num8;
        int num9 = ++num8;
        
        System.out.println("Value of num8 is "+ num8);
        System.out.println("Value of num9 is "+ num9);
        
        

        System.out.println("******************************************************************");  
        
        //B. Post Increment
              
        int num10 = 100;
        //copies over content first and then increments
        //num11 = num10;
        //num10 = num10+1;
        int num11 = num10++;
        
        System.out.println("Value of num10 is " + num10);
        System.out.println("Value of num11 is " + num11);
          
        System.out.println("******************************************************************");      
          
        
        
        
     
     
     
     
     
     
     
             
             
             
             
   
 	      
 	      
 	
 	
		  
		  
		
		
		
		
	        } 
}
		
		
		
			
		
		

		

		
		
