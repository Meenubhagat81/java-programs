import java.util.Scanner;

/* Calculate Absolute value 
 * and return result */

public class CalculateAbsoluteValue {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Enter value of a number to find absolute value :");
		int value = num.nextInt();
		boolean AbsoluteValue = true;
		boolean NonAbsoluteValue = false;

		System.out.println("\n\nCalculated absolute value is: "
				+ Math.abs(value));
		// -----Check Condition of Absolute value ---------------->>>>>>>>>>
		if (Math.abs(value) > 90) {
			System.out.println("\nAbsolute value is to near hundred :"
					+ AbsoluteValue);
		} else {
			System.out.println("\nAbsolute value is not near to hundred:"
					+ NonAbsoluteValue);
		}

	}

}
