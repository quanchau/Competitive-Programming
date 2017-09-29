import java.util.*;
public class CountSubsequences {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			long sum = 0;
			long[] arr = new long[n];
			int count = 0;
		    HashMap<Long, Integer> arr2 = new HashMap<Long,Integer>();
			for (int j = 0; j < n; j++) {
				int num = in.nextInt();
				sum += num;
				arr[j] = sum;
				if (sum == 47) {
					count++;
				}
				if (arr2.get(sum) == null) {
					arr2.put(sum, 1);
				} else {
					arr2.put(sum, arr2.get(sum)+1);
				}
			    
			}
			
			
			for (int p = 0; p < arr.length; p++) {
				long num = arr[p];
				if (arr2.get(47+num) != null) {
					count+= arr2.get(47+num);
				}
				arr2.put(num, arr2.get(num)-1);
			}
			
			System.out.println(count);
		}
	}

}
