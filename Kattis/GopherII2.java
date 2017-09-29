import java.util.*;
public class GopherII2 {
	static HashMap<Integer, ArrayList<Integer>> adj;
	static int[] match;
	static int[] vis;
	static int n;
	static int m;
	static final int INF= 1000000007;
	public static class Point {
		double x;
		double y;
		public Point(double xx, double yy) {
			x= xx;
			y = yy;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
		n = in.nextInt();
		m = in.nextInt();
		int sec = in.nextInt();
		double v = in.nextInt();
		adj = new HashMap<Integer, ArrayList<Integer>>();
		match = new int[n+m+1];
		vis = new int[n+m+1];
		Point[] gopher = new Point[n];
		for (int i = 0; i < n; i++) {
			adj.put(i+1, new ArrayList<Integer>());
			gopher[i] = new Point(in.nextDouble(), in.nextDouble());
		}
		Point[] holes = new Point[m];
		for (int i = 0; i < m; i++) {
			adj.put(i+1+n, new ArrayList<Integer>());
			holes[i] = new Point(in.nextDouble(), in.nextDouble());
		}
		
		for (int i = 1; i <= n; i++) {
			Point temp = gopher[i-1];
			for (int j = 1; j<= m; j++) {
				Point temp2 = holes[j-1];
				double dist = Math.sqrt(Math.pow(temp.x - temp2.x, 2) + Math.pow(temp.y - temp2.y, 2));
				if (sec >= dist/v) {
					adj.get(i).add(j+n);
				}
			}
		}
		
		int mcbc = 0;
		for (int i = 1; i <= n; i++) {
			vis = new int[n+m+1];
			mcbc += aug(i);
		}
		System.out.println(n- mcbc);
		}
		

	}
	
	static int aug(int i) {
		if (vis[i] == 1) return 0;
		vis[i] = 1;
		ArrayList<Integer> temp = adj.get(i);
		for (int j : temp) {
			if (match[j] == 0 || aug(match[j]) > 0) {
				match[j] = i;
				return 1;
			}
		}
		return 0;
	}
}
