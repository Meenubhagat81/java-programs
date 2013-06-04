import java.util.Scanner;


public class Cal_Prime {
	public static void main(String[] args) {
		
		
Scanner number = new Scanner(System.in);
		
		System.out.println("Enter number to check Prime : ");
		 int chk = number.nextInt();

		 int i;
		 if( chk == 2){
				
				System.out.println(chk +"  Number is prime ");
			}else{
			
		
			for( i=2; i<=chk-1; i++){
				
				if (chk % i == 0 )
					break;
				}
				if(chk != i){
					
					System.out.println(chk + " Number is not Prime \n" );
				}else{
					
					System.out.println(chk + " Number is prime");
				}
				
			}
				
		 
		 
		 
		 
		 

	}

}
