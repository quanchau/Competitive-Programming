import java.util.*;
public class GrowlingGears {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
			double max = -1;
			int res = -1;
			for (int i = 0; i < n; i++) {
				int a = -(in.nextInt());
				int b = in.nextInt();
				int c = in.nextInt();
				double delta = b*b - 4*a*c;
				if ((-delta)/(4*(a)) > max || res == -1) {
					max = (-delta)/(4*a);
					res = i+1;
				}
			}
			System.out.println(res);
		}
	}
}
