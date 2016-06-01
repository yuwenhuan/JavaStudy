import java.util.Scanner;


public class SortString {
	public static void main(String[] args) {
		// get inputs
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] strArray = new String[num];
		for (int ii=0; ii<num; ii++) {
			strArray[ii] = sc.nextLine();
		}
		sc.close();
		
		// sort
		for (int ii=num - 1; ii > 0; ii--) {
			for (int jj=0; jj<ii; jj++) {
				if (strArray[jj].compareTo(strArray[jj+1]) > 0) {
					// swap jj and jj+1
					String tmp = strArray[jj]; 
					strArray[jj] = strArray[jj+1];
					strArray[jj+1] = tmp;
				}
			}
		}
		
		// print outputs
		for (int ii=0; ii<num; ii++) {
			System.out.println(strArray[ii]);
		}
	}

}
