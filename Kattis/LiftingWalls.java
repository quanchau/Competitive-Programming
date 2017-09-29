import java.util.*;

public class LiftingWalls {
	static double l;
	static double w;
	static int[] x;
	static int[] y;
	static boolean[] visitedC;
	static int max;
	static int n;
	static int r;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		l = in.nextInt();
		w = in.nextInt();
		n = in.nextInt();
		r = in.nextInt();
		x = new int[n];
		y = new int[n];
		visitedC = new boolean[n];
		for (int i = 0; i< n; i++) {
			x[i] = in.nextInt();
			y[i] = in.nextInt();
		}
		max = n+1;
		generate(0, 0, new boolean[5]);
		if (max == n+1) {
			System.out.println("Impossible");
		} else {
		System.out.println(max);
		}
	}
	

	public static void generate(int count, int countC, boolean[] visited) {
		if (count == 4 && countC < max) {
			max = countC;
		} else {
			for (int i = 0; i< n; i++) {
				if (!visitedC[i]) {
					boolean ok = false;
					boolean[] temp = new boolean[5];
					int tempC = count;
					for (int q = 1; q< 5; q++) {
						temp[q] = visited[q];
					}
					if (!visited[1] && Math.sqrt(Math.pow(x[i] - (-l/2),2) + Math.pow(y[i], 2)) <= r) {
						temp[1] = true;
						tempC++;
						ok = true;
					}
					if (!visited[2] && Math.sqrt(Math.pow(x[i] - (l/2),2) + Math.pow(y[i], 2)) <= r) {
						temp[2] = true;
						tempC++;
						ok = true;
					}
					if (!visited[3] &&Math.sqrt(Math.pow(x[i],2) + Math.pow(y[i]- (-w/2), 2)) <= r) {
						temp[3] = true;
						tempC++;
						ok = true;
					}
					if (!visited[4] && Math.sqrt(Math.pow(x[i],2) + Math.pow(y[i] - (w/2), 2)) <= r) {
						temp[4] = true;
						tempC++;
						ok = true;
					}
					visitedC[i] = true;
					if (ok) {
						generate(tempC, countC+1, temp);
					}
					visitedC[i] = false;
				}
				
			}
		}
	}
	
	
}
