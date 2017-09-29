package KattisPractice;
import java.util.*;

public class EasyAsCAB {
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String z = in.next();
		char c = z.charAt(0);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int i_n = 0; i_n < n; i_n++) {
			arr[i_n] = in.next();
		}
		int[] list = new int[c-'a' + 1];
		boolean imp = false;
		for (int i = 0; i < c-'a'+1; i++) {
			list[i] = INF;
		}
		for (int i = 0; i+1 < n; i++) {
			String s1 = arr[i];
			String s2 = arr[i+1];
			int index = 0;
			while (index < s1.length() && index < s2.length()) {
				if (s1.charAt(index) != s2.charAt(index)) {
					if (list[s1.charAt(index)-'a'] != INF && list[s2.charAt(index)-'a'] != INF && list[s2.charAt(index)-'a'] <=list[s1.charAt(index)-'a']) {
						imp = true;
						break;
					}
			
					if(list[s1.charAt(index)-'a'] == INF) {
						list[s1.charAt(index)-'a'] = 0;
					}
					if (list[s2.charAt(index) - 'a'] != INF) {
						for (int k = 0; k < c-'a' + 1; k++) {
							if (list[k] > list[s2.charAt(index) - 'a']) list[k]++;
						}
					}
					
					list[s2.charAt(index)-'a'] = list[s1.charAt(index)-'a']+1;
					 
					
					break;
				}
				index++;
			}
		}

	for (int i : list) System.out.print(i + " ");
		boolean amb = false;
		if (imp) System.out.println("IMPOSSIBLE");
		if (!imp) {
			HashSet<Integer> v = new HashSet<Integer>();
			for (int i : list) {
				if (v.contains(i) || i == INF) {
					amb = true;
					System.out.println("AMBIGUOUS");
					break;
				}
				v.add(i);
			}
		}
		if (!imp && !amb) {
			int max = -INF;
			HashMap<Integer, Character> map = new HashMap<Integer, Character>();
			for (int i = 0; i < c - 'a' + 1; i++) {
				map.put(list[i], (char) (i + 'a'));
				max = Math.max(max, list[i]);
			}
			StringBuffer res = new StringBuffer();
			for (int i = 0; i<=max; i++) {
				res.append(map.get(i));
			}
			System.out.println(res);
		}
		
		
		
	}
}
