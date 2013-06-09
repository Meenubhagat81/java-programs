import java.util.Scanner;


public class ReverseArray {

	
	public static void main(String[] args) {
		int SIZE = 3;
		int[] inputelement = new int[SIZE];

		Scanner element = new Scanner(System.in);
		System.out.println("Enter Element : ");
		for (int i = 0; i < SIZE; i++) {
			inputelement[i] = element.nextInt();
			
		}
	
		for (int j = SIZE-1; j >= 0; j--) {
			System.out.println(inputelement[j]); 
			
		}
		

	}

}
