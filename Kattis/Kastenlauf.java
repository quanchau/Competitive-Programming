import java.util.*;
public class Kastenlauf {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
			int[] arr = new int[n+2];
			for (int i = 0; i < n+2; i++) {
				arr[i] = in.nextInt() + in.nextInt();
			}
			int start = arr[0];
			int end  = arr[n+1];
			boolean ok = true;
			Arrays.sort(arr);
			int ind = 0;
			while (arr[ind] != start && arr[ind] != end) {
				ind++;
			}
			if (start <= end) {
			while (arr[ind] < end) {
				if (Math.abs(arr[ind+1] - arr[ind]) > 1000) {
					ok = false;
					System.out.println("sad");
					break;
				}
				ind++;
			}
			} else {
				while (arr[ind] < start) {
					if (Math.abs(arr[ind+1] - arr[ind]) > 1000) {
						ok = false;
						System.out.println("sad");
						break;
					}
					ind++;
				}
			}
			if (ok) {
				System.out.println("happy");
			}
		}
	}
}
