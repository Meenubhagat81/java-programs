/* compare string with second string 
 * to check its first two characters 
 * are same or different
 * eg: first String : hi there 
 * Second String : hi
 * result : true
 */

import java.util.Scanner;

public class CheckString {
	public static void main(String[] args) {
		// --------String to compare---------->>>>>>>>
		String word = "hi";
		System.out.println("First String for comare : " + word);
		// --------get string to compare from user--------->>>>>>>>
		Scanner SecondString = new Scanner(System.in);
		System.out.println("Enter Second String to Check with first String : ");
		String CheckString = SecondString.nextLine();
		System.out.println(CheckString);
		// --------------find length----------->>>>>>>>>>>
		int len = CheckString.length();
		System.out.println("Length of the String is : "+len);
		// -------------string comparison----------->>>>>>>>>>>>>>
		String compare = CheckString.substring(0, 2);
		System.out.println("Store First two chracter of String : "+compare);

		if (word.compareTo(compare) == 0) {
			System.out.println("First two Chracter are same :" +true);
		} else {
			System.out.println("First two chracter are not same : "+false);
		}

	}

}
