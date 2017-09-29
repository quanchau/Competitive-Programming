import java.util.*;
public class ClosingTheLoop {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			int n = in.nextInt();
			ArrayList<Integer> red = new ArrayList<Integer>();
			ArrayList<Integer> blue = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				String s = in.next();
				if (s.charAt(s.length()-1) == 'R') {
					red.add(Integer.parseInt("" + s.substring(0, s.length() -1)));
				} else {
					blue.add(Integer.parseInt("" + s.substring(0, s.length() -1)));
				}
			}
			Collections.sort(red);
			Collections.sort(blue);
			int num1 = red.size()-1;
			int num2 = blue.size() - 1;
			int total = 0;
			boolean red1 = true;
			int count = 0;
			if (num1 >= 0 && num2 >=0) {
			while (true) {
				if (num1 >= 0 && num2>=0) {
				total += red.get(num1) + blue.get(num2);
				count+=2;
				num1--;
				num2--;
				} else {
					break;
				}
			}
			}
			if (count == 1) {
				total = 0;
			}
			System.out.print("Case #" + (i_t +1)+ ": ");
			System.out.print(total - (count));
			System.out.println();
		}
		
		
		
	}
}
