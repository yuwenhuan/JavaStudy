import java.util.Scanner;

public class Rectangle {
	public int height, width;

	Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public int getArea() {
		return height * width;
	}

	public int getPerimeter() {
		return 2 * (height + width);
	}

	public static void main(String[] args) {
		// get inputs
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		int width = sc.nextInt();
		sc.nextLine();
		sc.close();

		// calculate
		Rectangle rt = new Rectangle(height, width);

		// print outputs
		System.out.println(Integer.toString(rt.getArea()) + ' ' + Integer.toString(rt.getPerimeter()));
	}

}
