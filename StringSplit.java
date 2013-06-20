import java.util.Arrays;
import java.util.Scanner;



public class StringSplit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = null;
		String[] strArray = new String[5];
		System.out.println("Enter String");
		for(int i=0; i<5; i++){
			
			str = input.next();
			strArray[i] = str;
		}
		
		System.out.println(Arrays.toString(strArray));
		
			}

}

