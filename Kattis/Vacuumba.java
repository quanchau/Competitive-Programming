import java.util.*;
public class Vacuumba {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();

		for (int i_t = 0; i_t <t ; i_t++) {
			int n = in.nextInt();
			double x = 0;
			double y =0;
			double a = 90;
			for (int i = 0; i < n; i++) {
				double angle = in.nextDouble();
				double dis = in.nextDouble();
				a += angle;
				x += dis*Math.cos(Math.toRadians(a));
				y+= dis*Math.sin(Math.toRadians(a));
			}
			System.out.printf("%.6f",x);
			System.out.print(" ");
			System.out.printf("%.6f", y);
			System.out.println();
		}



	}
}
