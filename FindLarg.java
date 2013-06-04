import java.util.Scanner;


public class FindLarg {
	
	public static void main(String[] args) {
		
		

		Scanner val1 = new Scanner(System.in);

		System.out.println("Enter value of first number :");

		int v1 = val1.nextInt();

		Scanner val2 = new Scanner(System.in);

		System.out.println("Enter value of second number :");

		int v2 = val2.nextInt();
		
		if(v1 > v2){
			
			System.out.println(v1+"  value is greater than second  value ");
		}else{
			
			System.out.println(v2+"  value is greater than first value ");
		}

	}

}
