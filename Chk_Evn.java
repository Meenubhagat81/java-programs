import java.util.Scanner;


public class Chk_Evn {
	
	public static void main(String[] args) {
		
Scanner number = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		
		int N = number.nextInt();
		
		if( N%2==0 ){
			
			System.out.printf(N +"  Number is even ");
			
		}
		else{
			
			System.out.println(N + " Number is odd ");
		}
	}

}
