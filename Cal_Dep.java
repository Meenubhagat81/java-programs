import java.util.Scanner;


public class Cal_Dep {
	public static void main(String[] args) {
		
Scanner  PPrice = new Scanner(System.in);
		
		System.out.println("Enter the Purchase Price :");
		double PP = PPrice.nextDouble();
		
		Scanner SPrice = new Scanner(System.in);
		
		System.out.println("Enter salvage Price :");
		double SP = SPrice.nextDouble();
		
		Scanner Year = new Scanner(System.in);
		
		System.out.println("Enter year of service :");
		double Y = Year.nextDouble();
		
		
		
		System.out.println("Calculated Depreciation :" + ((PP-SP)/Y));
		
		

		
	}

}
