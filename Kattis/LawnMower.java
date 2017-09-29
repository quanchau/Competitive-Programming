import java.util.*;
public class LawnMower {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		int nx = in.nextInt();
		int ny = in.nextInt();
		double w = in.nextDouble();
		if (nx == 0 && ny == 0 && w == 0.0) break;
		boolean ok1 = true;
		boolean ok2 = true;
		double[] arr1 = new double[nx];
		double[] arr2 = new double[ny];
		for (int i = 0; i < nx; i++) {
			arr1[i] = in.nextDouble();
			
		}
		
		for (int i = 0 ; i < ny; i++) {
			arr2[i] = in.nextDouble();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		double start1 = 0;
		for (double i : arr1) {
			if ((i-(w/2)) > start1) {
				ok1 = false;
				break;
			}
			start1 = i+ w/2;
		}
		if (start1 < 75) ok1 = false;
		
		double start2 = 0;
		for (double i : arr2) {
			if ((i-(w/2)) > start2) {
				ok2 = false;
				break;
			}
			start2 = i+ (w/2);
		}
		if (start2 < 100) ok2 = false;
		
		if (!ok1 || !ok2) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		
		
	}
	}
}
