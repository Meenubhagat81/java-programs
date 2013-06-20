/* Find area and circumference of
 * rectangle, circle, triangle, square
 * using static keyword*/


class Rectangle {
	public static int len = 2;
	public static int bre = 5;
	public static int area;
	public static int circum;

	public static void rArea() {
		area = len * bre;

		System.out.println("\nArea is rectangle:" + area);

	}

	public static void rCrum() {

		System.out.println("\nCircumfrance of rectangle is : "
				+ (circum = ((len + bre) * 2)));
	}
}

class Square {
	public static int value = 2;

	public static void sArea() {
		System.out.println("\nArea of square:" + (value * value));
	}

	public static void sCircum() {
		System.out.println("\nCircumfrance of square:" + (4 * value));
	}
}

class circle {
	public final static double pi = 3.14;
	public static int r = 3;

	public static void cArea() {
		System.out.println("\nArea of circle:" + (pi * r * r));
	}

	public static void cCircum() {
		System.out.println("\n Circumfrance of circle:" + (2 * pi * r * r));
	}
}

class Traingle {
	public static int b = 3;
	public static int h = 2;
	public static int hy = 5;

	public static void tArea() {
		System.out.println("\nArea of traingle:" + (b * h) / 2);
	}

	public static void tCircum() {
		System.out.println("\n Circumfrance of traingle:" + (b + h + hy));
	}
}

public class calArea {
	public static void main(String[] args) {

		Rectangle.rArea();
		Rectangle.rCrum();

		Square.sArea();
		Square.sCircum();

		circle.cArea();
		circle.cCircum();

		Traingle.tArea();
		Traingle.tCircum();
	}

}
