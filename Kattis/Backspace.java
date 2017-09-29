import java.util.*;

public class Backspace {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		Stack<Character> deque = new Stack<Character>();
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i)== '<') {
				deque.pop();
			} else {
				deque.push(s.charAt(i));
			}
		}
		
		StringBuffer buffer = new StringBuffer();
		while(!deque.isEmpty()) buffer.append(deque.pop());
		System.out.println(buffer.reverse().toString());
	}
}
