import java.util.Scanner;


public class RotateArray {
	
	public static void main(String[] args) {
		int t;
		int SIZE = 3;
		int[] array = new int[SIZE];

		Scanner element = new Scanner(System.in);
		System.out.println("Enter Element : ");
		for (int i = 0; i < SIZE; i++) {
			array[i] = element.nextInt();
			
		}
		
		for (int j = 0; j < SIZE; j++) {
			t = array[0];
			array[j] = array[j+1];
			array[j+1] = t;
			
		}
		
		
	}

}
