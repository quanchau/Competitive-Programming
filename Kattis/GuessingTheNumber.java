import java.util.*;
public class GuessingTheNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int start = 1;
		int end = 1001;
		int chosen = (start + end)/2;
		System.out.println(chosen);
		while (in.hasNext()) {
			String s = in.next();
			if (s.equals("lower")) {
				end = chosen;
				chosen = (start + end)/2;
			} else if (s.equals("higher")) {
				start = chosen;
				chosen = (start + end)/2;
			} else {
				break;
			}
			System.out.println(chosen);
			
		}
	}
}
