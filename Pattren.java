
public class Pattren {
	public static void main(String[] args) {

		int k = 2;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				System.out.print(Math.pow(k, j));

			}
			k = k + 1;
			System.out.print(" \n ");
		}
	}

}
