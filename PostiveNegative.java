import java.util.Scanner;


public class PostiveNegative {
	public static void main(String[] args) {
		
    
		Scanner variable = new Scanner(System.in);

		System.out.println("Enter value of variable ");

		int v1 = variable.nextInt();
		
		boolean V_T = true;
		
		boolean V_F = false;

		Scanner variable2 = new Scanner(System.in);

		System.out.println("Enter value 2nd variable ");

		int v2 = variable2.nextInt();
            
		if( v1 < 0 && v2 < 0 ){
			
			System.out.println(" Both are negative : "+ V_T);
		}else if( v1 < 0 && v2 > 0){
			
			System.out.println("One is positive and one is negative :" + V_T);
		}else if( v1 > 0 && v2 > 0){
			
			System.out.println(" Both are positive "+ V_F);
		}else{
			
			System.out.println(" OOOOOOOOOOOOPSSSS :"+ V_F);
		}


	}
}
