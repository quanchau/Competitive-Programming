import java.util.*;
public class ClosestSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 1;
		while (in.hasNext()) {
			System.out.println("Case " + count + ":");
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i< n; i++) {
				arr[i] = in.nextInt();
				
			}
			
			int m = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i< n; i++) {
				for (int j = i+1; j < n; j++) {
					list.add(arr[i] + arr[j]);
				}
			}
			Collections.sort(list);
			for (int i = 0; i<m ;i++) {
				int num = in.nextInt();
				int max = list.get(0);
				for (int t : list) {
					if (Math.abs(t-num) > Math.abs(max - num)) {
						break;
					} else {
						max = t;
					}
				}
				System.out.println("Closest sum to " + num + " is " + max + ".");
			}
			count++;
		}
		
	}
}
