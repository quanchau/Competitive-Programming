import java.util.*;
public class VirtualFriends {
	static int[] arr;
	static int[] map2;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
			arr = new int[2*n];
			int ind = 1;
			map2 = new int[2*n];
			for (int i = 0; i < 2*n; i++) {
				arr[i] = i;
				map2[i] = 1;
			}
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for (int i = 0; i< n; i++) {
				String x1 = in.next();
				String x2 = in.next();
				if (!map.containsKey(x1)) {
					map.put(x1, ind);
					ind++;
				}
				if (!map.containsKey(x2)) {
					map.put(x2, ind);
					ind++;
				}
				int temp1 = map.get(x1);
				int temp2 = map.get(x2);
				union(temp1, temp2);
				
				}
				
				
			}
		}
	
	
	public static void union(int x1, int x2) {
		int num = find(x1);
		int num2 = find(x2);
		int temp1 = map2[num];
		int temp2 = map2[num2];
		if (num != num2) {
		if (temp1 == 1 && temp2 == 1) {
			map2[num2] = 2;
			System.out.println(2);
		} else {
			map2[num2] = temp1 + temp2;
			System.out.println(temp1 + temp2);
			
		}
			arr[num] = num2;
		} else {
			System.out.println(map2[num2]);
		}
		
		
	}
	

	public static int find(int x) {
		if (arr[x] == x) {
			return x;
		} else {
			arr[x] = find(arr[x]);
			return arr[x];
		}
	}
}
