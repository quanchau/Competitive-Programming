import java.util.*;
public class MinimumSpanningTree {
	static int[] arr;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int m = in.nextInt();
			if (n == 0 && m == 0) break;
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] =i;
			}
			Edge[] list = new Edge[m];
			for (int i = 0; i < m; i++) {
				int u = in.nextInt();
				int v=  in.nextInt();
				//	union(u,v);
				list[i] = new Edge(u, v ,in.nextInt());
			}
			ArrayList<Edge> res = new ArrayList<Edge>();
			Arrays.sort(list, new CompareEdge());
			for (Edge i : list) {
				int u = i.u;
				int v = i.v;
				if (find(u) != find(v)) {
					union(u, v);
					res.add(i);
				}
			}
			int cur = find(arr[0]);
			boolean ok = true;
			for (int i : arr) {
				if (find(i) != cur) {
					ok = false;
					break;
				}
			}
			if (res.size() == 0 || !ok) {
				System.out.println("Impossible");
			} else {
				long total = 0;
				for (Edge i : res) {
					total += i.w;
				}
				Collections.sort(res, new CompareEdge2());
				System.out.println(total);
				for (Edge i: res) {
					System.out.println(Math.min(i.u, i.v) + " " + Math.max(i.u, i.v));
				}

			}
		}

	}

	public static class CompareEdge implements Comparator<Edge> {
		public int compare(Edge i1, Edge i2) {
			return Integer.compare(i1.w, i2.w);
		}
	}

	public static class CompareEdge2 implements Comparator<Edge> {
		public int compare(Edge i1, Edge i2) {
			if (Integer.compare(Math.min(i1.u, i1.v),Math.min(i2.u, i2.v)) != 0) {
				return Integer.compare(Math.min(i1.u, i1.v),Math.min(i2.u, i2.v));
			} else {
				return Integer.compare(Math.max(i1.u, i1.v),Math.max(i2.u, i2.v));
			}
		}
	}

	public static class Edge {
		int u;
		int v;
		int w;
		public Edge(int uu, int vv, int ww) {
			u = uu;
			v = vv;
			w = ww;
		}
	}

	public static void union(int i1, int i2) {
		arr[find(i1)] = find(i2);
	}

	public static int find(int i) {
		if (arr[i] == i) return i;
		else {
			arr[i] = find(arr[i]);
			return arr[i];
		}
	}
}
