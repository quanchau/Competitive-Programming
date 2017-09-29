import java.util.*;
public class MaximumFlow {


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
	static final int INF = 1000000007;
	static HashMap<Integer, ArrayList<Integer>> adj;

	static long bfs(int s, int t) {
		boolean[] visited = new boolean[n];
		visited[s] = true;
		Deque<Integer> q = new ArrayDeque<Integer>();
		p[s] = -1;
		q.add(s);
		fs[s] = Integer.MAX_VALUE;
		while(!q.isEmpty()) {
			int u = q.remove();
			ArrayList<Integer> temp = adj.get(u);
			for (int v = 0; v < n; v++) {
				if (!visited[v] && vals2[u][v] > 0) {
					q.add(v);
					p[v] = u;
					visited[v] = true;
					fs[v] = Math.min(fs[u], vals2[p[v]][v]);
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
		res = new boolean[n];
		generate(s);
		System.out.println(count);
		System.out.println(buffer);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		s = in.nextInt();
		t = in.nextInt();
		p = new int[505];
		fs = new long[505];
		adj = new HashMap<Integer, ArrayList<Integer>>();
		vals1 = new long[505][505];
		vals2 = new long[505][505];
		for (int i = 0; i < n; i++) {
			adj.put(i, new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int w = in.nextInt();
			vals1[u][v] = w;
			vals2[u][v] = w;

			adj.get(u).add(v);


		}

		fordFulkerson(s, t);
	}
	
	static long count;
	static StringBuffer buffer;
	static boolean[] res;
	public static void generate(int index) {
		if (!res[index]) {
			count++;
			res[index] = true;
			buffer.append(index + "\n");
			//ArrayList<Integer> temp = adj.get(index);
			for (int i = 0; i < n; i++) {
				if (vals2[index][i] >0) {
					generate(i);
				}
			}
		}
	}

}
