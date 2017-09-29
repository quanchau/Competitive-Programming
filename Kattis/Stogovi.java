import java.util.*;

public class Stogovi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			String s = in.next();
			int num = in.nextInt();
			String temp = s + "" + num;
			if (s.equals("c")) {
				temp+= in.nextInt();
			}
			arr[i] = temp;
		}
		
	}
}
