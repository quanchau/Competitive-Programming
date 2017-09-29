import java.util.*;
public class Jabuke {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Point one = new Point(in.nextDouble(), in.nextDouble());
		Point two = new Point(in.nextDouble(), in.nextDouble());
		Point three = new Point(in.nextDouble(), in.nextDouble());
		double a = area(one, two, three);
		System.out.println(a);
		int n = in.nextInt();
		int count = 0;
		for (int i  =0 ; i< n; i++) {
			Point four = new Point(in.nextDouble(), in.nextDouble());
			if (area(one, two, four) + area(two, three,four) + area(one, three, four) == a) {
				count++;
			}
		}
		System.out.println(count);
		
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
		return Math.abs((a.x*(b.y - c.y) + b.x*(c.y - a.y) + c.x*(a.y - b.y)))/2;
	}

}
