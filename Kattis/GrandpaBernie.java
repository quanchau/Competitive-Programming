import java.util.*;
public class GrandpaBernie {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			int y = in.nextInt();
			if (!map.containsKey(s)) {
				ArrayList<Integer> temp = new ArrayList<Integer>();
				temp.add(y);
				map.put(s, temp);
			} else {
				map.get(s).add(y);
			}
		}
		
		for (ArrayList<Integer> i: map.values()) {
			Collections.sort(i);
		}
		int q= in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			int y = in.nextInt();
			System.out.println(map.get(s).get(y-1));
		}
	}
}
