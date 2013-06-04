import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		
		
Scanner num = new Scanner(System.in);
		
		System.out.println("Enter a number to cheak palindrome :");
		int PNub = num.nextInt();
		 
		int rev=0;
		int z;
		int rem;
		
		z=PNub;
		
		while( PNub > 0 ){
			
			rem = ( PNub % 10 );
			PNub = ( PNub / 10);
			rev = ((rev*10)+rem);
		}
		
		if(rev==z)
		{
			System.out.println("Given number is palindrome ");
		}
		else{
			
			System.out.println("Given number is not palindrome");
		}

	}
}
