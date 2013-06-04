 import java.util.Scanner;


public class MeanMode {
	public static void main(String[] args) {
		
		int[] b = {0};
		int k = 0, c = 1, max = 0, mode;
		

		
		int sum = 0,t;
		double x = 0.0 , y = 0.0;
		int SIZE = 05; // variable holds array size

		int[] number = new int[SIZE]; // array of size elements

		Scanner input = new Scanner(System.in); // object of class Scanner to
												// get data from console
		System.out.print("Enter Integer Number: ");
		for (int index = 0; index < SIZE; index++) // prompt user & get data
		{
			
			number[index] = input.nextInt();
		}

		for (int index = 0; index < SIZE; index++){
			
			System.out.printf(" %d ", number[index]);  // output array 'number' Elements
		   // System.out.println();
		    sum = sum+number[index];
		}
		System.out.println("\n Sum is "+ sum);
		

		x = (double) sum / (double) SIZE;
		System.out.println("Mean\t= " + x);

		//---------------------------------------------------------------->>>>>
		
		
		for (int index = 0; index < SIZE; index++) {
			for (int j = index + 1; j < SIZE; j++) {
				if (number[index] > number[j]) {
					t = number[index];
					number[index] = number[j];
					number[j] = t;
				}
			}
		}
		if (SIZE % 2 == 0)
			y = (float) (number[SIZE / 2] + number[(SIZE - 1) / 2]) / 2;
		else
			y = number[(SIZE - 1) / 2];
		System.out.println("\nMedian\t= " + y);
		
		//------------------------------------------------------------->>>>>>>>>>>>>>>

		for (int index = 0; index < SIZE - 1; index++) {
			mode = 0;
			for (int j = index + 1; j < SIZE; j++) {
				if (number[index] == number[j]) {
					mode++;
				}
			}
			
	      	if ((mode > max) && (mode != 0)) {
				k = 0;
				max = mode;
				b[k] = number[index];
				k++;
			} 
		}
		
		if (c == SIZE)
			System.out.println("\nThere is no mode");
		else {
			System.out.println("\nMode\t = ");
			for (int index = 0; index < k; index++)

				System.out.println(b[index]);
		}
		
		
		
		
		//------------------------------------------->>>>>>>>>>>>>>>>>>>>....
		
		
		int larg ;
		int low;
		int S = 5;
		int[] num1 = new int[S];
		
		Scanner input1 = new Scanner(System.in); // object of class scanner to get data
		
		System.out.println("Enter Elements to find largest and smallest number : ");
		for(int i = 0; i < S; i++){ // prompt user to get data
			
			num1[i] = input1.nextInt();
		}
		for(int i = 0; i < S; i++){
			System.out.printf(" %d ", num1[i]);
		}
			larg = num1[0];
		for(int i = 0; i < S; i++){
			if(num1[i] > larg){
				larg = num1[i];
				
			}
		}
			System.out.println("\n Largest number is :"+larg);
	        
			low = num1[0];
			
			for(int i = 0; i < S; i++){
				if(num1[i] < low){
					low = num1[i];
					
				}
			}
			System.out.println("\n Smallest number is :"+ low);
		
	}

}
