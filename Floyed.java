/* Program to show Floyed Triangle
 * eg:
 * 1
 * 23
 * 456
 * 78910
 */




import java.util.Scanner;


public class Floyed {
	public static void main(String[] args) {
		
		Scanner num = new Scanner(System.in);

		System.out.println("Enter a number to check : =");
		int X = num.nextInt();
//----------for showing pattern------->>>>>>>>>>>>		
		int k=1;
		System.out.println(" ");
		for(int i=1; i<X; i++){
			for(int j=1; j<=i; j++){
				
				
				System.out.print(k );
				k=k+1;
				
			
			}
			System.out.print(" \n");
		}
		
	}

}
