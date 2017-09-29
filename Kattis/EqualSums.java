import java.util.*;
public class EqualSums {
	static int[] arr;
	static boolean[] visited;
	static boolean done;
	static int n;
	static HashMap<Integer, ArrayList<Integer>> map;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		for (int i_t = 0; i_t < t; i_t++) {
			n = in.nextInt();
			visited = new boolean[3000000];
			picked = new boolean[n];
			done = false;
			map = new HashMap<Integer, ArrayList<Integer>>();
			
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			Arrays.sort(arr);
			System.out.println("Case #" + (i_t+1) + ":");
			generate(0, 0);
			if (!done) {
				System.out.println("Impossible");
			}
			
		}
		
		
	}

	
	static boolean[] picked;
	public static void generate(int at, int sum) {
		if (done) {
		} else {
			
		if (at == n) {
			if (visited[sum] && sum != 0) {
				boolean yes=  true;
				ArrayList<Integer> temp = map.get(sum);
				ArrayList<Integer> temp1 = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					if (picked[i]) {
						if (temp.contains(arr[i])) {
							yes = false;
							break;
						} 
						temp1.add(arr[i]);
					}
				}
				if (yes) {
				for (int i = 0; i< temp1.size(); i++) {
					if (i == temp1.size() -1) {
						System.out.println(temp1.get(i));
					} else {
					System.out.print(temp1.get(i) + " ");
					}
				}
				for (int i = 0; i< temp.size(); i++) {
					if (i == temp.size() -1) {
						System.out.println(temp.get(i));
					} else {
					System.out.print(temp.get(i) + " ");
					}
				}
		
				done = true;
				}
			} else {
				visited[sum] = true;
				ArrayList<Integer> temp = new ArrayList<Integer>();
				for (int i = 0; i < n; i++) {
					if (picked[i]) {
						temp.add(arr[i]);
					}
				}
				map.put(sum, temp);
			}
		} else {
			picked[at] = true;
			generate(at+1, sum + arr[at]);
			
			picked[at] = false;
			generate(at+1, sum);
		}
		}
	}
}
