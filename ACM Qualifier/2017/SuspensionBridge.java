import java.util.*;
public class SuspensionBridge {
	static final int INF = 1000000007;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		d = in.nextDouble();
		s = in.nextDouble();
		res = -INF;
		double start = 0;
		double end = INF;
	
		binarySearch(start, end);
	
		System.out.printf("%.4f",2*res*Math.sinh(d/(2*res)));
		
	}
	static double d;
	static double s;
	static double res;
	public static void binarySearch(double start, double end) {
		if (res == -INF && start < end) {
			double mid = ((start + end)/2);	
			double temp = cal(mid);
			
			if (Math.abs(temp - 0) <= 0.000001) {
				res = mid;
			}

			else if (temp - 0 < 0.000001) {
				binarySearch(start,mid);
			} else {
				binarySearch(mid, end);
			}
			
		}
	}
	
	public static double cal(double a) {
		return a*Math.cosh(d/(2*a))-s-a;
	}
}
