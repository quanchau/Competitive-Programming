import java.util.*;
public class WalrusWeights {
	static int n;
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		arr = new int[n];
		res = 0;
		visited = new int[10001];
		for (int i = 0; i < 10001; i++) {
			visited[i] = -1;
		}
		distance = -1;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			generate(arr[i], i);
		}

		System.out.println(res);

	}
	static int[] visited;
	static int res;
	static int distance;
	public static void generate(int sum, int index) {
		if (sum > 1000 && Math.abs(sum - 1000) > distance && distance != -1) {

		} else if (distance != 0) {
			if (visited[sum]== -1 || index < visited[sum]) {
				visited[sum]= index;
				if (Math.abs(sum-1000) < distance || distance == -1) {
					distance = Math.abs(sum - 1000);
					res = sum;
				} else if (Math.abs(sum - 1000) == distance && sum > res) {
					res = sum;
				}

				for (int i = index + 1; i < n; i++) {
					generate(sum + arr[i], i);
				}

			}
		}

	}
}