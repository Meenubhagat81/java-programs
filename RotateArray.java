/* rotating an array to left */

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

		t = array[0];

		for (int j = 0; j < SIZE - 1; j++) {
			if (j <= SIZE - 1) {
				array[j] = array[j + 1];
				System.out.println(array[j]);
			}

		}

		array[0] = t;
		System.out.println(array[0]);
	}
}