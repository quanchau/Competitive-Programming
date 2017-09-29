import java.util.*;
public class Server {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i ==n) {
				System.out.println(i);
				break;

			}
			int num = in.nextInt();
			t -= num;
			if (t < 0) {
				System.out.println(i);
				break;
			}
		}
	}

}
