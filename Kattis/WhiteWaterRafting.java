import java.util.*;
public class WhiteWaterRafting {
	
	public static class Point {
		double x;
		double y;
		public Point(double xx, double yy) {
			x = xx;
			y = yy;
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n =in.nextInt();
			Point[] inner = new Point[n];
			for (int i = 0; i < n; i++) {
				inner[i] = new Point(in.nextDouble(), in.nextDouble());
			}
			int m = in.nextInt();
			Point[] outer = new Point[m];
			for (int i = 0; i < m; i++) {
				outer[i] = new Point(in.nextDouble(), in.nextDouble());
			}
			double min = 1000000007;
			for(int i = 0; i < n; i++) {
				Point c = inner[i];
				for (int j = 0; j <m; j++) {
					if (j == m-1) {
						min = Math.min(min, closest(outer[m-1], outer[0], c));
					}
					else min = Math.min(min, closest(outer[j], outer[j+1], c));
				}
			}
			
			for(int i = 0; i < m; i++) {
				Point c = outer[i];
				for (int j = 0; j <n; j++) {
					if (j == n-1) {
						min = Math.min(min, closest(inner[n-1], inner[0], c));
					}
					else min = Math.min(min, closest(inner[j], inner[j+1], c));
				}
			}
			min = min/2;
			String s = "" + min;
			
				System.out.printf("%.8f", min);
		
		
		System.out.println();
		}
	}
	
	static double dot(Point a, Point b) {
		return a.x*b.x + a.y*b.y;
	}
	
	static double norm(Point a, Point b) {
		return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
	}
	
	static double closest(Point a, Point b, Point c) {
	
			if (dot(new Point(b.x - a.x, b.y - a.y), new Point(c.x - b.x, c.y - b.y))>0 ) return norm(b, c);
			if (dot(new Point(a.x - b.x, a.y - b.y), new Point(c.x - a.x, c.y - a.y)) > 0) return norm(a,c);
			
		
		
		double t = dot(new Point(c.x - a.x, c.y-a.y), new Point(b.x - a.x, b.y - a.y))/norm(b, a);
		Point temp = new Point(a.x +(b.x*t - a.x*t)/norm(a,b), a.y + (b.y*t - a.y*t)/norm(a,b));
		return norm(temp, c);
	}
	

}
