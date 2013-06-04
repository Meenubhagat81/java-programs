import java.util.Scanner;


public class String_TF {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner value1 = new Scanner(System.in);

		System.out.println("Enter the first value :");

		int v1 = value1.nextInt();

		Scanner value2 = new Scanner(System.in);

		System.out.println("Enter the second value :");

		int v2 = value2.nextInt();
		
		if( v1 == v2){
		
		sum = (v1 + v2);
		sum = sum * sum ;
		
		System.out.println("Sum is : "+ sum );
		} else{
			
			sum = v1 + v2;
			System.out.println("Sum is : "+ sum);
			
			
		}
		
    	
		
		
	}
}
