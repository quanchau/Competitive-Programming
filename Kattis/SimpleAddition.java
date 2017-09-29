import java.util.*;
public class SimpleAddition {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		int f = first.length()-1;
		int s = second.length() -1;
		int carry = 0;
		ArrayDeque<String> deque = new ArrayDeque<String>();
		while (f >=0 && s>=0) {
			int fi = Integer.parseInt("" + first.charAt(f));
			int se = Integer.parseInt("" + second.charAt(s));
			int res = fi + se + carry;
			
				carry = res/10;
			
			String temp = "" + res;
			if (f == 0 && s == 0) {
				deque.addFirst(temp );
			} else
			deque.addFirst("" +temp.charAt(temp.length()-1));
			f--;
			s--;
		}
		
		while (f >=0) {
			int fi = Integer.parseInt("" + first.charAt(f));
			int res = fi + carry;
			carry = res/10;
			String temp = "" + res;
			if (f > 0) {
				deque.addFirst("" +temp.charAt(temp.length()-1));
			} else {
				deque.addFirst(temp);
			}
			f--;
		}
		
		while (s >=0) {
			int se = Integer.parseInt("" + second.charAt(s));
			int res = se + carry;
			carry = res/10;
			String temp = "" + res;
			if (s > 0) {
				deque.addFirst("" +temp.charAt(temp.length()-1));
			} else {
				deque.addFirst(temp);
			}
			s--;
		}
		
		while(!deque.isEmpty()) {
			System.out.print(deque.remove());
		}
	}
}
