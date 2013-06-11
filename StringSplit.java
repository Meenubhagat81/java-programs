//import java.util.Scanner;



public class StringSplit {
	public static void main(String[] args) {
		
		//Scanner String = new Scanner(System.in);
		//System.out.println("Enter a String : ");
		String ResultString = "Anything";
		System.out.println(ResultString);
		String[] strArray = ResultString.split(ResultString, 2);
		
		System.out.println(strArray);
		for(int i=0; i<strArray.length; i++){
			System.out.println(strArray[i]);
			
		}
		/*
		int len = ResultString.length();
		System.out.println(len);
		
		Scanner num = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = num.nextInt();
		System.out.println(n);
		
		Scanner SplitString = new Scanner(System.in);
	    SplitString=ResultString.split(ResultString, n);
		
		*/
	}

}

