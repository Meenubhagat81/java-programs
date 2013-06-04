
public class Reverse_Array {
	
	public static void main(String[] args) {
		
int[] values;
		
		values = new int[5];
		
		values[0] = 10;
		values[1] = 50;
		values[2] = 20;
		values[3] = 60;
		values[4] = 30;
		
		
		System.out.println("Number in series order :");
		for(int i=0; i<values.length;i++)
		{
			
			System.out.println(values[i]);
		}
		
		System.out.println("\n Number in reverse order :");
		for(int j=4; values.length>=0; j--){
			
			
			System.out.println(values[j]);
		}

		
	}

}
