import java.util.*;
public class EngineeringEnglish {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<String> list = new HashSet<String>();
		while(in.hasNext()) {
			String s = in.next();
			String s1 = s.toLowerCase();
			if (!list.contains(s1)) {
				System.out.print(s + " ");
				list.add(s1);
			} else {
				System.out.print(". ");
			}
		}
	}
}
