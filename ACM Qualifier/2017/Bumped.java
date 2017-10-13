import java.util.*;
public class Bumped {
	static long[] dist;
	static final long INF= Long.MAX_VALUE;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int f = in.nextInt();
		int s = in.nextInt();
		int t = in.nextInt();
		dist = new long[n];
		HashMap<Integer, ArrayList<Node>> map = new HashMap<Integer, ArrayList<Node>>(); 
		HashMap<Integer, ArrayList<Node>> map2 = new HashMap<Integer, ArrayList<Node>>(); 

		for (int i = 0; i < n; i++) {
			map.put(i, new ArrayList<Node>());
			map2.put(i, new ArrayList<Node>());
		}
		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			long p = in.nextLong();
			map.get(u).add(new Node(v, p, false));
			map.get(v).add(new Node(u, p, false));
		}
		long res = INF;
		for (int i = 0; i < f; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			map2.get(u).add(new Node(v, 0, true));
		}
			for (int j = 0; j < n; j++) {
				dist[j]  =INF;
				
			}
			//boolean[] visited = new boolean[n];
			PriorityQueue<Node> queue = new PriorityQueue<Node>();
			queue.add(new Node(s, 0, false));
			dist[s] = 0;
			while (!queue.isEmpty()) {
				Node cur = queue.remove();
				ArrayList<Node> list = map.get(cur.des);

				for (Node node : list) {
					long newDist = dist[cur.des] + node.val;
					if (newDist < dist[node.des]) {
						dist[node.des] = newDist;
						queue.add(new Node(node.des, 0, node.taken));
				
					}
				}
				if (!cur.taken) {
				ArrayList<Node> list2 = map2.get(cur.des);
				for (Node node : list2) {
					long newDist = dist[cur.des] + node.val;
					if (newDist < dist[node.des]) {
						dist[node.des] = newDist;
						queue.add(new Node(node.des, 0, true ));
						
					}
				}
				}
			}
			res = Math.min(res, dist[t]);
		
		
		System.out.println(res);
		
	}
	
	public static class Node implements Comparable<Node> {
		int des;
		long val;
		boolean taken;
		public Node(int d, long v, boolean t) {
			des = d;
			val = v;
			taken = t;
		}
		public int compareTo(Node n2) {
			return Long.compare(dist[des], dist[n2.des]);
		}
	}
}
