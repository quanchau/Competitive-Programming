import java.util.*;
public class WorkingAtTheRestaurant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int n = in.nextInt();
			if (n == 0) break;
			int s1 = 0;
			int s2 = 0;
			StringBuffer buffer = new StringBuffer();
			for (int i = 0; i < n; i++) {
				String s = in.next();
				int x = in.nextInt();
				if (s.equals("DROP")) {
					s2 += x;
					buffer.append("DROP 2 " + x + "\n");
				} else {
							if (s1 >= x) {
								buffer.append("TAKE 1 " + x + "\n");
								s1 = s1-x;
								x = 0;
							} else {
								if (s1>0)buffer.append("TAKE 1 " + s1 + "\n");
								x = x - s1;
								s1 = s2;
								buffer.append("MOVE 2->1 " + s2 + "\n");
								s2 = 0;
								buffer.append("TAKE 1 " + x + "\n");
								s1 = s1-x;
								x = 0;
							}



					
				}
			

			}
			System.out.print(buffer);
			System.out.println();
		}
	}



}
