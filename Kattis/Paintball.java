import java.util.*;
public class Paintball {
	static HashMap<Integer, ArrayList<Integer>> adj;
	static final int INF= 1000000007;
	static StringBuffer buffer;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		s = 0;
		t = n+1;
		p = new int[n+2];
		fs = new long[n+2];
		buffer = new StringBuffer();
		adj = new HashMap<Integer, ArrayList<Integer>>();
		adj.put(s, new ArrayList<Integer>());
		vals1 = new long[n+2][n+2];
		vals2 = new long[n+2][n+2];
		for (int i = 1; i <= n; i++) {
			adj.put(i, new ArrayList<Integer>());
			adj.get(s).add(i);
			adj.get(i).add(t);
			vals2[s][i] = INF;
			vals2[i][t] = INF;
			vals1[s][i] = INF;
			vals1[i][t] = INF;
			
		}
		
		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			vals2[u][v] = 1;
			vals1[u][v] = 1;
			vals1[v][u] = 1;
			vals2[v][u] = 1;
			adj.get(u).add(v);
			adj.get(v).add(u);
		
		}
		fordFulkerson(s, t);
		System.out.println(mf);
		
		
	
	}
	

	static int n;
	static int m;
	static int s;
	static int t;
	static int o;
	static long[][] vals1;
	static long[][] vals2;
	static long mf;
	static long f;
	static long[] fs;
	static int[] p;


	static long bfs(int s, int t) {
		boolean[] visited = new boolean[n+2];
		visited[s] = true;
		Deque<Integer> q = new ArrayDeque<Integer>();
		p[s] = -1;
		q.add(s);
		fs[s] = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			int u = q.remove();
			for (int v = 0; v < n; v++) {
				if (!visited[v] && vals2[u][v] > 0) {
					q.add(v);
					p[v] = u;
					visited[v] = true;
					fs[v] = Math.min(fs[u], vals2[p[v]][v]);
					break;
				}
			}
		}
		if (visited[t])
			return fs[t];
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
		/**StringBuffer buffer = new StringBuffer();
		int c = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (vals1[i][j] > 0 && vals2[i][j] < vals1[i][j]) {
					c++;
					buffer.append(i + " " + j + " "+  (vals1[i][j] - vals2[i][j]) + "\n");
				}
			}
		}
		
		
		System.out.println(n+ " " + mf + " " + c);

		System.out.println(buffer);*/
		buffer = new StringBuffer();

	}
	
}

