import java.io.BufferedReader;
import java.io.InputStreamReader;



public class Converstion {

	public static void main(String[] args) {
		
		
		 try {
             BufferedReader buffreader = new BufferedReader(new InputStreamReader(System.in));
             
             System.out.println("Enter first number:");
             
             int a = Integer.parseInt(buffreader.readLine());
             
             System.out.println("Enter second number:");
             
             int b = Integer.parseInt(buffreader.readLine());
             
             if(a == b){
             
             double result = (double) a + b;
             
             result = result * result;
             
             System.out.println("The result in double type is: " + result);
             }else{
            	 
            	 double result = (double)a+b;
            	 System.out.println("The result is result :"+ result);
             }
     } catch (Exception e) {
             System.out.println(" Error " + e);
     }
	}
}
