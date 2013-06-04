import java.util.Scanner;


public class Cal_Rec {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side of square : ");
		
		double value = input.nextDouble();
		
		System.out.println("Area of square is : \n" + value*value);
		System.out.println("circumfrance of square is :\n" + value*4);
		
		
		
		
		Scanner lenght = new Scanner(System.in);
		
		System.out.println("Enter the lenght of rectangle: ");
		
		int L = lenght.nextInt();
		
		Scanner breath = new Scanner(System.in);
		
		System.out.println("Enter breath of rectange :");
		
		int B = breath.nextInt();
		
		System.out.println("Area of rectangle is :\n " + L*B);
		System.out.println("Circumfrance of rectangle is : \n" + ((L+B)*2));
		
		
		
		double pie = 3.14;
		
		Scanner circle = new Scanner(System.in);
		
		System.out.println("Enter the redius :");
		
		double R = circle.nextDouble();
		
		System.out.println("Area of circle is :"+ ((R*R)*pie));
		System.out.println("Circumfrance of circle :"+(2*(pie*R)));
		
		
		
		Scanner traingle = new Scanner(System.in);
		
		System.out.println("Enter height \n : ");
		
		float h = traingle.nextFloat();
		
		System.out.println("Enter hypo \n :");
		
		float hy = traingle.nextFloat();
		
		System.out.println("Enter base \n :");
		
        float b = traingle.nextFloat();
        
        System.out.println("Area of traingle is: \n" + ((b*h)/2));
        System.out.println("Circumfrance of traingle : \n"+ (h+hy+b));

		
	}
}
