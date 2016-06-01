import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// get inputs
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		sc.close();

		// calculate finbonacci
		int fib;
		if (n == 0) {
			fib = 1;
		} else if (n == 1){
			fib = 1;
		} else {
			int fib_2 = 1;
			int fib_1 = 1;
			fib = 2;
			for (int ii = 2; ii <= n; ii++) {
				fib = fib_1 + fib_2;
				fib_2 = fib_1;
				fib_1 = fib;
			}
		}

		// print outputs
		System.out.println(fib);
	}

}
