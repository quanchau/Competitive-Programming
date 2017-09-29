import java.util.*;
public class RadioCommercials {
	public static void main(String[] args) {
		Scanner in  =new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		arr = new int[n];
		for (int i = 0; i < n ; i++) {
			arr[i] = in.nextInt()-c;

		}
		int cur = 0;
		int res = 0;
		for (int i = 0; i <n ;i++) {
			cur = Math.max(0, cur + arr[i]);
			res = Math.max(res, cur);
		}
		System.out.println(res);
	}
	static int[] arr;
}
