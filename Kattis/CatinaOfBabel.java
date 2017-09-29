import java.util.*;
public class CatinaOfBabel {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n =in.nextInt();
		in.nextLine();
		visited = new boolean[n];
		HashMap<Integer, HashSet<String>> map= new HashMap<Integer, HashSet<String>>();
		adj = new HashMap<Integer, ArrayList<Integer>>();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			adj.put(i, new ArrayList<Integer>());
			String s = in.nextLine();
			String[] ses = s.split(" ");
			arr[i] = ses[1];
			HashSet<String> temp = new HashSet<String>();
			for (int j = 1; j < ses.length; j++) temp.add(ses[j]);
			map.put(i, temp);
		}
		
		for (int i = 0; i < n; i++) {
			HashSet<String> list1 = map.get(i);
			for (int j = i+1; j < n; j++) {
				HashSet<String> list2 = map.get(j);
				if (list1.contains(arr[j]) && list2.contains(arr[i])) {
					adj.get(i).add(j);
					adj.get(j).add(i);
				}
				
			}
		}
		int max = -1;
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				int temp = dfs(i);
				if (temp > max) max = temp;
			}
		}
		System.out.println(n - max);
		
		
			
	}
	static int n;
	static HashMap<Integer, ArrayList<Integer>> adj;
	static boolean[] visited;
	public static int dfs(int index) {
		int res = 0;
		if (index < n && !visited[index]) {
			visited[index] = true;
			ArrayList<Integer> temp = adj.get(index);
			res = 1;
			for (int i : temp) {
				res = res + dfs(i);
			}
		}
		return res;
	}
}
