import java.util.Scanner;


public class Chk_num {
	public static void main(String[] args) {
		
Scanner num = new Scanner(System.in);
		
		System.out.println("Enter a number to check : =");
		int X = num.nextInt();
        if( X > 0){
			
			System.out.println("Number is greater than zero : = " + X);
		}
		 if(X == 0){
			
			System.out.println("Number is equal to zero : = " + X);
			
		} 
		if(X < 0){
		 
			System.out.println("Number is less than zero : = " + X);
		}
	}

}
