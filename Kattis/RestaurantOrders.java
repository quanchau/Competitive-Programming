import java.util.*;
public class RestaurantOrders {
	static int[] menu;
	static int[] orders;
	static boolean[][] mem;
	static     HashMap<Integer, int[]> map;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		menu = new int[m];
		for (int i = 0; i <m; i++) {
			menu[i] = in.nextInt();
		}
		int n = in.nextInt(); 
		orders= new int[n];
		int[] unsorted = new int[n];
		for (int i = 0; i < n; i++) {
			orders[i] = in.nextInt();
			unsorted[i] = orders[i];
		}
		Arrays.sort(menu);
		Arrays.sort(orders);
		map = new  HashMap<Integer, int[]>();
		mem = new boolean[100000][m];
		generate(0, 0, new int[m], 0);
		for (int i = 0; i < n; i++) { 
			if (map.get(unsorted[i]) == null) {
				System.out.print("Impossible");
			} else if (map.get(unsorted[i]).length == 0) {
				System.out.print("Ambiguous");
			} else {
				boolean ok = false;
				int[] res = map.get(unsorted[i]);
				for (int l = 0; l < res.length; l++) {  
					for (int j = 0; j < res[l]; j++) {
						if (!ok) {
							System.out.print(l+1);
							ok = true;
						} else {
						
						System.out.print(" " + (l+1));
						}
					}
					

				}
				
			}
			System.out.println();
		}



	}


	public static void generate(int ind, int sum, int[] count, int o) {
		if (o < orders.length) {
			if (sum > orders[o]) {while (o+1 < orders.length &&orders[o+1] == orders[o]) { o++;}generate(ind, sum, count, o+1); }
			else if (sum == orders[o]) {
				if (!map.containsKey(orders[o])) {
					int[] res = count.clone();
					map.put(orders[o], res);
				} else {
					int[] res = new int[0];
					map.put(orders[o], res);
				}
				while (o+1 < orders.length && orders[o+1] == orders[o]) {o++;}
				generate(ind, sum, count, o+1);
			} else if (sum < orders[o] && !mem[sum][ind]) {
				mem[sum][ind] = true;
				for (int i = ind; i < menu.length; i++) {
					count[i]++;
					generate(i, sum+menu[i], count, o);
					count[i]--;
				}
			}
		}
	}
}

