import java.util.*;
public class TornToPieces {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		adj = new HashMap<String, ArrayList<String>>();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String s = in.nextLine();
			String[] temp = s.split(" ");
			if (!adj.containsKey(temp[0])) adj.put(temp[0], new ArrayList<String>());
			for (int j =1; j < temp.length; j++) {
				adj.get(temp[0]).add(temp[j]);
				if (!adj.containsKey(temp[j])) adj.put(temp[j], new ArrayList<String>());
				adj.get(temp[j]).add(temp[0]);
			}
		}
		visited = new HashSet<String>();
		ok = false;
		String start = in.next();
		des = in.next();
		ArrayDeque<String> deque= new ArrayDeque<String>();
		deque.add(start);
		generate(start, deque);
		if (!ok) {
			System.out.println("no route found");
		}
		
		
	}
	static boolean ok;
	static int n;
	static String des;
	static HashSet<String> visited;
	static HashMap<String, ArrayList<String>> adj;
	public static void generate(String s, ArrayDeque<String> st) {
		if (!visited.contains(s) && !ok) {
			if (s.equals(des)) {
				ok = true;
				while(st.size() > 0) {
					System.out.print(st.remove() + " ");
				}
					
			}
			visited.add(s);
			if (adj.containsKey(s)) {
			ArrayList<String> temp = adj.get(s);
			for (String t : temp) {
				st.addLast(t);
				generate(t, st);
				if (!st.isEmpty())
				st.removeLast();
			}
			}
		}
	}
}
