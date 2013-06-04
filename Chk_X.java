import java.util.Scanner;


public class Chk_X {

	public static void main(String[] args) {
		
Scanner chk = new Scanner(System.in);
		
		System.out.println("\nEnter a number to check with nested if else statement :");
		int num = chk.nextInt();
		
		if( num > 0){
			
			System.out.println(num + " Number is greater than zero and its value is : " + 1);
		}
		else if(num == 0){
			
			System.out.println( num +" Number is equal to zero and its value is : " + 0);
			
		} 
		else{
		 
			System.out.println( num +" Number is less than zero and its value is : " + (-1));
		}
			
		// Check number with nested if
		
           Scanner check = new Scanner(System.in);
		
		System.out.println("\nEnter a number to check with nested if  statement :");
		int num1 = check.nextInt();
		
		if( num1 > 0){
			
			System.out.println(num1 + " Number is greater than zero and its value is : " + 1);
		}
		 if(num1 == 0){
			
			System.out.println( num1 +" Number is equal to zero and its value is : " + 0);
			
		} 
		if(num1 < 0){
		 
			System.out.println( num1 +" Number is less than zero and its value is : " + (-1));
		}
		
		// with switch statement
		
		Scanner n = new Scanner(System.in);

		System.out.println("\nEnter value to check with with switch statement :");

		int num2 = n.nextInt();
		
		int t = 0;
		
        if( num2 > 0){
			
        	 t = 1;
			
		}
		 if(num2 == 0){
			
			 t=2;
			
		} 
		if(num2 < 0){
		 
			 t=3;
		}
			
		
		switch ( t ) {
		case 1:

			System.out.println(num2
					+ " Number is greater than zero and its value is : " + 1);
			
			break;

		case 2:

			System.out.println(num2
					+ " Number is equal to zero and its value is : " + 0);
               
			break;
		case 3:

			System.out.println(num2
					+ " Number is less than zero and its value is : " + (-1));
                
			break;
		default:
			
			System.out.println("Number doesnot exit :");
			
			break;
		}

		
		

		
	}
}
