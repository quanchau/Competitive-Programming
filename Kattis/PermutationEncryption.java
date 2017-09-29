import java.util.*;
public class PermutationEncryption {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) {
				break;
			}
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			in.nextLine();
			String s = in.nextLine();
			while (s.length()%n != 0) {
				s += " ";
			}
			int num = s.length()/n;
			int ind = 0;
			System.out.print("'");
			while (ind < num) {
				for (int i = 0; i < n; i++) {
					System.out.print(s.charAt(arr[i]-1 + ind*n));
				}
				ind++;
			}
			System.out.print("'");
			System.out.println();
		}
	}
}
