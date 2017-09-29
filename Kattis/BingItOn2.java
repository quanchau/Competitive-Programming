import java.util.*;

public class BingItOn2 {
	static ArrayList<String> list;
	public static int findIndex(String s) {
		int low = 0;
		int high =list.size();
		int index = 0;
		while (low <= high) {
			int mid = (high+low)/2;
			if ((low == high && high == mid)) {
				index = mid;
				break;
			} 
			if (s.compareTo(list.get(mid)) <= 0) {
				high = mid;
			} else {
				low = mid + 1;
			}
		}
		return index;
		
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		list = new ArrayList<String>();
		
		for (int i_n = 0; i_n < n; i_n++) {
			String s = in.next();
			int index = findIndex(s);
			list.add(index,s);
//System.out.println(list);
			int count = 0;
			for (int i = index+1; i < list.size(); i++) {
				String s2 = list.get(i);
				boolean ok = true;
				for (int j = 0; j < s.length(); j++) {
					if (s.charAt(j) != s2.charAt(j)) {
						ok = false;
						break;
					}
				}
			
				if (ok) {
					count++;
				} else {
					break;
				}
			}
			System.out.println(count);
		}
		
	}
}