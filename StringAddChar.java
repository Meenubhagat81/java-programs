import java.util.Scanner;

public class StringAddChar {

	public static void main(String[] args) {
            
		// -----------get string from user----------->>>>>>>
		Scanner String = new Scanner(System.in);
		System.out.println("Enter String");
		String NewString = String.nextLine();
		System.out.println(NewString);
		//----------getting length------------------>>>>>>>>
		int lenght = NewString.length();
		System.out.println("Lenght of String is :"+ lenght);
		//---------concatenate---------------------->>>>>>>>
		String lastChar = NewString.substring(NewString.length()-1);
		System.out.println(lastChar);
		System.out.println("Result : "+lastChar+NewString+lastChar);
	}

}
