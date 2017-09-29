import java.util.*;
public class MinimumScalarProduct {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
			long[] x = new long[n];
			long[] y = new long[n];
			for (int i = 0; i < n; i++) {
				x[i] = in.nextInt();
			}
			for (int i = 0; i < n; i++) {
				y[i] = in.nextInt();
			}
			Arrays.sort(x);
			Arrays.sort(y);
			int startX = 0;
			int startY = 0;
			int endX = n-1;
			int endY = n-1;
			long sum = 0;
			while (startX <= endX && startY <= endY) {
			//	if (x[startX] > 0 && y[startY] > 0) {
					sum += x[startX] * y[endY];
					startX++;
					endY--;
				//} 
			/**	else if (x[startX] <= 0) {
						sum+= x[startX] * y[endY];
						startX++;
						endY--;
		
				}
				else if (y[startY] <= 0) {
						sum+= y[startY] * x[endX];
						startY++;
						endX--;
				}*/
			}
			System.out.println("Case #" + (i_t+1) +": " +sum);
			
		}
	}
}
