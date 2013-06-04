import java.util.Scanner;

public class Cal_Bill {
	public static void main(String[] args) {

		Scanner cal = new Scanner(System.in);

		System.out
				.println("Enter number of units for calculating the bill : \n");

		double Bill = cal.nextDouble();

		double B = 1;

		if (Bill < 100) {

			System.out.println("Calculated Bill is : $ " + B);

		} else if (Bill > 100 || Bill < 300) {

			B = (99 * B) + ((Bill - 99) * 0.75);

			System.out.println("Calculated Bill is : $" + B);

		} else if (Bill < 300 || Bill > 500) {

			B = (99 * B) + ((Bill - 99) * 0.50);

			System.out.println("Calculated Bill is : $" + B);
		} else if (Bill > 500) {

			B = (99 * B) + ((Bill - 99) * 0.25);

			System.out.println("Calculated Bill is : $" + B);
		}

	}

}
