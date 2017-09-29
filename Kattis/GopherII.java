import java.util.*;
public class GopherII {
	static HashMap<Integer, ArrayList<Integer>> adj;
	static int[][] vals;
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
		vals2 = new int[n+m+2][n+m+2];
		s = 0;
		t = n+m+1;

		Point[] gopher = new Point[n];
		for (int i = 0; i < n; i++) {
			vals2[s][i+1] = 1;
			gopher[i] = new Point(in.nextDouble(), in.nextDouble());
		}
		Point[] holes = new Point[m];
		for (int i = 0; i < m; i++) {
			vals2[i+1+n][t] = 1;
			holes[i] = new Point(in.nextDouble(), in.nextDouble());
		}
		
		for (int i = 1; i <= n; i++) {
			Point temp = gopher[i-1];
			for (int j = 1; j<= m; j++) {
				Point temp2 = holes[j-1];
				double dist = Math.sqrt(Math.pow(temp.x - temp2.x, 2) + Math.pow(temp.y - temp2.y, 2));
				if (sec >= dist/v) {
					vals2[i][j+n] = 1;
				}
			}
		}

		p = new int[n+m+2];
		fs = new int[n+m+2];
		fordFulkerson(s, t);

		System.out.println(n-mf);
		}
	
	}
	
	static int n;
	static int[] match;
	static int mf;
	static int[] vis;
	static int m;
	static int s;
	static int t;
	static int[][] vals2;
	static int f;
	static int[] fs;
	static int[] p;

	static int bfs(int s, int t) {
		boolean[] visited = new boolean[n+m+2];
		visited[s] = true;
		Deque<Integer> q = new ArrayDeque<Integer>();
		p[s] = -1;
		q.addLast(s);
		fs[s] = INF;
		while(!q.isEmpty()) {
			int u = q.poll();
			for (int v  = 0; v <= n+m+1; v++) {
				if (!visited[v] && vals2[u][v] > 0) {
					q.add(v);
					p[v] = u;
					visited[v] = true;
					fs[v] = Math.min(fs[u], vals2[p[v]][v]);

				}
			}
		}
		if (visited[t])
			return (int)fs[t];
		else return 0;
	}

	static void fordFulkerson(int s, int t) {
		mf = 0;
		while((f = bfs(s,t)) > 0) {

			for (int v = t; v != s; v = p[v]) {
				vals2[p[v]][v] -= f;
				vals2[v][p[v]] += f;

			}
			mf += f;

		}

	}
	
}
