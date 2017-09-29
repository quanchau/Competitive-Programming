import java.util.*;
import java.math.*;
public class BiasedStanding {
	static int n;
	static int[] arr;
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int t = in.nextInt();
			for (int i_t =0; i_t <t; i_t++) {
				n =in.nextInt();
				arr = new int[n];
				int total1 = 0;
				long total2 = 0;
				for (int i = 0; i < n; i++) {
					String s = in.next();
					arr[i]  = in.nextInt();
				
					
				}
				long num =1;
				Arrays.sort(arr);
				for (int i = 0; i < n; i++) {
					total2 += Math.abs(arr[i] - num);
					num++;
				}
				System.out.println(total2);
			}
		}
		
}
