/* check the first and last element*/


import java.util.Scanner;


public class ChkArry {
public static void main(String[] args) {
	
	
	
	  int i,j; // Initialize local variable i
	   
	   
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("\nEnter lenght of first array: "); // allow user input
	   int SIZE = input.nextInt();
	   
	   
	   int [] array = new int[SIZE];
	   System.out.println("\nEnter elements ");
	   
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
	   System.out.println("\n\nEnter Elements in second array: ");
	   
	   for(j=0; j<=len-1; j++){
		   
		   Sarray[j] = inputArray.nextInt(); 
	   }
	   
	   for(j=0; j<=len-1; j++){
		   
		   System.out.println("\t"+ Sarray[j]);
	   }
	   
	  int [] NewArray = {0};
	  
	  
	  
	  if(SIZE == len){
		  
		          for( int k=0; k<=100; k++){
			      
        
       		 NewArray[k] = (array[k] + Sarray[k]);
       		

	  }
	   
		System.out.println("\t"+ NewArray[k]);
	  }else{
		  
		  System.out.println("Both array have no same lenght:");
	  }
}
	
	
}
