import java.util.Scanner;


public class ChkArrayFL {
	public static void main(String[] args) {
        int i,j; // Initialize local variable i
		boolean equal = true;
		boolean unequal = false;
		
   Scanner input = new Scanner(System.in);
   System.out.println("Enter lenght of first array: "); // allow user input
   int SIZE = input.nextInt();
   
   int [] array = new int[SIZE];
   System.out.println("Enter elements ");
   
   for( i=0; i <=SIZE-1; i++){
	   
	   array[i] = input.nextInt(); // input first array element
	   }
  
   for( i=0; i <=SIZE-1; i++){
   System.out.print( " \t"+array[i]); // display first array element
 
   }	
   
   Scanner inputArray = new Scanner(System.in);
   System.out.println("\n \n enter lenght of second Array: "); // user input for second array
   int len = inputArray.nextInt();
   
   int [] Sarray = new int[len]; // defining second element
   System.out.println("Enter Elements in second array: ");
   
   for(j=0; j<=len-1; j++){
	   
	   Sarray[j] = inputArray.nextInt(); 
   }
   
   for(j=0; j<=len-1; j++){
	   
	   System.out.println("\t"+ Sarray[j]);
   }
   if(array[0] == Sarray[0] && array[SIZE-1] == Sarray[len-1]){
	   System.out.println("\n\n Both array having first and last elements equal: " +  equal);
   
   }else if(array[SIZE-1] == Sarray[len-1]){
	   
	   System.out.println("\n \n both array have Last  element  equal: "+ equal);
   }else if(array[0] == Sarray[0]){ // checking the condition for first and last element
	   System.out.println("\n \n both array have first  element  equal: "+ equal);
   } else{
	   System.out.println("\n \nfirst and last element are unequal: "+ unequal);
   }
	
		
		
	}
}
