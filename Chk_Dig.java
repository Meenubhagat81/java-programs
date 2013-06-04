import java.util.Scanner;


public class Chk_Dig {
	public static void main(String[] args) {
		
		int rem1 = 0;
		int rem2 = 0;
		
		
		Scanner val1 = new Scanner(System.in);

		System.out.println("Enter value of first number :");

		int v1 = val1.nextInt();
		
		if( v1 > 0){
			
			rem1 = v1%10;
			System.out.println(rem1);
				}
		
		
		
                
		// checking second variable

		Scanner val2 = new Scanner(System.in);

		System.out.println("Enter value of first number :");

		int v2 = val2.nextInt();

		if (v2 > 0) {
			rem2 = v2 % 10;
			System.out.println(rem2);
		}
		
		if( rem1 ==  rem2){
			
			System.out.println("Both variable have same Last Digit "+ rem1);
		}else{
			
			System.out.println("Both variable havenot same last digit ");
		}
               	
		

	}

}
