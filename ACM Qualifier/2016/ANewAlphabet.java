
import java.util.*;
public class ANewAlphabet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] arr = {"@", "8", "(", "|)", "3", "#", "6", "[-]", "|", "_|", "|<", "1", "[]\\/[]", "[]\\[]", "0", "|D", "(,)", "|Z", "$", "']['", "|_|", "\\/", "\\/\\/", "}{", "`/", "2"};
		String s = in.nextLine();
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <='Z') {
				 res.append(arr[s.charAt(i)-'A']);
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				res.append(arr[s.charAt(i)-'a']);
			} else {
				res.append("" + s.charAt(i));
			}
		}
		System.out.println(res.toString());
		}
	}

