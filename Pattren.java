/* Write a program to print the below output?
1	2	3	4	5
2	4	8	16	32
3	9	27	81	243
4	16	64	256	1024
5	25	125	625	3125
*/
public class Pattren {
	public static void main(String[] args) {
		
		for (int i = 2; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print((int)Math.pow(i, j) + " ");
			}			
			System.out.print(" \n ");
		}
	}
}
