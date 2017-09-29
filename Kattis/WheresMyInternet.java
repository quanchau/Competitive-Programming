import java.util.ArrayList;
import java.util.Scanner;

public class WheresMyInternet {
	static int[] parents;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		parents = new int[n+1];
		for (int i_n = 0; i_n < n+1; i_n++) {
			parents[i_n] = i_n;
		}
		for (int i = 0; i< m; i++) {
			int x1 = in.nextInt();
			int x2 = in.nextInt();
			unite(x1, x2);
		}
		
		int count = 0;
		int num = find(1);
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i< n+1;i++) {
			if (find(i) != num) {
				list.add(i);
			}
		}
		if (list.size() == 0) {
			System.out.println("Connected");
		} else {
		for (int i:list) {
			System.out.println(i);
		}
		
		}
	}
	
	public static int find(int x) {
		if (parents[x] == x) {
			return x;
		} else {
			parents[x] = find(parents[x]);
			return parents[x];
		}
	}
	
	public static void unite(int x1, int x2) {
		parents[find(x1)] = find(x2);
	}
}
