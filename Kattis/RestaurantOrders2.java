import java.util.*;
public class RestaurantOrders2 {
	static int n;
	static int[] menu;
	static int m;
	static int[] visited;
	static boolean[] success;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 menu = new int[n];
		 for (int i = 0; i < n; i++) {
			 menu[i] = in.nextInt();
		 }
		 m = in.nextInt();
		 for (int i = 0; i < m; i++) {
			 int order = in.nextInt();
			 visited = new int[order+1];
			 success = new boolean[order+1];
			 count = 0;
			 res = new ArrayList<Integer>();
			 generate(order);
			 Collections.sort(res);
			 for (int j = 1; j <= order; j++) {
				 if (visited[j] > 1 && success[j]) {
					 count += (visited[j]-1);
				 }
			 }
			 if (count > 1) {
				 boolean ok = false;
				 StringBuffer buffer = new StringBuffer();
				 if (res.size() > 0 && res.size()%count == 0) {
					 ok = true;
					 for (int v = 0 ; v < res.size(); v+= count) {
						 int temp = res.get(v);
						 for (int q = 1; q < count; q++) {
							 if(res.get(v+q) != temp) {
								 ok = false;
								 break;
							 }
						 }
						 buffer.append(temp + " ");
					 }
				 }
				 if (!ok)System.out.println("Ambiguous");
				 else System.out.println(buffer);
			 } else if (count == 0) {
				 System.out.println("Impossible");
			 } else {
			
					 for (int u : res) {
						 System.out.print(u + " ");
					 }
					 System.out.println();
				 }
			 
		
			 
		 }
		 
	}
	static ArrayList<Integer> res;
	static int count;
	public static boolean generate(int left) {
		if (left == 0) {
			count++;
			return true;
			
		}
		else if (left > 0 && visited[left] < 1) {
			visited[left]++;
			boolean ok = false;
			for (int i = 0; i < n; i++) {
				if (generate(left- menu[i])) {
					ok = true;
					res.add(i+1);
				}
			}
			success[left] = ok;
	
			return ok;
		}
		return false;
	}
}
