import java.util.*;
public class FlexibleSpaces {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int p = in.nextInt();
		boolean[] visited = new boolean[w+1];
		int[] arr = new int[p+2];
		arr[p+1] = w;
		for (int i = 1; i < p+1; i++) {
			arr[i] = in.nextInt();
		}
		for (int i = p+1; i >=0 ; i--) {
			for (int j = i-1; j>=0; j--) {
				visited[arr[i] - arr[j]] = true;
			}
		}
		for (int i = 1; i < w+1; i++) {
			if (visited[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
