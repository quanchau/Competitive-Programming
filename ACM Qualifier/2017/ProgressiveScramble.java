import java.util.*;
public class ProgressiveScramble {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			String s = in.next();
			String s1 = in.nextLine();
			if (s.equals("e")) System.out.println(encrypt(s1));
			else System.out.println(decrypt(s1));
		}
		
	}
	
	public static StringBuffer encrypt(String s) {
		StringBuffer b = new StringBuffer();
		char p = s.charAt(1);
		int prev = p - 'a' + 1;	
		if (s.charAt(1) == ' ') prev = 0;
	
		b.append(s.charAt(1));
	
		for (int i =2; i < s.length(); i++) {
			char c= s.charAt(i);
			if (c == ' ') {
				b.append(p);
			} else {
				prev = prev + (c - 'a'+1);
				if (prev%27 != 0) p = (char)(prev%27+'a'-1);
				else p = ' ';
				b.append(p);
			}
		}
		
		return b;
	}
	
	public static StringBuffer decrypt(String s) {
		StringBuffer b = new StringBuffer();
		char p = s.charAt(1);
		int prev = p - 'a' + 1;	
		if (s.charAt(1) == ' ') prev = 0;
	
		b.append(s.charAt(1));
		for (int i = 2; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') c= 'a' - 1;
				int t = 0;
				while ((c- 'a' + 1) + 27*t - prev < 0) {
					t++;
				}
				if ((c- 'a' + 1) + 27*t - prev ==0) {
					b.append(" ");
					
				} else {
					b.append((char)(((c- 'a' + 1) + 27*t  - prev) + 'a' -1));
				
					prev = (c- 'a' + 1) + 27*t;
				}

			
		}
		return b;
	}
}
