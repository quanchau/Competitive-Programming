import java.util.Scanner;
public class PowerStringsMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String s = in.next();
			if (s.equals(".")) {
				break;
			}
			int n = s.length();
			char[] str = s.toCharArray();
			int[] next=  new int[10000005];
			int j = 0;
			if (n > 1) {
			for (int i =2; i <=n; i++) {
				while (j > 0 && str[i-1] != str[j]) {
					j = next[j];
				}
				if (str[i-1] == str[j]) {
					j++;
				}
				next[i] = j;
			}
			System.out.println(n/(n - next[n]));
			} else {
				System.out.println(1);
			}
		}
	}
}
			