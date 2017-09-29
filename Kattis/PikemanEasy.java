import java.util.*;
public class PikemanEasy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long t = in.nextLong();
		long a = in.nextLong();
		long b = in.nextLong();
		long c= in.nextLong();
		long t0 = in.nextLong();
	//	PriorityQueue<Integer> list = new PriorityQueue<Integer>();
	//	list.add(t0);
		long[] arr = new long[n];
		arr[0] = t0;
		for (int i = 1; i<n; i++) {
			arr[i] = ((a*arr[i-1]+b)%c) +1;
		
		}
		Arrays.sort(arr);
		long time = 0;
		long count = 0;
		long passed = 0;
		for (long i :arr) {
			if (passed + i <= t) {
			time = (time +passed + i) ;
			passed += i;
			count++;
			} else {
				break;
			}
		}
	   System.out.println(count + " " + (time%1000000007));
	}
}
