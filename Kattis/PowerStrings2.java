import java.util.*;
public class PowerStrings2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			if (s.equals(".")) {
				break;
			}
			int res =1;
			boolean got = true;
			int len = s.length();
			for (int i = 1 ; i <= len/2; i++) {
				while (i <= len/2 && s.charAt(i) != s.charAt(0)) {
					i++;
				}
				if (len%i == 0) {
					for (int j = i; j < len; j++) {
						if(s.charAt(j) != s.charAt(j%i)) {
							got = false;
							break;
						}
					}
					if (got) {
						res = len/i;
						break;
					}
				}
				got = true;
			}
			System.out.println(res);
		}
	}
}