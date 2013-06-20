/*3. Create a class to do math operations add, 
 * subtract, multiply and divide ?*/


class MathOperations {
	double a = 5;
	double b = 3;

	public void Add() {

		System.out.println("Performing Addition:" + (a + b));
	}

	public void Sub() {
		System.out.println("\n\nPerforming Subtraction:" + (a - b));
	}

	public void mul() {
		System.out.println("\n\nPerforming Multiplication:" + (a * b));
	}

	public void div() {
		System.out.println("\n\nPerforming Division:" + (a / b));
	}
}

public class mathOpr {
	public static void main(String[] args) {

		MathOperations math1 = new MathOperations();
		//math1.a = 5;
		//math1.b = 3;
		math1.Add();
		math1.Sub();
		math1.mul();
		math1.div();

	}
}
