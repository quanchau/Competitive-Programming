import java.util.*;

public class PolygonArea {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) break;
			Point m = new Point(in.nextDouble(), in.nextDouble());
			ArrayList<Point> list = new ArrayList<Point>();
			for (int i = 0; i < n-1; i++) {
				list.add(new Point(in.nextDouble(), in.nextDouble()));
			}
			double a = 0;
			for (int i = 0; i < list.size()-1; i++) {
				a += area(m, list.get(i), list.get(i+1));
			
			}
			if (a>0) {
			System.out.print("CCW ");
			} else {
				System.out.print("CW ");
			}
			System.out.printf("%.1f", Math.abs(a));
			System.out.println();
		}
	}
	
	public static class Point {
		double x;
		double y;
		public Point(double xx, double yy) {
			x = xx;
			y = yy;
		}
	}
	
	public static double area(Point a, Point b, Point c) {
		return (a.x*(b.y - c.y) + b.x*(c.y - a.y) + c.x*(a.y - b.y))/2;
	}
	

	
	
	

}
