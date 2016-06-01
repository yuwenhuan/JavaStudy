import java.util.Arrays;
import java.util.Scanner;

public class CommonNum {
	private static int[] getArray(Scanner sc) {
		int n = sc.nextInt();
		sc.nextLine();
		int[] a = new int[n];
		for (int ii = 0; ii < n; ii++) {
			a[ii] = sc.nextInt();
		}
		sc.nextLine();
		return a;
	}
	public static void main(String[] args) {
		// get inputs
		Scanner sc = new Scanner(System.in);
		int[] a1 = getArray(sc);
		int[] a2 = getArray(sc);
		sc.close();

		// find common number
		int numCommon = 0;
		for (int ii=0;ii<a1.length;ii++) {
			for (int jj=0;jj<a2.length;jj++){
				if (a1[ii] == a2[jj]) {
					numCommon++;
				}
			}
		}
		
		// print outputs
		if (numCommon == 0) {
			System.out.println("None");
		} else {
			System.out.println(numCommon);
		}
		
	}

}
