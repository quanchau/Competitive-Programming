import java.util.*;
public class BreakingBad {
	static int[] arr;
	static ArrayList<ArrayList<Integer>> adj;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		 adj = new ArrayList<ArrayList<Integer>>();
		list = new String[n];
		arr = new int[n];
		vals = new int[n];
		for (int i = 0; i < n; i++) {
			String s  = in.next();
			map.put(s, i);
			list[i] = s; 
			arr[i] = i;
			vals[i] = -1;
			adj.add(new ArrayList<Integer>());
		}
	
		int m = in.nextInt();
	


		
		for (int i = 0; i < m; i++) {
			String s1 = in.next();
			String s2 = in.next();
			int num1 = map.get(s1);
			int num2 = map.get(s2);
			adj.get(num1).add(num2);
			adj.get(num2).add(num1);
		}
		
		list1 = new ArrayList<String>();
		list2 = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			if (vals[i] == -1) {
				vals[i] = 0;
				list1.add(list[i]);
				generate(i);
			}
		}

		if (ok) System.out.println("impossible");
		else {
			for (String s : list1) {
				System.out.print(s + " ");
			}
			System.out.println();
			for (String s : list2) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}
	static boolean ok;
	static String[] list;
	static ArrayList<String> list1;
	static ArrayList<String> list2;
	static int[] vals;
	public static void generate(int ind) {
		ArrayList<Integer> temp = adj.get(ind);
		for (int i : temp) {
			if (vals[i] == -1) {
				vals[i] = 1 - vals[ind];
				if (vals[i] == 0) {
					list1.add(list[i]);
				} else {
					list2.add(list[i]);
				}	
				generate(i);
			} else if (vals[i] != 1 - vals[ind]) {
				ok = true;
			}
		}
	}
	

}
