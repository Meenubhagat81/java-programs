import java.util.Scanner;


public class Phythagorse {

	public static void main(String[] args) {
		
Scanner num1 = new Scanner(System.in);
		
		System.out.println("Enter the value of a:= ");
		int a = num1.nextInt();
		
        Scanner num2 = new Scanner(System.in);
		
		System.out.println("Enter the value of b:= \n ");
		int b = num2.nextInt();
		
        Scanner num3 = new Scanner(System.in);
		
		System.out.println("Enter the value of c:= \n");
		int c = num3.nextInt();
		
		
		System.out.println("Checking pythagors:\n ");
		
		if(c*c == a*a + b*b ){
			System.out.println("its pythagores triplet ");
		}
		else{
			System.out.println("it is not pythagores triplet ");
		}
		
		

		
	}
}
