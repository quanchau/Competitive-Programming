import java.util.*;

public class ButtonBashing2 {
	static int tar;
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for (int i_T= 0; i_T < T; i_T++) {
			int n = in.nextInt();
			tar = in.nextInt();
			arr = new int[n];
			for (int i = 0 ; i <n; i++) {
				arr[i] = in.nextInt();
			}
		}
	}
}
