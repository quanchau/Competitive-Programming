import java.util.*;
public class Dominoes2 {
	static HashMap<Integer, ArrayList<Integer>> map;
	static boolean[] visited;
	static int n;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t <t; i_t++) {
			n =in.nextInt();
			int m= in.nextInt();
			int l = in.nextInt();
			visited = new boolean[n+1];
			map = new HashMap<Integer, ArrayList<Integer>>();
			for (int i = 0; i <n; i++) {
				map.put(i+1, new ArrayList<Integer>());
			}
			for (int i = 0; i <m; i++) {
				int u = in.nextInt();
				int v = in.nextInt();
				map.get(u).add(v);
			}
			int[] knocked = new int[l];
			count = 0;
			
			for (int i = 0; i< l; i++) {
				generate(in.nextInt());
			}
			System.out.println(count);
		
		}
	}
		static int count;
		public static void generate(int num) {
			if (!visited[num]) {
				visited[num] = true;
				count++;
				ArrayList<Integer> temp = map.get(num);
				for (int i : temp) {
					generate(i);
				}
			}
		}
	
}
