import java.util.*;
public class Freckles {
	static int[] list;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
			if (n == 0 || n== 1) {
				System.out.println("0.00");
			
			} else {
			list = new int[n];
			for (int i = 0;i < n ; i++) list[i] = i;
			Point[] pts = new Point[n];
			for (int i = 0; i< n; i++) {
				double x= in.nextDouble();
				double y = in.nextDouble();
				pts[i] = new Point(x, y);
			}
			
			PriorityQueue<Edge> edges = new PriorityQueue<Edge>(new CompareEdge());
			for (int i = 0; i < n; i++) {
				for (int j = i+1; j < n; j++) {
					double distance = Math.sqrt(Math.pow(pts[i].x - pts[j].x, 2) + Math.pow(pts[i].y - pts[j].y, 2));
					edges.add(new Edge(i, j, distance));
				}
			}
			
			double sum = 0;
			while(!edges.isEmpty()) {
				Edge temp = edges.poll();
				if (find(temp.i1) != find(temp.i2)) {
					sum+= temp.dis;
					union(temp.i1, temp.i2);
				}
			}
			
			System.out.printf("%.2f", sum);
			System.out.println();
			
			}
		}
	}
	
	public static int find(int i) {
		if (list[i] == i) return i;
		else {
			list[i] = find(list[i]);
			return list[i];
		}
	}
	
	public static void union(int i1, int i2) {
		list[find(i1)] = find(i2);
	}
	public static class CompareEdge implements Comparator<Edge> {
		public int compare(Edge p1, Edge p2) {
			return Double.compare(p1.dis, p2.dis);
		}
	}
	
	public static class Edge {
		int i1;
		int i2;
		double dis;
		public Edge(int p11, int p22, double diss) {
			i1 = p11;
			i2 = p22;
			dis = diss;
		}
	}
	public static class Point {
		double x;
		double y;
		public Point(double xx, double yy) {
			x= xx;
			y = yy;
		}
	}
}
