import java.util.*;
public class OddManOut {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			System.out.print("Case #" + (i_t+1) + ": ");
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) { arr[i] = in.nextInt();}
			Arrays.sort(arr);
			for (int i = 0; i < n; i+=2) {
				if (i == n-1) { System.out.println(arr[i]); break;}
				else if (arr[i] != arr[i+1]) {
					System.out.print(arr[i]);
					break;
				} 
			}
			System.out.println();
		}
		
	}
}
