import java.util.*;
public class MinimumCut {
	static HashMap<Integer, ArrayList<Integer>> adj;
	static long[][] vals;
	static final int INF= 1000000007;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		s = in.nextInt();
		t = in.nextInt();
		p = new int[n];
		buffer = new StringBuffer();
		adj = new HashMap<Integer, ArrayList<Integer>>();
		vals = new long[n][n];
		res = new boolean[n];
		for (int i = 0; i < n; i++) {
			adj.put(i, new ArrayList<Integer>());
		}
		
		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			int w = in.nextInt();
			vals[u][v] = w;
			vals[v][u] = w;
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
		
		mf = 0;
		while (true) {
			f = 0;
			Deque<Integer> q = new ArrayDeque<Integer>();
			boolean[] dist = new boolean[n];
			dist[s] = true;
			q.add(s);
			for (int i = 0; i < n; i++) p[i] = -1;
			while(!q.isEmpty()) {
				int u = q.remove();
				if (u == t) break;
				ArrayList<Integer> temp = adj.get(u);
				for (int i : temp) {
					if (vals[u][i] > 0 && !dist[i]) {
						dist[i] = true;
						q.add(i);
						p[i] = u;
					}
				}
				
			}
			augment(t, INF);
			if (f==0) break;
			mf += f;
		}
		
		generate(s);

		System.out.println(count);
		System.out.println(buffer);

	}
	
	static StringBuffer buffer;
	static boolean[] res;
	static int[] p;
	static long f;
	static int s;
	static int t;
	static long mf;
	static int count;
	
	public static void augment(int v, long minEdge) {
		if (v == s) {
			f = minEdge;
		} else if (p[v] != -1) {
			augment(p[v], Math.min(minEdge, vals[p[v]][v]));
			vals[p[v]][v] -= f;
			vals[v][p[v]] += f;
		}
	}
	
	public static void generate(int index) {
		if (!res[index]) {
			count++;
			res[index] = true;
			buffer.append(index + "\n");
			ArrayList<Integer> temp = adj.get(index);
			for (int i : temp) {
				if (vals[index][i] >0) {
					generate(i);
				}
			}
		}
	}
	
	
	
}
