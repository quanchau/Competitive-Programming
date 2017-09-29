import java.util.*;
public class ColoringSocks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int c = in.nextInt();
		int k = in.nextInt();
		long[] arr = new long[n];
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextLong();
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1L);
			} else {
				map.put(arr[i], map.get(arr[i]) +1L);
			}
		}
		Arrays.sort(arr);
		long res = 0;
		for (int i = 0 ; i < n; i++) {
			long num = map.get(arr[i]);
			long temp = arr[i];
			long cur = map.get(temp);
			res += cur/c;
			cur = cur%c;
			long rem = c - cur%c; 
			if (cur > 0) {
				res++;
				for(int j = 1; j <= k; j++) {
				if (map.containsKey(temp+j)) {
					long num2 = map.get(temp+j);
					if (num2 >= rem) {
						num2 -= rem;
						map.put(temp+j, num2);
						break;
					} else {
						rem-= num2;
						num2 = 0;
						
						map.put(temp+j, num2);
					}
					
				}
					
				}
			}
			map.put(temp, 0L);
		
		}
		System.out.println(res);
		
		
	}
}
