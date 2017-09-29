import java.util.*;
import java.util.stream.Collectors;
public class Batmanacci {
	static int n;
	static long k;
	static long[] arr;
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 k = in.nextLong();
		 if (n > 90) {
		 if (n%2 == 0) {
			 n = 90;
		 } else {
			 n = 89;
		 }
		 }
		 arr = new long[91];
		 int num = 1;
		 arr[1] = 1;
		 arr[2] = 1;
		 for (int i = 3; i < 91; i++) {
			 arr[i] = arr[i-1] + arr[i-2];
		 }
		 System.out.println(generate(n));
		 
	}
	
	public static String generate(int n) {
		if (n == 1) {
			return "N";
		} else if (n==2) {
			return "A";
		} else {
			if (k > arr[n-2]) {
				k -= arr[n-2];
				n -= 1;
			
				
			} else {
				n-= 2;
			}
			return generate(n);
		}
	}


	
	
}
