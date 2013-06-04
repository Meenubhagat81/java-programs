import java.util.Scanner;


public class Parrot {

	public static void main(String[] args) {
		Scanner T_Parrot = new Scanner(System.in);
		
		System.out.println("Enter the currunt hour :");
		
		double P = T_Parrot.nextDouble();
		
		boolean trouble = true;
		
		boolean troubleagain = false;
		
		if(P < 7 || P > 20){
			
			System.out.println("Parrort talked trouble trouble trouble !!!! : "+ trouble);
		}else{
			
			System.out.println(" Parrot talked trouble trouble trouble !!!! :"+ troubleagain);
		}
	}
}
