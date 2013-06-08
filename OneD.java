import java.util.Scanner;


public class OneD {
	public static void main(String[] args) {
		
			int i; // Initialize local variable i
			boolean equal = true;
			boolean unequal = false;
			
	   Scanner input = new Scanner(System.in);
	   System.out.println("Enter lenght"); // allow user input
	   int SIZE = input.nextInt();
	   
	   int [] array = new int[SIZE];
	   System.out.println("Enter elements ");
	   
	   for( i=0; i <=SIZE-1; i++){
		   
		   array[i] = input.nextInt(); // input array element
		   }
	  
	   for( i=0; i <=SIZE-1; i++){
	   System.out.print( " \t"+array[i]); // display array element
	 
	   }	
	   if(array[0] == array[SIZE-1]){ // checking the condition for first and last element
		   System.out.println("\n \nfirst and last element are equal: "+ equal);
	   }else{
		   System.out.println("\n \nfirst and last element are unequal: "+ unequal);
	   }
		
			
	}

}
