import java.util.Scanner;

/* a string, return a new string 
 * where the first and last chars 
 * have been exchanged 
 * eg: code to eodc
 */

public class ExchangeFirstLastChar {
	public static void main(String[] args) {
		// -------------get string from user---------->>>>>>>>>>>
		Scanner String = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String NewString = String.next();
		System.out.println(NewString);
		// -------------get length of string ----->>>>>>>>>>>>
		int lenght = NewString.length();
		System.out.println("Lenght of String is: " + lenght);
		// ------------Replace character---------------->>>>>>>>
		String FirstChar = NewString.substring(0, 1);
		System.out.println("Get First chracter:" + FirstChar);
		String MidChar = NewString.substring(1, lenght - 1);
		System.out.println("Get MidCharcter Chracter:" + MidChar);
		String LastChar = NewString.substring(lenght - 1);
		System.out.println("Get Last Chracter:" + LastChar);

		System.out.println("Result of replacing chracter first with last :"
				+ LastChar + MidChar + FirstChar);
	}
}
