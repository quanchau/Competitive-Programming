import java.util.*;
public class BingItOn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Pair[] list = new Pair[n];
		
		for (int i_n = 0; i_n < n; i_n++) {
			String s = in.next();
			int count = 0;
			int maxSize = 33;
			for (int i= i_n-1; i>=0; i--) {
				String s2 = list[i].str;
				if (s.length() <= s2.length() && s2.length() < maxSize) {
					boolean ok = true;
					for (int j = 0; j < s.length(); j++) {
						if (s2.charAt(j) != s.charAt(j)) {
							ok = false;
							break;
						}
					}
					if (ok) {
						count++;
						if (list[i].res >0) {
							if (s2.length() == s.length()) {
							count+= list[i].res;
							break;
							}
							if (s2.length() < maxSize) {
								maxSize = s2.length();
								count += list[i].res;
							}
						}
					}
				}
			}
			list[i_n] = new Pair(count, s);
			System.out.println(count);
			
		}
	}
	public static class Pair {
		int res;
		 String str;
		 int size;
		public Pair(int num, String s1) {
			str= s1;
			res = num;
			
		}
	}
}
